/*
* El mayor de los numeros ingresados por teclado
 * */

import java.util.Scanner;

public class c3 {
    public static void main(String[] args ){
        System.out.println("ingresa un numero");
        Scanner c = new Scanner(System.in);
        int max=c.nextInt();
        while(true){
            int d = c.nextInt();
            if(d>max){
                max=d;
                System.out.println("el mayor es:"+ max);
            }else
                System.out.println("el mayor es:"+ max);
        }
    }
}
