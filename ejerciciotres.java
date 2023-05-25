//Imprimir el numero mayor de dos

import java.util.Scanner;

public class ejerciciotres {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Ingrese un numero ");
        int num1 = input.nextInt();
        while (num1<=0){
            System.out.println ("Ingrese un numero diferente a 0 ");
             num1 = input.nextInt();
        }
        System.out.println ("Ingrese un numero ");
        int num2 = input.nextInt();
        while (num2<=0){
            System.out.println ("Ingrese un numero diferente a 0 ");
            num2 = input.nextInt();
        }

        if (num1>num2) {
            System.out.println("El numero "+ num1 + " es el mayor.");
        } else {
            System.out.println("El numero "+ num2 + " es el mayor");
        } 

    }

}