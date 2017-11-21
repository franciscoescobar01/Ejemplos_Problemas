import java.util.Scanner;

/*
 * de minutos a semanas, dias, horas, minutos
 */

public class c23 {
    public static void main(String[] args){
        System.out.println("Ingresa un numero de minutos");
        Scanner t = new Scanner(System.in);
        int i =t.nextInt();
        System.out.println("Semanas: "+(int)(i/10080));
        System.out.println("Dias: "+(int)(i/1440)%7);
        System.out.println("Horas: "+(int)(i/60)%24);
        System.out.println("Minutos: "+i%60);
    }
}
