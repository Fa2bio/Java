/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q10 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        float salario;
        float [] faixas = {400.00f,800.00f,1200.00f,2000.00f};
        int [] indice = {15,12,10,7,4};
        int i;
        boolean dec;
        dec = true;
        i = 0;
        salario = in.nextFloat();
        while (dec){
            if (i == faixas.length){
                dec = false;
                i=i+1;
            }
            else{
                if (salario <= faixas[i]){
                    dec = false;
                }
            i=i+1;
            }
            
        }
        System.out.printf("Novo salario: %.2f \n",(salario+(salario*indice[i-1]/100)));
        System.out.printf("Reajuste ganho: %.2f \n",salario*indice[i-1]/100);
        System.out.println("Em percentual: "+indice[i-1]+" %");
    }
}
