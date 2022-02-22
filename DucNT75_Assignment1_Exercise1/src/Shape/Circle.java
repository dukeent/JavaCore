package Shape;

public class Circle extends Shape{

    private double radius;
    private final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printResult() {
        System.out.println("-------------Circle-------------");
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (this.radius * 2 * PI);
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius * PI);
    }
}
