/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q13 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int[] num = new int [5];
        int par,impar,espec,negat,posit;
        par=impar=espec=negat=posit=0;
        for (int i=0;i<num.length;i++){
            num[i] = in.nextInt();
            if (num[i]<0){
                negat = negat + 1;
            }
            else{
                if (num[i]>0){
                    posit = posit+1;
                }
            }
            if (num[i]%2 == 0){
                par = par+1;
            }
            else{
                impar = impar+1;
            }
        }
        System.out.println (par+" valor(es) par(es)");
        System.out.println (impar+" valor(es) impar(es)");  
        System.out.println (posit+" valor(es) positivo(s)");
        System.out.println (negat+" valor(es) negativo(s)"); 
    }
}
