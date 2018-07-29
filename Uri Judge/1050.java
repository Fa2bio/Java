/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;
import java.util.*;


public class Q12 {
    public static void main (String arg[]){
        int[] ddd = {11,19,21,27,31,32,61,71};
        String[] cidade = {"Sao Paulo","Campinas","Rio de Janeiro","Vitoria","Belo Horizonte","Juiz de Fora","Brasilia","Salvador"};
        int num,esc;
        esc = 8;
        Scanner in = new Scanner (System.in);
        num = in.nextInt();
        for (int i=0;i<ddd.length;i++){
            if (num == ddd[i]){
                esc = i;
                System.out.println(cidade[esc]);
            }
        }
        if (esc == 8){
            System.out.println("DDD nao cadastrado");
        }
    }
}
