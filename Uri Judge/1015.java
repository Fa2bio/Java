/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

public class Q08 {
     public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        double[] lados = new double[3];
        double num,testang,a,b;
        int i,j,li;
        String tipo;
        li=0;
        testang = 0;
        for ( i=0;i<lados.length;i++){
            lados[i] = in.nextDouble();
        }
        for ( j=1; j<lados.length;j++){
            for ( i=1 ; i<lados.length;i++){
                if (lados[i] > lados[i-1]){
                    num = lados[i-1];
                    lados[i-1] = lados[i];
                    lados[i]=num;
                }
            }
        }
        if(lados[0] < lados[1]+lados[2]){
            /* PESQUISA DO TIPO DE TRIÂNGULO QUANTO AOS ÂNGULOS */  
            testang = Math.pow(lados[0],2) - (Math.pow(lados[1],2) + Math.pow(lados[2],2));
            if (testang < 0){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            else{
                if (testang == 0){
                    System.out.println("TRIANGULO RETANGULO");
                }
                else{
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
            }
            /* PESQUISA TIPO DE TRIÂNGULO QUANTO AO LADO */
            for (i=0;i<(lados.length-1);i++){
                for(j=i+1;j<lados.length;j++){
                    if (lados[i]==lados[j]){
                        li=li+1;
                    }
                }
            }
            if (li == 3){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else{
                if (li==1){
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }   
        else{
            System.out.println("NAO FORMA TRIANGULO");
        }
    }
}
