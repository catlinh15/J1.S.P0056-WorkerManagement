/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class Worker {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String location;

    public Worker() {
    }

    public Worker(String id, String name, int age, double salary, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        
    }

 public static String getHeader(){
        return String.format("| %3s | %-25s | %3s | %11s | %-10s |",
                "ID", "Name", "Age", "Salary", "Location");
    }
    @Override
    public String toString() {
        return String.format("| %3s | %-25s | %3d | %11.1f | %-10s |",
                                id, name, age, salary, location);
    }

   
}
