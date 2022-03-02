package Validation;

import java.util.Scanner;

public class Validation {
    private final Scanner sc = new Scanner(System.in);

    public int getInt(int min, int max, String msg) {
        int i;
        do {
            try {
                System.out.println(msg);
                i = Integer.parseInt(sc.nextLine().trim());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter valid number!");
            }
        } while (true);
        return i;
    }

    public float getFloat(double min, double max, String msg) {
        double i;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                i = Double.parseDouble(sc.nextLine().trim());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        return (float) i;
    }

    public String getString(String msg) {
        String str;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                str = sc.nextLine().trim().replaceAll("\\s+", " ");
                if (!str.isEmpty()) {
                    break;
                } else {
                    System.out.println("Please enter String");
                }
            } catch (Exception e) {
                System.out.println("Please enter String");
            }
        } while (true);
        return str;
    }
}
