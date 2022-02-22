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
public class TaskManagement {

    Validation val = new Validation();

    public int findExistID(ArrayList<Task> list, int id) {
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
        System.out.println("================================ Task Program ==========================================");
        System.out.println("1. Add task \n"
                + "2. Update task\n"
                + "3. Delete task\n"
                + "4. Display task\n"
                + "5. Exit\n");
        System.out.println("==========================================================================");
        System.out.println("Please choice one option: ");
        // yeu cau nguoi dung chon tu 1 den 5
        int i = val.getInt(1, 5);
        return i;
    }

    public void addTask(ArrayList<Task> list) {       
        System.out.println("------------Add Task---------------");

        System.out.print("Requirement Name: ");
        String requirementName = val.getString();

        System.out.print("Task Type: ");
        int taskType = val.getInt(1, 4);

        System.out.print("Date: ");
        String date = val.GetDate();

        System.out.print("From: ");
        String errPlanFrom = "Plan From must be 8.0, 8.5, ..., 17.0";
        double planFrom = val.getInputPlan(8, 17, errPlanFrom);

        System.out.print("To: ");
        String errPlanTo = "Plan To must be more than plan from " + planFrom + " and must be less than or equal 17.5";
        double planTo = val.getInputPlan(planFrom + 0.5, 17.5, errPlanTo);

        System.out.print("Assignee: ");
        String assignee = val.getString();

        System.out.print("Reviewer: ");
        String reviewer = val.getString();

        int id = list.size() + 1;

        list.add(new Task(id, taskType, requirementName, date, planTo - planFrom, assignee, reviewer));
        System.out.println("Add Task Successfully!");
    }

    
    public void updateTask(ArrayList<Task> list) {
        System.out.println("------------ Update Task---------------");

        int id;
        int index;
        do {
            System.out.println("Requirement ID: ");
            id = val.getInt(1, list.size());
            index = findExistID(list, id);
            if (index >= 0) {
                break;
            } else {
                System.out.println("This ID isn't exist!");
            }
        } while (true);
        
        System.out.print("Task Name: ");
        String requirementName = val.getString();
        if (!requirementName.equals("nope")) {
            list.get(index).setName(requirementName);
        }
        System.out.print("Task Type: ");
        String taskType = val.getString();
        if (!taskType.equals("nope")) {
            do {
                if (taskType.equals("1")
                        || !taskType.equals("2")
                        || !taskType.equals("3")
                        || !taskType.equals("4")) {
                    list.get(index).setTask(Integer.parseInt(taskType));
                    break;
                } else {
                    System.out.println("Task type must be from 1 to 4");
                }
            } while (true);
        }

        System.out.print("Date: ");
        String date = val.getString();
        if(!date.equals("nope")){
            list.get(index).setDate(date);
        }

        System.out.print("From: ");
        String errPlanFrom = "Plan From must be 8.0, 8.5, ..., 17.0";
        String msg2 = val.getString();
        double planFrom = 0;
        if(!msg2.equals("nope")){
            planFrom = val.getInputPlan(8, 17, errPlanFrom);          
        }
        
        System.out.print("To: ");
        String errPlanTo = "Plan To must be more than plan from " + planFrom + " and must be less than or equal 17.5";
        String msg3 = val.getString();
        double planTo = 0;
        if(!msg3.equals("nope")){
            planTo = val.getInputPlan(planFrom + 0.5, 17.5, errPlanTo);
            list.get(index).setFrom(planTo - planFrom);
        }
        
        System.out.print("Assignee: ");
        String assignee = val.getString();
        if(!assignee.equals("nope")){
            list.get(index).setAssignee(assignee);
        }

        System.out.print("Reviewer: ");
        String reviewer = val.getString();
        if(!reviewer .equals("nope")){
            list.get(index).setExpert(reviewer );
        }
    }

    public void deleteTask(ArrayList<Task> list) {
        System.out.println("------------ Delete Task---------------");
        int id;
        int index;
        do {
            System.out.println("Requirement ID: ");
            id = val.getInt(1, list.size());
            index = findExistID(list, id);
            if (index >= 0) {
                break;
            } else {
                System.out.println("This ID isn't exist!");
            }
        } while (true);
        list.remove(index);
    }

    
    public void displayTask(ArrayList<Task> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("-------------------------- Task --------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID", "Name", "Task type", "Date", "Time", "Assign", "Reviewer");
        for (Task task : list) {
            task.display();
        }
    }

}
