
import java.util.ArrayList;
import java.util.Collections;
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
public class ManageEastAsiaCountries {
    Validation val = new Validation();
    
    //Kiem tra trung lap va tra ve vi tri bi trung
    public int checkExistID(ArrayList<EastAsiaCountries> alist, String code){
        //Chay tu dau den cuoi mang, neu trung thi tra ve vi tri bi trung
        for (int i = 0; i < alist.size(); i++) {
            if(alist.get(i).getCountryCode().equalsIgnoreCase(code)){
                return i;
            }
        }
        // Neu khong trung thi tra ve -1
        return -1;
    }
    
    public int menu(){
        //Hien thi menu
        System.out.println("==========================================================================");
        System.out.println( "1. Input the information of 11 countries in East Asia\n" +
                            "2. Display the information of country you've just input\n" +
                            "3. Search the information of country by user-entered name\n" +
                            "4. Display the information of countries sorted name in ascending order  \n" +
                            "5. Exit ");
        System.out.println("==========================================================================");
        System.out.println("Please choice one option: ");
        // yeu cau nguoi dung chon tu 1 den 5
        int i = val.getInt(1, 5);
        return i;
    }
    
//    public void addCountryInformation(ArrayList<EastAsiaCountries> alist){
//        if(alist.size() > 11){
//            System.out.println("Can't add more. East Asia Countries only has only 11 countries");
//        }
//        else{
//            System.out.println("Enter country code: ");
//            String code = val.getString();
//            System.out.println("Enter country name: ");
//            String name = val.getString();
//            System.out.println("Enter total Area: ");
//            float area = val.getFloat(0, Double.POSITIVE_INFINITY);
//            alist.add(new EastAsiaCountries(code, code, name, area));
//        }
//    }
    
    public void addCountryInformation(ArrayList<EastAsiaCountries> alist){
        //Neu nhap qua 11 nuoc thi se khong cho nhap nua
        if(alist.size() > 11){
            System.out.println("Can't add more. East Asia Countries only has only 11 countries");
        }
        //Nhap du lieu cac nuoc
        else{
            //Kiem tra code co bi trung hay khong
            String code;
            while (true) {                
                System.out.println("Enter country code: ");
                code = val.getString();
                //Neu bi trung thi tra ve 1 so >= 0 va bat nguoi dung nhap lai
                //neu khong trung thi tra ve -1 va break vong while
                if(checkExistID(alist, code) >= 0 ){
                    System.out.println("This country already exist");
                }
                else{
                    break;
                }
            }
            System.out.println("Enter country name: ");
            String name = val.getString();
            System.out.println("Enter total Area: ");
            float area = val.getFloat(0, Double.POSITIVE_INFINITY);
            System.out.println("Enter terrain of country: ");
            String terrain = val.getString();
            //them du lieu cua object vao arraylist
            alist.add(new EastAsiaCountries(code, name, area, terrain));
        }
    }
    
    public void getRecentlyEnteredInformation(ArrayList<EastAsiaCountries> alist){
        if(alist.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.printf("%-20s%-20s%-20s%-20s\n","ID", "Name", "Total Area","Terrain");
            for (int i = 0; i < alist.size(); i++) {
                alist.get(i).display();
            }  
        }

    }

    public void	searchInformationByName(ArrayList<EastAsiaCountries> alist){
        //Nhap ten can search vao
        System.out.println("Enter the name you want to search for: ");
        Scanner sc = new Scanner(System.in);
        //khong dung validation vi validation khong cho nhap null
        String name = sc.nextLine().toLowerCase();
        // tao 1 danh dau
        int flag = 0;
        //Kiem tra trong list, neu co thi in ra, neu khong thi canh bao
        System.out.printf("%-20s%-20s%-20s%-20s\n","ID", "Name", "Total Area","Terrain");
        for (int i = 0; i < alist.size(); i++) {
            if(alist.get(i).getCountryName().equalsIgnoreCase(name)){
                alist.get(i).display();
                //neu ma tim thay thi danh dau = 1
                flag = 1;
                //neu khong tim thay thi danh dau van = 0
            }
        }
        if(flag == 0){
            System.out.println("No Result!");
        }
    }
    
    public void sortInformationByAscendingOrder(ArrayList<EastAsiaCountries> alist){
        System.out.printf("%-20s%-20s%-20s%-20s\n","ID", "Name", "Total Area","Terrain");
        Collections.sort(alist);
        for (int i = 0; i < alist.size(); i++) {
            alist.get(i).display();
        }
    }
    
}

