/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import util.Util;

/**
 *
 * @author DELL
 */
public class Menu {

    private String titleMenu;
    private ArrayList<String> optionMn = new ArrayList<>();

    public Menu(String titleMenu) {
        this.titleMenu = titleMenu;
    }

    public void addOption(String option){
        optionMn.add(option);
    }
    
    public void printMenu(){
        if (optionMn.isEmpty()){
            System.out.println("No item");
            return;
        }
        
        System.out.println(titleMenu);
        for (String x : optionMn) {
            System.out.println(x);
        }
    }
    
    public int getChoice(){
        int maxOp = optionMn.size();
        String mess = "Enter your options [1-"+maxOp+"]: ";
        String error = "Try again!!!";
        int result = Util.isAnInteger(mess, error, 1, maxOp);
        return result;
    }
    
}
