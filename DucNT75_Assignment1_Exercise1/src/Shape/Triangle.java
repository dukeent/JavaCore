package Shape;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public void printResult() {
        System.out.println("-------------Triangle-------------");
        System.out.println("Side A: " + this.sideA);
        System.out.println("Side B: " + this.sideB);
        System.out.println("Side C: " + this.sideC);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (this.getSideA() + this.getSideB() + this.getSideC());
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        double ss = p*(p-this.sideA)*(p-this.sideB )*(p-this.sideC);
        return Math.sqrt(ss);
    }
}
