/*
* adivina el numero generado
* */

import java.util.Random;
import java.util.Scanner;

public class c6 {
    public static void main(String[] args){
        Random rnum=new Random();
        int intentos =0;
        int num= rnum.nextInt(100);
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        do{
            intentos++;
            if(a>num)
                System.out.println("mayor");
            else if(a<num)
                System.out.println("menor");
            System.out.println("ingresa un numero");
            a = n.nextInt();
        }while(a!=num);
        System.out.println("lo lograste en "+intentos+" intentos");
    }
}
