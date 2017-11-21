/*
 * Cambia la temperatura de celcius a fahrenheit
 */
import java.util.Scanner;

public class c11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una temperatura en grados Celcius");
        double a = teclado.nextInt();
        System.out.println("la temperatura en fahrenheit es: "+((a*1.8)+32));
    }
}
