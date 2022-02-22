/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

/**
 *
 * @author ROG STRIX
 */
public class Task {
    //TaskTypeID, Requirement Name, Date, From, Plan To Plan, Assignee, Expert
    private int id;
    private int task;
    private String name;
    private String date;
    private double time;
    private String assignee;
    private String expert;

    public Task() {
    }

    public Task(int id, int task, String name, String date, double time, String assignee, String expert) {
        this.id = id;
        this.task = task;
        this.name = name;
        this.date = date;
        this.time = time;
        this.assignee = assignee;
        this.expert = expert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        if(task == 1){
            return "Code";
        }
        else if(task == 2){
            return "Test";
        }
        else if(task == 3){
            return "Design";
        }
        else{
            return "Review";
        }
    }

    public void setTask(int task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTime() {
        return time;
    }

    public void setFrom(double time) {
        this.time = time;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }
    
    public void display(){
        System.out.printf("%-10d%-10s%-10s%-10s%-10.2f%-10s%-10s\n",this.id,this.name,this.getTask(),this.date,this.time,this.assignee,this.expert);
    }
}
