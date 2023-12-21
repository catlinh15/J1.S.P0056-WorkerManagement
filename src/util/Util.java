/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

public class Util {

    public static String isAString(String mess, String error) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(mess);
                result = sc.nextLine();
                return result;
            } catch (Exception e) {
                System.out.println(error);
            }
        }

    }

    public static int isAnInteger(String mess, String error, int low, int high) {
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(isAString(mess, error));
                if (result >= low && result <= high) {
                    return result;
                } else throw new Exception();
                
            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }

    public static double isADouble(String mess, String error, double term) {
        double result;
        while (true) {
            try {
                result = Double.parseDouble(isAString(mess, error));
                if (result > term) {
                    return result;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }

}
