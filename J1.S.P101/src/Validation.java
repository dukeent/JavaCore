
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG STRIX
 */

public class Validation {
    // Regex cua email va phone
    private final static String EMAIL_PATTERN = "^[A-Za-z]\\w+@\\w+(\\.\\w+){1,3}$";
    private final static String PHONE_PATTERN = "^[0-9]{10}$";
    // Kiem tra du lieu dau vao cua kieu du lieu int
    public int getInt(int min, int max){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {           
            try {
               // nhap vao so i
               i = Integer.parseInt(sc.nextLine());
               // Kiem tra dieu kien, neu dung thi break
               // neu sai thi bat nguoi dung nhap lai
               if(i >= min && i <= max){
                    break;
               }
               else{
                   System.out.println("Please enter number in range of " + min + " - " + max);
               }
             //Bat number exception cho den khi nguoi dung nhap dung thi thoi
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!");
            }                       
        } while (true);         
        return i;
    }
    // Kiem tra du lieu dau vao cua kieu du lieu double
    public double getDouble(double min, double max){
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {           
            try {                
               i = Double.parseDouble(sc.nextLine());
               if(i >= min && i <= max){
                    break;
               }
               else{
                   System.out.println("Please enter number in range of " + min + " - " + max);
               }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!");
            }                       
        } while (true);         
        return i;
    }
    // Kiem tra du lieu dau vao cua kieu du lieu float
    public float getFloat(double min, double max){
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {           
            try {                
               i = Double.parseDouble(sc.nextLine());
               if(i >= min && i <= max){
                    break;
               }
               else{
                   System.out.println("Please enter number in range of " + min + " - " + max);
               }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!");
            }                       
        } while (true);
        // ep kieu double tra ve float
        return (float) i;
    }
    // Kiem tra du lieu dau vao cua kieu du lieu String
    public String getString(){
        String str = "";
        Scanner sc = new Scanner(System.in);
        do {           
            try {    
               //kiem tra String rong hay khong
               str = sc.nextLine();
               if(!str.isEmpty()){
                    break;
               }
               else{
                   System.out.println("Please enter String");
               }
            } catch (Exception e) {
                System.out.println("Please enter String");
            }                       
        } while (true);         
        return str;
    }
    
    public String GetDate(){
        Date date = new Date();        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        //false: 29/02/111 => sai
        //true: 29/02/xxx => 1/3/xx
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
    
    public String getEmail(){
        Scanner sc = new Scanner(System.in);
        String str;
        do{
            try {
                str = sc.nextLine();
                if(str.matches(EMAIL_PATTERN)){
                    return str;
                }
                else {
                    System.out.println("Please enter right email format!");
                }
            } catch (Exception e) {
                System.out.print(e);
            }
        }while(true);
    }
    
    public String getPhoneNumber(){
        Scanner sc = new Scanner(System.in);
        String str;
        do{
            try {
                str = sc.nextLine();
                if(str.matches(PHONE_PATTERN)){
                    return str;
                }
                else {
                    System.out.println("Please enter right phone format! (Ex: 0963974475)");
                }
            } catch (Exception e) {
                System.out.print(e);
            }
        }while(true);
    }
    public String GetGender() {
        String s;
        Scanner sc = new Scanner(System.in);
        do {
            s = sc.nextLine();
            if (s.isEmpty()){
                System.out.println("Please enter something!");
            }
            else {
                if (s.equalsIgnoreCase("Male") || s.equalsIgnoreCase("Female")){
                    return s;
                }
                else{
                    System.out.println("Please enter Male or Female");
                }
            }
        }while(true);
    }
    
}
