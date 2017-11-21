import java.util.Date;
import java.util.Scanner;

/*
 * Determina la hora que será en n horas
 */

public class c22 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa un numero de horas");
        int a = teclado.nextInt();
        Date t = new Date();
        System.out.println("la Hora actual es: "+t.getHours()+"hrs.");
        int h=(t.getHours()+a)%24;
        System.out.println("la Hora futura sera: "+h+"hrs.");
    }

}
