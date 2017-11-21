/*
 * suma diagonales de matriz
 */

import java.util.Random;
import java.util.Scanner;

public class c19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa las dimenciones");
        int n=teclado.nextInt();
        int sumaA=0, sumaB=0, suma=0;
        Random rnum= new Random();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = rnum.nextInt(100);
            }
        }
        for(int i=0;i<n;i++){
            sumaA+=arr[i][i];
            sumaB+=arr[i][n-1-i];
        }
        suma=sumaA+sumaB;
        System.out.println("la suma es: "+suma);
    }
}
