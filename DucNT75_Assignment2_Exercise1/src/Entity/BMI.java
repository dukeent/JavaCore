package Entity;

public class BMI {
    private double bmiNumber;
    private String bmiStatus;

    public BMI() {
    }

    public BMI(double bmiNumber) {
        this.bmiNumber = bmiNumber;
    }

    public BMI(double bmiNumber, String bmiStatus) {
        this.bmiNumber = bmiNumber;
        this.bmiStatus = bmiStatus;
    }

    public double getBmiNumber() {
        return bmiNumber;
    }

    public void setBmiNumber(double bmiNumber) {
        this.bmiNumber = bmiNumber;
    }

    public String getBmiStatus() {
        return bmiStatus;
    }

    public void setBmiStatus(String bmiStatus) {
        this.bmiStatus = bmiStatus;
    }

    public void display() {
        System.out.printf("BMI Number: %.2f\n", getBmiNumber());
        System.out.println("BMI Status: " + getBmiStatus());
    }
}
