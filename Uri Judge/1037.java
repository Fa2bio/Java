/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q03 {
    public static void main (String [] arg){
        Scanner in = new Scanner(System.in);
        float num;
        num = in.nextFloat();
        if (num < 0 || num > 100){
            System.out.println("Fora de intervalo");
        }
        if (num >= 0 && num <= 25){
            System.out.println ("Intervalo [0,25]");
        } 
        if (num > 25 && num <= 50){
            System.out.println ("Intervalo (25,50]");
        }
        if (num > 50 && num <= 75){
            System.out.println ("Intervalo (50,75]");
        }
        if (num > 75 && num <= 100){
            System.out.println ("Intervalo (75,100]");
        }
    }
}
