
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        EmployeeManagement mn = new EmployeeManagement();
        
        ArrayList<Employee> list = new ArrayList<>();
        while(true){
            int choice = mn.menu();
            switch(choice){
                case 1:
                    mn.addEmployee(list);
                    break;
                case 2:
                    mn.updateEmployee(list);
                    break;
                case 3:
                    mn.deleteEmployee(list);
                    break;
                case 4:
                    mn.searchEmployee(list);
                    break;
                case 5:
                    mn.sortEmployee(list);
                    break;
                case 6:    
                    return;
            }
        }
    }
    
}
