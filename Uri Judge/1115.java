/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;


public class Q21 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        int m,n,temp;
        m = in.nextInt();
        n = in.nextInt();
        while (m!=0 && n!=0){
            temp = m*n;
            if (temp>0){
                if (m>0){
                    System.out.println("primeiro");                   
                }
                else{
                    System.out.println("terceiro");
                }
            }
            else{
                if (m>0){
                    System.out.println("quarto");
                }
                else{
                    System.out.println("segundo");
                }
            }
                
            m = in.nextInt();
            n = in.nextInt();            
        }
        
    }
}
