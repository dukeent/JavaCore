/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class ManageDoctor {
    Validation val = new Validation();
    
    public int menu(){
        //Hien thi menu
        System.out.println("========= Doctor Management ==========");
        System.out.println( "1.	Add Doctor\n" +
                            "2.	Update Doctor\n" +
                            "3.	Delete Doctor\n" +
                            "4.	Search Doctor\n" +
                            "5.	Exit ");
        System.out.println("======================================");
        System.out.println("Please choice one option: ");
        // yeu cau nguoi dung chon tu 1 den 5
        int i = val.getInt(1, 5);
        return i;
    }
    
    //Tim va tra ve vi tri du lieu cua du lieu can tim trong Database
    public int checkExist(ArrayList<Doctor> dlist, String code){
        for (int i = 0; i < dlist.size(); i++) {
            if(dlist.get(i).getCode().equalsIgnoreCase(code)){
                return i;
            }
        }
        return -1;
    }
    
    //Function 1:
    public void addDoctor(ArrayList<Doctor> dlist){
        System.out.println("--------- Add Doctor ----------");
        //Enter code:
        System.out.println("Enter code: ");
        //Kiem tra code trung
        String code;
        do {            
            code = val.getString();
            //Kiem tra xem code co bi trung ( duplicate ) hay khong
            if(checkExist(dlist, code) >=0 ){
                System.out.println("This code is already exist. Please enter again!");
            }
            else{
                break;
            }
        } while (true);
        //Enter name:
        System.out.println("Enter name: ");
        String name = val.getString();
        //Enter specialization
        System.out.println("Enter specialization: ");
        String specialization = val.getString();
        //Enter availability
        System.out.println("Enter availability");
        int availability = val.getInt(0, Integer.MAX_VALUE);
        //add vao arraylist
        dlist.add(new Doctor(code, name, specialization, availability));
        System.out.println("Add successful!");
    }
    
    //Function 2:
    public void updateDoctor(ArrayList<Doctor> dlist){
        System.out.println("--------- Update Doctor -------");
        System.out.println("Enter code: ");
        //Nhap vao code va kiem tra
        String code;
        //khai bao vi tri
        int index;
        do {
            code = val.getString();
            //kiem tra vi tri cua Code vua nhap vao trong database
            index = checkExist(dlist, code);
            //Kiem tra xem code co du lieu trong database hay khong
            //neu tim duoc thi update
            //neu khong tim duoc thi nhap lai
            if(index >=0 ){
                break;
            }
            else{
                System.out.println("This code doesn't exist! Please enter again!");
            }
        } while (true);
        
        //Update name theo vi tri index vua tim duoc: 
        System.out.println("Enter name: ");
        String name = val.getString();
        dlist.get(index).setName(name);
        
        //Update specialization theo vi tri index vua tim duoc: 
        System.out.println("Enter specialization: ");
        String specialization = val.getString();
        dlist.get(index).setSpecialization(specialization);
        
        //Update availability theo vi tri index vua tim duoc: 
        System.out.println("Enter availability: ");
        int availability = val.getInt(0, Integer.MAX_VALUE);
        dlist.get(index).setAvailability(availability);
    }
    
    //du lieu ban dau
    // A B C D
    // A: duc,asdad,1441,1241
    // B: anh, agvsad, 3123,33123
    // C: bua, adadad, 123123 , 13213
    // D: ok, adasd, 123123, asdadasd
    
    //du lieu sau khi update
    //ok => tim thay thang D o tri thu 3 ( index = 3)
    //Nhap bvbvb, 0, 0
    //list.get(3) = D
    //D: ok, bvbvb, 0, 0
    
    //du lieu sau khi update
    // A: duc,asdad,1441,1241
    // B: anh, agvsad, 3123,33123
    // C: bua, adadad, 123123 , 13213
    // D: ok, bvbvb, 0, 0
    
    public void deleteDoctor(ArrayList<Doctor> dlist){
        System.out.println("--------- Delete Doctor -------");
        System.out.println("Enter Code: ");
//        String code;
        //khai bao vi tri
        int index;
        String code = val.getString();
            //kiem tra vi tri cua Code vua nhap vao trong database
        index = checkExist(dlist, code);
            //Kiem tra xem code co du lieu trong database hay khong
            //neu tim duoc thi xoa
            //neu khong tim duoc thi nhap lai
        if(index >=0 ){
                dlist.remove(index);
        }
        else{
            System.out.println("This code doesn't exist!");
        }
    }
    public void searchDoctor(ArrayList<Doctor> dlist){
        System.out.println("--------- Search Doctor -------");
        Scanner sc = new Scanner(System.in);
        //khong dung validation vi validation khong cho nhap null
        System.out.println("Enter text: ");
        String text = sc.nextLine().toLowerCase();
        int flag = 0;
        System.out.printf("%-20s%-20s%-20s%-20s\n","Code","Name","Specialization","Availability");
        if(text.isEmpty()){
            for (int i = 0; i < dlist.size(); i++) {
                dlist.get(i).display();
            }
        }
        else{
            for (int i = 0; i < dlist.size(); i++) {
                if(dlist.get(i).getCode().toLowerCase().contains(text) 
                    || dlist.get(i).getName().toLowerCase().contains(text) 
                    || dlist.get(i).getSpecialization().toLowerCase().contains(text)){
                    dlist.get(i).display();
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("No result!");
            }
        }
    }
}


//DOC 1 	Nghia 		Orthopedics	    		3
//DOC 2         Phuong		Obstetrics	       		2
//DOC 3 	Lien 		orthodontic	    		1
