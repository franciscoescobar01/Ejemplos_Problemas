/*
   buscar el minimo comun multiplo
 */
import java.util.Scanner;

public class c17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scan.nextInt();
        int mcd = 0, mcm=0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        mcm=(Math.max(num1, num2)/mcd)*Math.min(num1, num2);;

        System.out.println("El M.C.M. entre " + num1 + " y " + num2 + " es: " + mcm);
    }
}
