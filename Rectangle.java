public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String s, boolean b, double l, double w) {
        super(s, b);
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double w) {
        this.width = w;
    }


    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return ((2*this.length) + (2*this.width));
    }

}
