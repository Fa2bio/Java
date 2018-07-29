/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;


public class Q01 {
    public static void main (String [] args){
        int[] cedulas = {100,50,20,10,5,2,1};
        int[] notas = new int[7];
        int num;
        Scanner in = new Scanner (System.in);
        num = in.nextInt();
        System.out.println(num);
        for (int i=0; i<7 ; i++){
            if (num >= cedulas[i]){
                notas[i] = num/cedulas[i];
                num = num%cedulas[i];
            }
            System.out.println(notas[i]+" nota(s) de R$ "+cedulas[i]+",00");
        }
    }
}
