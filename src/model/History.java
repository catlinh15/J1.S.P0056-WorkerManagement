/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author DELL
 */
public class History extends Worker {

    private String status;
    private LocalDateTime date;
    private final DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public History(Worker w, String status, LocalDateTime date) {
        super(w.getId(), w.getName(), w.getAge(), w.getSalary(), null);
        this.status = status;
        this.date = LocalDateTime.now();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date.format(dateF);
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

     public static String Header(){
        return (String.format("| %3s | %-25s | %3s | %11s | %5s |   %-10s  |", "ID", "Name", "Age", "Salary", "Status", "Date"));
    }
    @Override
    public String toString() {
        return String.format("| %3s | %-25s | %3d | %11.1f | %5s |   %-10s  |", 
                            super.getId(), super.getName(), super.getAge(), super.getSalary(), status, getDate());
    }
    
    
    
}
