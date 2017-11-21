/*
* Determina cual es la palabra mas larga
* */
import java.util.Scanner;

public class c8 {
    public static void main(String[] args){
        System.out.println("ingresa una palabra");
        Scanner n = new Scanner(System.in);
        String p= n.next();
        System.out.println("ingresa una palabra");
        String m=n.next();
        if(p.length()<m.length()){
            System.out.println("Es la palabra mas larga "+m);
        }else if(p.length()>m.length()){
            System.out.println("Es la palabra mas larga "+p);
        }else
            System.out.println("ambas palabras son iguales");
    }
}
