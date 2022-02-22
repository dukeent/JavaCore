package com.company;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Triangle;
import Validation.Validation;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Validation val = new Validation();
        System.out.println("========== Calculator Shape Program ==========");

        Rectangle r = val.getRectangle();
        Circle c = val.getCircle();
        Triangle t = val.getTriangle();

        r.printResult();
        c.printResult();
        t.printResult();
    }
}
