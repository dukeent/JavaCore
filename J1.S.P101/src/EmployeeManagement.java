
import java.util.ArrayList;
import java.util.Collection;
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
public class EmployeeManagement {

    Validation val = new Validation();

    public int findExistID(ArrayList<Employee> list, int id) {
        //Chay tu dau den cuoi mang, neu trung thi tra ve vi tri bi trung
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        // Neu khong trung thi tra ve -1
        return -1;
    }

    public int menu() {
        //Hien thi menu
        System.out.println("==========================================================================");
        System.out.println("1. Add employees \n"
                + "2. Update employees\n"
                + "3. Remove employees\n"
                + "4. Search employees\n"
                + "5. Sort employees by salary\n"
                + "6. Exit");
        System.out.println("==========================================================================");
        System.out.println("Please choice one option: ");
        // yeu cau nguoi dung chon tu 1 den 5
        int i = val.getInt(1, 5);
        return i;
    }

    public void addEmployee(ArrayList<Employee> list) {
        System.out.println("--------------- Add Employee ---------------");
        int id;
        do {
            System.out.println("Enter ID: ");
            id = val.getInt(0, Integer.MAX_VALUE);
            if (findExistID(list, id) >= 0) {
                System.out.println("This ID is already exist!");
            } else {
                break;
            }
        } while (true);
        System.out.println("Enter first name: ");
        String firstName = val.getString();
        System.out.println("Enter last name: ");
        String lastName = val.getString();
        System.out.println("Enter phone name: ");
        String phone = val.getPhoneNumber();
        System.out.println("Enter email: ");
        String email = val.getEmail();
        System.out.println("Enter address: ");
        String address = val.getString();
        System.out.println("Enter date of birth (dd/MM/yyyy): ");
        String dob = val.GetDate();
        System.out.println("Enter gender (Male/Female): ");
        String gender = val.GetGender();
        System.out.println("Enter salary: ");
        double salary = val.getDouble(0, Double.POSITIVE_INFINITY);
        System.out.println("Enter agency: ");
        String agency = val.getString();
        list.add(new Employee(id, firstName, lastName, phone, email, address, dob, gender, salary, agency));
        System.out.println("Add Successfull!!");

    }

    public void updateEmployee(ArrayList<Employee> list) {
        System.out.println("--------------- Add Employee ---------------");
        int id;
        int index;
        do {
            System.out.println("Enter ID: ");
            id = val.getInt(0, Integer.MAX_VALUE);
            index = findExistID(list, id);
            if (index >= 0) {
                
                break;
            } else {
                System.out.println("This ID isn't exist!");
            }
        } while (true);
        System.out.println("Enter first name: ");
        String firstName = val.getString();
        list.get(index).setFirstName(firstName);
        
        System.out.println("Enter last name: ");
        String lastName = val.getString();
        list.get(index).setLastName(lastName);
        
        System.out.println("Enter phone name: ");
        String phone = val.getPhoneNumber();
        list.get(index).setPhone(phone);
        
        System.out.println("Enter email: ");
        String email = val.getEmail();
        list.get(index).setEmail(email);
        
        System.out.println("Enter address: ");
        String address = val.getString();
        list.get(index).setAddress(address);
        
        System.out.println("Enter date of birth (dd/MM/yyyy): ");
        String dob = val.GetDate();
        list.get(index).setDob(dob);
        
        System.out.println("Enter gender (Male/Female): ");
        String gender = val.GetGender();
        list.get(index).setGender(gender);
        
        System.out.println("Enter salary: ");
        double salary = val.getDouble(0, Double.POSITIVE_INFINITY);
        list.get(index).setSalary(salary);
        
        System.out.println("Enter agency: ");
        String agency = val.getString();
        list.get(index).setAgency(agency);
        
        System.out.println("Update Successfull!!");
    }
    
    public void deleteEmployee(ArrayList<Employee> list){
        System.out.println("--------- Delete Employee -------");
        System.out.println("Enter ID: ");

        //khai bao vi tri
        int index;
        int id = val.getInt(0, Integer.MAX_VALUE);
        //kiem tra vi tri cua Code vua nhap vao trong database
        index = findExistID(list, id);
            //Kiem tra xem code co du lieu trong database hay khong
            //neu tim duoc thi xoa
            //neu khong tim duoc thi nhap lai
        if(index >=0 ){
                list.remove(index);
        }
        else{
            System.out.println("This code doesn't exist!");
        }
    }
    public void searchEmployee(ArrayList<Employee> list){
        System.out.println("--------- Search Employee -------");
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        int flag = 0;
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","ID","First Name","Last Name","Phone", "Email", "Address", "DOB", "Sex", "Salary","Agency");
        if(text.isEmpty()){
            for (int i = 0; i < list.size(); i++) {
                list.get(i).display();
            }
        }
        else{
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getFirstName().toLowerCase().contains(text) ||
                        list.get(i).getLastName().toLowerCase().contains(text)){
                    list.get(i).display();
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("No result!");
            }
        }
    }
    public void sortEmployee(ArrayList<Employee> list){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "ID","First Name","Last Name","Phone", "Email", "Address", "DOB", "Sex", "Salary","Agency");
        Collections.sort(list);
        //for each 
        for (Employee e : list) {
            e.display();
        }       
    }

}
