package w12t6;

public class CircleWithPrivateDataFields {
    private double radius;

    public CircleWithPrivateDataFields(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}