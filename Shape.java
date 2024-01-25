public class Shape {
    private String color;
    private boolean filled;


    public Shape(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Color " + this.color + ". Filled: " + this.filled)
        ;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }









}
