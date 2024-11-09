public class TestSimpleCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle with radius " + circle1.getRadius() + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle with radius " + circle2.getRadius() + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle with radius " + circle3.getRadius() + " is " + circle3.getArea());
    }
}

class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    double getRadius() {
        return radius;
    }
}