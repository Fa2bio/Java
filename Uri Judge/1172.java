/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q25 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int[] vetor = new int[10];
        for (int i=0;i<10;i++){
            vetor[i] = in.nextInt();
            if (vetor[i] <= 0){
                vetor[i] = 1;
            }
        }
        for (int i=0;i<10;i++){
            System.out.println("X["+i+"] = "+vetor[i]);
        }
    }
}
