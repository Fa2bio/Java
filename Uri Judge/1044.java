/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q07 {
    public static void main (String arg[]){
        int num1,num2,temp;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt(); 
        if (num1<num2){
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if ((num1%num2)==0){
                System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
