/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;



public class Q14 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int i,num;
        i=1;
        num = in.nextInt();
        do{
            System.out.println(i);
            i=i+2;
        }while (i<=num);
    }
}
