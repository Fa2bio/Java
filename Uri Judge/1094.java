/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;


public class Q19 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int n,c,s,r,itotal;
        r = s = c = 0;
        float pc,pr,ps,total;
        total = 0;
        n=in.nextInt();
        int [] qtd = new int[n];
        String [] bicho = new String[n];
        for (int i=0;i<n;i++){
            qtd[i] = in.nextInt();
            bicho[i] = in.next();
            total = total + qtd[i];
            switch (bicho[i]){
                case "R":
                    r = r + qtd[i];
                    break;
                case "S":
                    s = s + qtd[i];
                    break;
                case "C":
                    c = c + qtd[i];
                    break;
            }
        }
        pc = 100*c/total;
        ps = 100*s/total;
        pr = 100*r/total;
        itotal = (int)total;
        System.out.println("Total: "+itotal+" cobaias");
        System.out.println("Total de coelhos: "+c);
        System.out.println("Total de ratos: "+r);
        System.out.println("Total de sapos: "+s);
        System.out.printf("Percentual de coelhos: %.2f",pc);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f",pr);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f",ps);   
        System.out.println(" %");
    }
}
