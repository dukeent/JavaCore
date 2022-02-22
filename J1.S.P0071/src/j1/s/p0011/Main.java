/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TaskManagement mn = new TaskManagement();
        ArrayList<Task> list = new ArrayList<>();
        while(true){
            int choice = mn.menu();
            switch(choice){
                case 1:
                    mn.addTask(list);
                    break;
                case 2:
                    mn.updateTask(list);
                    break;
                case 3:
                    mn.deleteTask(list);
                    break;
                case 4:
                    mn.displayTask(list);
                    break;
                case 5:
                    return;
                case 6:    
                    return;
            }
        }
    }
    
}
