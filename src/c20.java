/*
 * suma maxima de 3 numeros de 6
 */

import java.util.Random;

public class c20 {
    public static void main(String[] args){
        int a=0, b=0, c=0;
        int[] arr = new int[6];
        Random rnum= new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rnum.nextInt(500);
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                a=i;
            }
        }
        max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]&&i!=a){
                max=arr[i];
                b=i;
            }
        }
        max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]&&i!=a&&i!=b){
                max=arr[i];
                c=i;
            }
        }
        System.out.println(arr[a]+arr[b]+arr[c]);
    }
}