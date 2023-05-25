//Imprimir tres numeros de mayor a menor

import java.util.Scanner;

public class ejerciciocuatro {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Ingrese un numero ");
        int num1 = input.nextInt();
        while (num1<=0){
            System.out.println ("Ingrese un numero mayor o diferente a 0 ");
             num1 = input.nextInt();
        }
        System.out.println ("Ingrese un numero ");
        int num2 = input.nextInt();
        while (num2<=0){
            System.out.println ("Ingrese un numero mayor o diferente a 0 ");
             num2 = input.nextInt();
        }
        System.out.println ("Ingrese un numero ");
        int num3 = input.nextInt();
        while (num3<=0){
            System.out.println ("Ingrese un numero mayor o diferente a 0 ");
             num3 = input.nextInt();
        }

        if (num1>num2 && num2>num3 && num1>num3) {
            System.out.println("Imprimiendo de mayor a menor...");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if (num1<num2 && num2<num3 && num1<num3) {
            System.out.println("Imprimiendo de mayor a menor...");
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println("Imprimiendo de mayor a menor...");
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
    }
}