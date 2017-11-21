/*
   Arreglo aleatorio, suma y promedio
 */

import java.util.Random;

public class c18 {
    public static void main(String[] args){
        Random rnum = new Random();
        int a = rnum.nextInt(198)+2, promedio=0, suma=0;
        int[] arr = new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]=rnum.nextInt(300)+100;
            suma +=arr[i];
        }
        System.out.println("la suma es: "+suma);
        System.out.println("El promedio es: "+suma/arr.length);
    }
}
