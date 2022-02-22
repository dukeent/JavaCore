package Validation;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Triangle;

import java.util.Scanner;

public class Validation {

    public static double getNumber(String msg) {
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                i = Double.parseDouble(sc.nextLine());
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

    public Rectangle getRectangle(){
        do{
            double width = Validation.getNumber("Please input side width of Rectangle: ");
            double length = Validation.getNumber("Please input length of Rectangle: ");
            if(width < length){
                Rectangle r = new Rectangle(width,length);
                return r;
            }
            else{
                System.out.println("Length must be Greater than Width! Please Re-enter Length and Width!");
            }
        }while(true);
    }

    public Circle getCircle(){
            double radius = Validation.getNumber("Please input radius of Circle: ");
            Circle c = new Circle(radius);
            return c;
    }

    public static boolean checkTriangle(double a, double b, double c){
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        } else {
            return true;
        }
    }
    public Triangle getTriangle(){
        do{
            double sideA = Validation.getNumber("Please input side A of Triangle: ");
            double sideB = Validation.getNumber("Please input side B of Triangle: ");
            double sideC = Validation.getNumber("Please input side C of Triangle: ");
            if(checkTriangle(sideA,sideB,sideC)){
                Triangle t = new Triangle(sideA,sideB,sideC);
                return t;
            }
            else{
                System.out.println("Invalid Triangle! Please Re-enter Side of Triangle!");
            }
        }while(true);
    }
}
