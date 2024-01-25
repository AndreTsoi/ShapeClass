public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String s, boolean b,double first, double second, double third) {
        super(s, b);
        this.side1 = first;
        this.side2 = second;
        this.side3 = third;
    }


    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return getSide3();
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    @Override
    public double calculateArea() {
        double s = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }

    @Override
    public double calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }



}
