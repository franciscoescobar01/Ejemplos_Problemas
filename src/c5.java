/*
* Suma solo los numeros positivos ingresados
* */
import java.util.Scanner;

public class c5 {
    public static void main(String[] args){
        System.out.println("ingresa un numero");
        Scanner n = new Scanner(System.in);
        int a =n.nextInt();
        int suma=0;
        while(true){
            if(a>0){
                suma+=a;
            }
            System.out.println(""+suma);
            a=n.nextInt();
        }
    }

}
