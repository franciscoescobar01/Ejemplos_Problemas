/*
* la cantidad de digitos de un numero
* */

import java.util.Scanner;

public class c9 {
    public static void main(String[] args){
        System.out.println("ingresa un numero");
        Scanner n = new Scanner(System.in);
        String p= n.next();
        System.out.println("los digitos son:" + p.length());
    }
}
