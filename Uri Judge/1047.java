/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q09 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int hi,mi,hf,mf,tempi,tempf,dh,dm;
        dh = dm = 0;
        hi = in.nextInt();
        mi = in.nextInt();
        hf = in.nextInt();
        mf = in.nextInt();
        if (mf>=60){
            System.out.println("Valor inválido");
        }
        if (hf>hi){
            tempi = hi*60+mi;
            tempf = hf*60+mf;
            tempf = tempf - tempi;
            dh = tempf/60;
            dm = tempf%60;
        }
        else{
            if (hf<hi){
                tempi = 24*60 - (hi*60+mi);
                tempf = hf*60+mf;
                tempf = tempf + tempi;
                dh = tempf/60;
                dm = tempf%60;
            }
            else{
                if (hf == hi && mf>mi){
                    dh = 0;
                    dm = mf - mi;
                }
                if (hf == hi && mf<mi){
                    dh = 23;
                    dm = 60 - (mi-mf);
                }
                if (hf == hi && mf==mi){
                    dh = 24;
                    dm = 0;       
                }
            }
        }
        System.out.println("O JOGO DUROU "+dh+" HORA(S) E "+dm+" MINUTO(S)");

    }
}
