/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;

/**
 *
 * @author José Augusto
 */
public class Q11 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        String[] bichos = {"aguia","pomba","vaca","homem","pulga","lagarta","sanguessuga","minhoca"};
        int[] num = {111,112,121,122,211,212,221,222};
        int numesc,esc;
        String nome;
        esc = numesc = 0;
        for (int i=0;i<3;i++){
            nome = in.next();
            switch(nome){
                case "vertebrado":
                    esc = esc + 100;
                    break;
                case "invertebrado":
                    esc = esc + 200;
                    break;
                case "ave":
                    esc = esc + 10;
                    break;
                case "mamifero":
                    esc = esc + 20;
                    break;
                case "inseto":
                    esc = esc + 10;
                    break;
                case "anelideo":
                    esc = esc + 20;
                    break;
                case "carnivoro":
                    esc = esc + 1;
                    break;
                case "onivoro":
                    esc = esc + 2;
                    break;
                case "hematofago":
                    esc = esc + 1;
                    break;
                case "herbivoro":
                    if (esc == 120){
                       esc = esc + 1; 
                    }
                    else{
                        esc = esc + 2;
                    }
                    break;
            }
        }
        for (int i=0;i<num.length;i++){
            if (esc == num[i]){
                numesc = i;
            }
        }
        System.out.println(bichos[numesc]);
    }      
}
