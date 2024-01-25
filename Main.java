public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle("blue", true, 5);
        shapes[1] = new Rectangle("green", true, 40, 5);
        shapes[2] = new Triangle("red", true, 10, 6, 5);
        shapes[3] = new Square("white", true, 30);
        shapes[4] = new Pentagon("black", true, 10);
        shapes[5] = new House("orange", true, 20);

        System.out.println("Perimeters:");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculatePerimeter());
        }

        System.out.println("Areas:");
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }


    }
}