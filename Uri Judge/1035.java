/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q02 {
    public static void main (String [] arg){
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        boolean test;
        test = false;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        if (b>c){
            if (d>a){
                if ((c+d)>(a+b)){
                    if (c>0){
                        if (d>0){
                            if (a%2 == 0){
                                test = true;
                            }
                        }
                    }
                }
            }
        }
        if (test){
            System.out.println ("Valores aceitos");
        }
        else{
            System.out.println ("Valores nao aceitos");
        }
        
    }
    
}
