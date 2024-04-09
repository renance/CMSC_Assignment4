public class ManagementCompany {
    private static final int MAX_PROPERTY = 5;
    private static final int MGMT_DEPTH = 10;
    private static final int MGMT_WIDTH = 10;

    private String name;
    private String taxID;
    private Property[] properties;
    private Plot plot;
    private int propertyCount;

    public ManagementCompany(String name, String taxID) {
        this.name = name;
        this.taxID = taxID;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.propertyCount = 0;
    }

    public ManagementCompany(String name, String taxID, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(x, y, width, depth);
        this.propertyCount = 0;
    }

    public int addProperty(Property property) {
        if (property == null || propertyCount == MAX_PROPERTY)
            return -1;

        if (!plot.encompasses(property.getPlot()))
            return -2;

        for (int i = 0; i < propertyCount; i++) {
            if (properties[i] != null && properties[i].getPlot().overlaps(property.getPlot()))
                return -3;
        }

        properties[propertyCount++] = property;
        return propertyCount - 1;
    }

   
}
