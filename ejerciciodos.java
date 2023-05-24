//Imprimir si el numero es multiplo del otro

import java.util.Scanner;

public class ejerciciodos {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Ingrese un numero ");
        int num1 = input.nextInt();
        while (num1<=0){
            System.out.println ("Ingrese un numero positivo mayor a 0 ");
            num1 = input.nextInt();
        }
        System.out.println ("Ingrese otro numero ");
        int num2 = input.nextInt();
        while (num2<=0){
            System.out.println ("Ingrese otro numero positivo mayor a 0 ");
            num2 = input.nextInt();
        }
        if (num1%num2 == 0 || num2%num1 == 0) {
            System.out.println("Los numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        } 

    }

}