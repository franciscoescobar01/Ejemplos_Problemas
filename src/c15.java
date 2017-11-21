/*
    Divición entera
 */

import java.util.Scanner;

public class c15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Ingresa un numero");
        a = teclado.nextInt();
        System.out.println("Ingresa un numero");
        b = teclado.nextInt();
        if(a%b==0){
            System.out.println("es una divición entera");
        }else{
            System.out.println("no es una divición entera");
        }
    }
}
