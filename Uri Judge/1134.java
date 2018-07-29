/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q22 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        int g,a,d,fuel;
        g = a = d = 0;
        do{
            do{
                fuel = in.nextInt();
            }while (fuel<1 || fuel >4);
            switch (fuel){
                case (1):
                    a=a+1;
                    break;
                case (2):
                    g=g+1;
                    break;
                case (3):
                    d=d+1;
                    break;
            }
        }while (fuel > 0 && fuel < 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
    }
}
