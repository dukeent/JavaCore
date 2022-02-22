
import java.util.ArrayList;
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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        ArrayList<EastAsiaCountries> alist = new ArrayList<>();
        while(true){
            int choice = mn.menu();
            switch(choice){
                case 1:
                    mn.addCountryInformation(alist); 
                    break;
                case 2:
                    mn.getRecentlyEnteredInformation(alist);
                    break;
                case 3:
                    mn.searchInformationByName(alist);
                    break;
                case 4:
                    mn.sortInformationByAscendingOrder(alist);
                    break;
                case 5:
                    return;
            }
        }
              
    }
    
}
