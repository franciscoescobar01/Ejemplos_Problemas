
/*
* Area de un circulo
* */
import java.util.Scanner;

public class c2 {
    public static void main(String[] args ){
        System.out.println("ingresa el radio");
        Scanner n = new Scanner(System.in);
        double  area = Math.pow(n.nextInt(),2)*Math.PI;
        System.out.println("el area es: "+area);
    }
}
