package com.company;


import Management.CalculateManagement;


public class Main {

    public static void main(String[] args) {
	// write your code here
        CalculateManagement cm = new CalculateManagement();
        while(true){
            int choice = cm.Menu();
            switch(choice){
                case 1:
                    cm.normalProgram();
                    break;
                case 2:
                    cm.BMIProgram();
                    break;
                case 3:
                    return;
            }
        }
    }
}
