/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q24 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int num;
        num = in.nextInt();
        for (int i = 1;i<=(num/2);i++){
            if (num%i == 0){
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}
