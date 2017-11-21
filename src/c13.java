/*
 * Diviciones enteras de  un numero
 */
import java.util.Scanner;

public class c13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a = teclado.nextInt(), b=1;
        for(int i=1;i<=a;i++){
            if(a%i==0)
                System.out.println(i+" es divisor del numero ingresado");
        }

    }
}
