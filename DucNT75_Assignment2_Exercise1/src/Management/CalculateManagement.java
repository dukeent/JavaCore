package Management;

import Entity.BMI;
import Entity.Operator;
import Validation.Validation;

public class CalculateManagement {
    Validation val = new Validation();

    public int Menu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        return (int) val.getDouble(1, 3, "Please choice one option: ", "Option is Digit");
    }

    public double calculate(double a, Operator operator, double b) {
        switch (operator.getOperator()) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                return 0;
        }
    }
    public BMI calculateBMI(double weight, double height) {
        double bmiNumber = weight * 10000 / (height * height);
        if (bmiNumber < 19) {
            return new BMI(bmiNumber, "UNDER STANDARD");
        } else if (bmiNumber >= 19 && bmiNumber < 25) {
            return new BMI(bmiNumber, "STANDARD");
        } else if (bmiNumber >= 25 && bmiNumber < 30) {
            return new BMI(bmiNumber, "OVERWEIGHT");

        } else if (bmiNumber >= 30 && bmiNumber < 40) {
            return new BMI(bmiNumber, "FAT! Should lose weight!");
        } else {
            return new BMI(bmiNumber, "VERY FAT!! Should lose weight immediately!");
        }
    }

    public void BMIProgram() {
        System.out.println("----- BMI Calculator -----");
        double weight = val.getDouble(0, 10000, "Enter Weight (kg): ", "BMI is Digit");
        double height = val.getDouble(0, 10000, "Enter Height (cm): ", "BMI is Digit");
        BMI bmi = calculateBMI(weight, height);
        bmi.display();
    }

    public void normalProgram() {
        System.out.println("----- Normal Calculator -----");
        double memory = val.getDouble(Double.NEGATIVE_INFINITY, Double.MAX_VALUE, "Enter number: ", "Number only");
        while (true) {
            Operator op = val.checkOperator();
            if (op.getOperator().equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                break;
            }
            if (op.getOperator().equalsIgnoreCase("/")) {
                double b;
                do {
                    b = val.getDouble(Double.NEGATIVE_INFINITY, Double.MAX_VALUE, "Enter number: ", "Number only");
                    if (b == 0) {
                        System.out.println("Cannot divided by 0! Please enter again!");
                    } else {
                        break;
                    }
                } while (true);
                memory = calculate(memory, op, b);
                System.out.println("Memory: " + memory);
            } else {
                memory = calculate(memory, op, val.getDouble(Double.NEGATIVE_INFINITY, Double.MAX_VALUE, "Enter number: ", "Number only"));
                System.out.println("Memory: " + memory);
            }
        }
    }
}
