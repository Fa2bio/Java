/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;


public class Q15 {
    public static void main (String arg[]){
        Scanner in = new Scanner (System.in);
        int i,num,fim,menor,maior,soma;
        soma = 0;
        menor = in.nextInt();
        maior = in.nextInt();
        if (menor>maior){
            fim = menor;
            menor = maior;
            maior = fim;
        }
        if (menor != maior){
            if (menor%2 == 0){
                num = menor + 1;
            }
            else{
                num = menor+2;
            }
            if (maior%2 == 0){
                fim = maior - 1;
            }
            else {
                fim = maior-2;
            }
            for (i=num;i<=fim;i=i+2){
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
