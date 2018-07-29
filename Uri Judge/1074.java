/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

ic class Q17 {
    public static void main (String[] arg){
        Scanner in = new Scanner (System.in);
        int n,i,dentro;
        dentro = 0;
        n = in.nextInt();
        int[] num = new int[n];
        String[] tipo = new String[n];
        for (i=0;i<n;i++){
            num[i] = in.nextInt();
            if (num[i] == 0){
                tipo [i] = "NULL";
            }
            else{ 
                if (num[i]%2 == 0){
                    tipo[i] = "EVEN ";
                }
                else{
                    tipo[i] = "ODD ";
                }
                if (num[i] < 0){
                    tipo[i] = tipo[i] + "NEGATIVE";
                }
                else{
                    tipo[i] = tipo[i] + "POSITIVE";
                }
            }
        }
        for (i=0;i<n;i++){
            System.out.println(tipo[i]);
        }
    }
    
}
