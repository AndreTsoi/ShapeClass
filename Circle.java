public class Circle extends Shape {

    private double radius;

    public Circle(String s, boolean b, double r) {
        super(s, b);
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0*Math.PI*this.radius;
    }








}
