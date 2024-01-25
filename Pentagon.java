public class Pentagon extends Shape {

    private double side;

    public Pentagon(String c, boolean b, int side) {
        super(c, b);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(5*(5+2*Math.sqrt(5)))*this.side*this.side*0.25);
    }

    @Override
    public double calculatePerimeter() {
        return 5.0 * this.side;
    }

    public void setSide(double d) {
        this.side = d;
    }

    public double getSide() {
        return this.side;
    }






}
