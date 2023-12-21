/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0056;

import controller.Management;
import ui.Menu;
import util.Util;

/**
 *
 * @author DELL
 */
public class J1SP0056 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] menu = {
            "1. Add a worker",
            "2. Increase salary for worker",
            "3. Decrease salary for worker",
            "4. Show adjusted salary worker information",
            "5. Exit"
        };
        Management mn = new Management();
        Menu nm = new Menu("Worker Manager");
        for (String x : menu) {
            nm.addOption(x);
        }
        
        int choice;
        do{
             nm.printMenu();
             choice  = nm.getChoice();
             switch (choice){
                 case 1:
                    mn.addWorker(mn.newWorker());
                    break;
                 case 2:
                     mn.IncSalary(Util.isAString("Enter the id: ", "Try again!!!"),
                             Util.isADouble("Enter the increased amount: ", "Try again!!!", 0));
                     break;
                 case 3:
                     mn.DecSalary(Util.isAString("Enter the id: ", "Try again!!!"),
                             Util.isADouble("Enter the decreased amount: ", "Try again!!!", 0));
                     break;
                 case 4: 
                     mn.getInformationSalary();
                     break;
                 case 5:
                     System.out.println("Exit");
                     break;
             }
        }while (choice != 5);
       
    }
    
}
