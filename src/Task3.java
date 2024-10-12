public class Task3 {
    abstract class Shape {
        String color;
        abstract double getArea();
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double getArea() {
            return width * height;
        }
    }

    class Triangle extends Shape {
        private double base;
        private double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double getArea() {
            return 0.5 * base * height;
        }
    }
        public void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);
            Triangle triangle = new Triangle(6, 8);

            double rectangleArea = rectangle.getArea();
            double triangleArea = triangle.getArea();

            System.out.println("Rectangle Area: " + rectangleArea);
            System.out.println("Triangle Area: " + triangleArea);
        }

}
