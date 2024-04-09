public class Property {
    private String propertyName;
    private String city;
    private String owner;
    private double rentAmount;
    private Plot plot;

    public Property(String propertyName, String city, String owner, double rentAmount, Plot plot) {
        this.propertyName = propertyName;
        this.city = city;
        this.owner = owner;
        this.rentAmount = rentAmount;
        this.plot = plot;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getCity() {
        return city;
    }

    public String getOwner() {
        return owner;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public Plot getPlot() {
        return plot;
    }

    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}
