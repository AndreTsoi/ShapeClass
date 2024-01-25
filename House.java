public class House extends Shape{
    private Square base;
    private Triangle roof;
    public House(String f, boolean b, double length) {
        super(f, b);
        base = new Square(f, b, length);
        roof = new Triangle(f, b, length, length, length);
    }

    @Override
    public double calculateArea() {
        return this.base.calculateArea() + this.roof.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return base.getLength() * 5;
    }

    public double getSize() {
        return base.getLength();
    }

    public void setSize(double size) {
        base = new Square(this.getColor(), this.getFilled(), size);
        roof = new Triangle(this.getColor(), this.getFilled(), size, size, size);
    }

}
