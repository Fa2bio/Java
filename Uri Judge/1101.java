/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q20 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int m,n,soma,temp;
        soma = temp = 0;
        m = in.nextInt();
        n = in.nextInt();
        while (m>0 && n>0){
            if (m>n){
                temp=m;
                m=n;
                n=temp;
 
            }
            for (int i=m;i<=n;i++){
                soma = soma + i;
                System.out.printf(i+" ");
            }
            System.out.println("Sum="+soma);
            m = in.nextInt();
            n = in.nextInt();
            soma = 0;
        }
    }
    
}
