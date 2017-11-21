/*
 * determina si un numero es o no palindromo
 */

import java.util.Scanner;

public class c10 {
    public static void main(String[] args){
        System.out.println("ingresa un numero");
        Scanner n = new Scanner(System.in);
        String a =n.next();
        StringBuilder b = new StringBuilder();
        for(int i =0;i<a.length();i++){
            b.append(a.charAt(a.length()-1-i));
        }
        if(a.equals(b.toString())){
            System.out.println("el numero es palindromo");
        }else{
            System.out.println("el numero no es palindromo");
        }
    }
}
