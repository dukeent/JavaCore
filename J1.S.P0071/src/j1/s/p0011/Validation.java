/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Validation {
    private static final String PLAN_VALID = "^([0-9]{1,2}\\.0)|([0-9]{1,2}\\.5)$";
    // Kiem tra du lieu dau vao cua kieu du lieu int
    public int getInt(int min, int max) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                // nhap vao so i
                i = Integer.parseInt(sc.nextLine());
                // Kiem tra dieu kien, neu dung thi break
                // neu sai thi bat nguoi dung nhap lai
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
                //Bat number exception cho den khi nguoi dung nhap dung thi thoi
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        return i;
    }

    // Kiem tra du lieu dau vao cua kieu du lieu double
    public double getDouble(double min, double max) {
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                i = Double.parseDouble(sc.nextLine());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        return i;
    }

    // Kiem tra du lieu dau vao cua kieu du lieu float
    public float getFloat(double min, double max) {
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                i = Double.parseDouble(sc.nextLine());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        // ep kieu double tra ve float
        return (float) i;
    }

    // Kiem tra du lieu dau vao cua kieu du lieu String
    public String getString() {
        String str = "";
        Scanner sc = new Scanner(System.in);
        do {
            try {
                //kiem tra String rong hay khong
                str = sc.nextLine();
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
    
    public String GetDate(){
        //new pattern: MMM-dd-yyyy
        Date date = new Date();        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        boolean loop = true;
        do
        {
            try
            {
                //30/05/1999
                String sDate = sc.next();
                date = sdf.parse(sDate);  
                loop = false;
            }
            catch (ParseException e) {
                System.out.println("Please enter right format of date (dd/MM/yyyy)");
           }
        }while(loop);
        return sdf.format(date);       
    }
    
    
    
    public double getInputPlan(double min, double max, String err) {
        while (true) {
            String result = getString();
            try {
                double time = Double.parseDouble(result);
                if (time >= min && time <= max && (time % 0.5 == (int)time % 0.5) ) {
                    return time;
                } else {
                    System.out.println(err);
                    System.out.print("Re-input: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Time must be 8.0, 8.5, 9.0, ...");
                System.out.print("Enter again: ");
            }
        }
    }
}
