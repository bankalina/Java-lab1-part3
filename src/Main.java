public class Main {
    public static void main(String[] args) {
        ShapeDescriber describer = new ShapeDescriber();

        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle:");
        describer.describe(rectangle);
        rectangle.print();

        System.out.println("\nTriangle:");
        describer.describe(triangle);
        triangle.print();
    }
}
