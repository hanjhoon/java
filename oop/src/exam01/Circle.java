package exam01;

public class Circle {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
