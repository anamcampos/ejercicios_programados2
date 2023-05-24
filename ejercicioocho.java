/* Solicitar un número e indicar si es positivo o negativo. El proceso se repetirá
hasta que se introduzca un 0. */

import java.util.Scanner;

public class ejercicioocho {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        boolean para = true;
        System.out.println ("Ingrese numeros mayores a 0 para seguir con el ciclo o ingrese 0 para acabar ");

        while (para==true) {
            System.out.println ("Ingrese un numero ");
            int num = input.nextInt();
            if (num>0) {
                System.out.println("El numero es positivo");
            } else if (num<0) {
                System.out.println("El numero es negativo");
            } 
            if (num==0){
                para = false;
            }
        }
    }
}