package Validation;

import Entity.Operator;

import java.util.Scanner;

public class Validation {
    private final Scanner sc = new Scanner(System.in);

    public double getDouble(double min, double max, String msg, String err) {
        double i;
        do {
            System.out.println(msg);
            try {
                i = Double.parseDouble(sc.nextLine().trim());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println(err);
            }
        } while (true);
        return i;
    }

    public Operator checkOperator() {
        do {
            System.out.println("Enter Operator: ");
            String operator = sc.nextLine().trim();
            if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-")
                    || operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")
                    || operator.equalsIgnoreCase("^") || operator.equalsIgnoreCase("=")) {
                return new Operator(operator);
            } else {
                System.out.println("Please input : +, -, *, /, ^");
            }
        } while (true);
    }
}
