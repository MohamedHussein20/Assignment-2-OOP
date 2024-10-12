public class Task2 {
    public static class Shape {
        String color;

        double getArea() {
            return 0;
        }
    }

    public static class Rectangle extends Shape {
        private final double width;
        private final double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double getArea() {
            return width * height;
        }
    }

    public static class Triangle extends Shape {
        private final double base;
        private final double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double getArea() {
            return 0.5 * base * height;
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(6, 8);

        double rectangleArea = rectangle.getArea();
        double triangleArea = triangle.getArea();

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }

}
