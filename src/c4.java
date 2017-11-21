/*
* determina si un numero es par o impar
* */
import java.util.Scanner;

public class c4 {
    public static void main(String[] args){
        System.out.println("ingresa un numero");
        Scanner n = new Scanner(System.in);
        int a =n.nextInt();
        if(a%2==0){
            System.out.println("Es par");
        }else if(a%2==1){
            System.out.println("Es impar");
        }
    }
}
