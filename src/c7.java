/*
* Muestra la parte decimal de un numero real
* */
import java.util.Scanner;

public class c7 {

    public static void main(String[] args){
        System.out.println("ingresa un numero real");
        Scanner n = new Scanner(System.in);
        double i = n.nextDouble();
        System.out.println(i);
        int a =(int)i;
        System.out.println(i-(double) a);
    }
}
