/*
* Area de un cuadrado
* */

import java.util.Scanner;

public class c1 {
    public static void main(String[] args ){
        System.out.println("ingresa el lado");
        Scanner n = new Scanner(System.in);
        double  area = Math.pow(n.nextInt(),2);
        System.out.println("el area es: "+area);
    }
}
