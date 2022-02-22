package Shape;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void printResult() {
        System.out.println("-------------Rectangle-------------");
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return ((this.width + this.length) * 2);
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }
}
