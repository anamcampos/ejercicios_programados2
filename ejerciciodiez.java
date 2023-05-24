// Solicitar al usuario 15 números y mostrar al final la suma total.

import java.util.Scanner;

public class ejerciciodiez {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        int suma = 0;
        for (int i=1; i<=15; i++) {
            System.out.println ("Ingrese un numero entero ");
            int num = input.nextInt();
            while (num<=0){
                System.out.println ("Ingrese un numero entero mayor a 0 ");
             num = input.nextInt();
            }
            suma +=num;
        }
        System.out.println ("La suma de los numeros ingresados es: " + suma);
    }
}