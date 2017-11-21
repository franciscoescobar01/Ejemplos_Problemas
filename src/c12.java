/*
 * Calculo de  factorial de un numero ingresado por teclado
 */
import java.util.Scanner;

public class c12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a = teclado.nextInt(), b=1;
        for(int i=1;i<=a;i++){
            b*=i;
        }
        System.out.println("El factorial de este numero es: "+ b);
    }
}
