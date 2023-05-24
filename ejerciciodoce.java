/* Solicitar al usuario 10 números, mostrando al final si se ha introducido alguno
negativo. */

import java.util.Scanner;

public class ejerciciodoce {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        int suma = 0;
        for (int i=1; i<=10; i++) {
            System.out.println ("Ingrese un numero entero ");
            int num = input.nextInt();
            if (num<0){
                suma += 1;
            }
        }

        if (suma>=1){
            System.out.println ("Se introdujo " + suma + " numero(s) negativo(s)");
        } else {
            System.out.println ("No se ingresaron numeros negativos");
        }
    }
}