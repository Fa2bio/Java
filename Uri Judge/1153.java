/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;


public class Q23 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int num,tot;
        tot = 1;
        num = in.nextInt();
        for (int i=2;i<=num;i++){
            tot = tot*i;
        }
        System.out.println(tot);
    }
    
}
