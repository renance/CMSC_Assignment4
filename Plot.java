public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public boolean encompasses(Plot plot) {
        return this.x <= plot.x && this.y <= plot.y && (this.x + this.width) >= (plot.x + plot.width) && (this.y + this.depth) >= (plot.y + plot.depth);
    }

    public boolean overlaps(Plot plot) {
        return (this.x < plot.x + plot.width && this.x + this.width > plot.x &&
                this.y < plot.y + plot.depth && this.y + this.depth > plot.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Plot[x=" + x + ", y=" + y + ", width=" + width + ", depth=" + depth + "]";
    }
}
