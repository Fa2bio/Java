/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;
import java.util.*;


public class Q04 {
    public static void main (String arg []){
        float[]preco = new float[5];
        float  valor;
        int pdt,qtd;
        valor = 0.0f;
        preco[0] = 4.0f; preco[1] = 4.5f; preco[2] = 5.0f;preco[3] = 2.0f; preco[4] = 1.5f;
        Scanner in = new Scanner(System.in);
        pdt = in.nextInt();
        qtd = in.nextInt();
        valor = qtd*preco[(pdt-1)];
        System.out.printf("Total: R$ %.2f ",valor);
        System.out.println("");
    }
}
