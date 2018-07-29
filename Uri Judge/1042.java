/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q05 {
        public static void main(String arg[]){
        int[] vetor = new int[3];
        int[] index = new int[3];
        int num;
        Scanner in = new Scanner (System.in);
        for (int i=0;i<vetor.length;i++){
            num = in.nextInt();
            vetor[i] = num;
            index[i] = num;
        }
        for (int j=1; j<vetor.length;j++){
            for (int i=1 ; i<vetor.length;i++){
                if (index[i] < index[i-1]){
                    num = index[i-1];
                    index[i-1] = index[i];
                    index[i]=num;
                }
            }
        }
        for (int i=0;i<index.length;i++){
            System.out.println(index[i]);
        }
        System.out.println("");
        for (int i=0;i<index.length;i++){
            System.out.println(vetor[i]);
        }
    }
}
