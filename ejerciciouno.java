//Imprimir numero positivo o negativo

import java.util.Scanner;

public class ejerciciouno {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Ingrese un numero ");
        int num = input.nextInt();
        while(num==0){
            System.out.println ("Ingrese un numero diferente a 0 ");
         num = input.nextInt();
        }

        if (num>0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        } 

    }

}