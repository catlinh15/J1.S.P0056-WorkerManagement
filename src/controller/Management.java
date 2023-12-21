/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.History;
import static model.History.Header;
import model.Worker;
import util.Util;

/**
 *
 * @author DELL
 */
public class Management {

    private List<Worker> listW;
    private List<History> ht = null;

    public Management() {
        this.listW = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.listW.size() == 0;
    }

    public static Worker newWorker() {
        Worker x = new Worker();
        x.setId(Util.isAString("Enter the ID: ", "Try again!!!"));
        x.setName(Util.isAString("Enter the name: ", "Try again!!!"));
        x.setAge(Util.isAnInteger("Enter the age: ", "Try again!!!", 18, 50));
        x.setSalary(Util.isADouble("Enter the salary: ", "Try again!!!", 0));
        x.setLocation(Util.isAString("Enter the work location: ", "Try again!!!"));
        return x;
    }

    public void addWorker(Worker x) {
        this.listW.add(x);
    }

    public Worker searcherIDWorker(String id) {
        Worker x = null;
        for (Worker w : listW) {
            if (id.equalsIgnoreCase(w.getId())) {
                x = w;
                break;
            }
        }
        return x;
    }

    public void IncSalary(String id, double plus) {
        Worker x = searcherIDWorker(id);
        if (x == null) {
            System.out.println("No data in the system");
        } else {
            double currentSalary = x.getSalary();
            x.setSalary(currentSalary + plus);
            System.out.println("Old Salary: " + currentSalary);
            System.out.println(Worker.getHeader());
            System.out.println(x.toString());

            if (this.ht == null) {
                this.ht = new ArrayList<>();
            }
            History i = new History(x,"Up", LocalDateTime.now());
            ht.add(i);
        }
    }

    public void DecSalary(String id, double minus) {
        Worker x = searcherIDWorker(id);
        if (x == null) {
            System.out.println("No data in the system");
        } else {
            double currentSalary = x.getSalary();
            x.setSalary(currentSalary - minus);
            System.out.println("Old Salary: " + currentSalary);
            System.out.println(Worker.getHeader());
            System.out.println(x.toString());

            if (this.ht == null) {
                this.ht = new ArrayList<>();
            }
            History i = new History(x,"Down", LocalDateTime.now());
            ht.add(i);
        }
    }

   
//    public void display() {
//        System.out.println("-----------------------------------------------------------");
////        System.out.println("| ID  |         Name        | Age |   Salary   | Location |");
//        Worker.Header();
//        for (Worker w : listW) {
//            System.out.println(w);
//        }
//        System.out.println("-----------------------------------------------------------");
//    }

    public void sortById() {
        Collections.sort(ht, new Comparator<History>() {
            @Override
            public int compare(History o1, History o2) {
                return o1.getId().compareToIgnoreCase(o2.getId());
            }
        });
    }

   
    public void getInformationSalary() {
        if (this.ht.isEmpty()) {
            System.out.println("No data");
        } else {
            sortById();
            
            System.out.println(History.Header());
            
            for (History x : ht) {
                System.out.println(x);
            }
        }
    }
}
