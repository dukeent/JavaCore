package Validation;

import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static int  getInt(String msg) {
        int i;
        do {
            try {
                System.out.println(msg);
                i = Integer.parseInt(sc.nextLine());
                if (i < 0) {
                    System.out.println("Please enter Positive number!");
                } else {
                    return i;
                }
            } catch (Exception e) {
                System.out.println("Please enter Valid Number!");
            }
        } while (true);
    }

}
