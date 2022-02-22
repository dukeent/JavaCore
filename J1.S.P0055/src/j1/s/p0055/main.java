/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManageDoctor mn = new ManageDoctor();
        ArrayList<Doctor> dlist = new ArrayList<>();
        while(true){
            int choice = mn.menu();
            switch(choice){
                case 1:
                    mn.addDoctor(dlist);
                    break;
                case 2:
                    mn.updateDoctor(dlist);
                    break;
                case 3:
                    mn.deleteDoctor(dlist);
                    break;
                case 4:
                    mn.searchDoctor(dlist);
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
