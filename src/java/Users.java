/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author visheshtalreja
 */
public class Users implements java.io.Serializable {
    private String task_name;
    private String task_owner;
    private String task_points;
    private String task_date;

    public String getTask() {
        return task_name;
    }

    public void setTask(String task_name) {
        this.task_name = task_name;
    }

    public String getOwner() {
        return task_owner;
    }

    public void setOwner(String task_owner) {
        this.task_owner = task_owner;
    }

    public String getPoints() {
        return task_points;
    }

    public void setPoints(String task_points) {
        this.task_points = task_points;
    }

    public String getDate() {
        return task_date;
    }

    public void setDate(String task_date) {
        this.task_date= task_date;
    }
}
