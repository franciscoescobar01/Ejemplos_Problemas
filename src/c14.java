/*
 * Calculo de las potencias de 2
 */

import java.util.Scanner;

public class c14 {
    public static void main(String[] args){
        System.out.println("Ingresa la potencia de 2 que deseas calcular");
        Scanner teclado = new Scanner(System.in);
        double a = Math.pow(2,teclado.nextInt());
        System.out.println("El resultado es: "+a);
    }
}
