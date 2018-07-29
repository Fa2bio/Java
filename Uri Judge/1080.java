/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.*;

public class Q18 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        int n,i,maior,posmaior;
        i=posmaior=0;
        maior = 0;
        int[] num = new int[100];
        do{
            n = in.nextInt();
            num[i] = n;
            if (n>maior){
                maior = n;
                posmaior = i;
            }
            i=i+1;
        }while (i<100);
      
        System.out.println(maior);
        System.out.println(posmaior);
    }
}
