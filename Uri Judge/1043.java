/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q06 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        float a,b,c,num1,num2,num3,per,area;

        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
            
        num1 = Math.abs(b-c);
        num2 = Math.abs(a-c);
        num3 = Math.abs(a-b);
        if(num1<a && num2<b && num3<c){
            per = a+b+c;
            System.out.printf("Perimetro = %.1f \n",per);
        }
        else{
            area = (a+b)*c/2;
            System.out.printf("Area = %.1f \n",area);
        }
    }
    
}
