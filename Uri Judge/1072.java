/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

public class Q16 {
    public static void main (String[] arg){
        Scanner in = new Scanner (System.in);
        int n,i,dentro;
        dentro = 0;
        n = in.nextInt();
        float[] num = new float[n];
        for (i=0;i<n;i++){
            num[i] = in.nextFloat();
            if (num[i] >= 10 && num[i] <= 20){
                dentro = dentro + 1;
            }
        }
        
        System.out.println(dentro+" in");
        System.out.println((n-dentro)+" out");
    }
    
}
