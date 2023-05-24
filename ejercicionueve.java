/*Solicitar al usuario números hasta que se teclee un 0, mostrar la suma de todos
los números introducidos. */

import java.util.Scanner;

public class ejercicionueve {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        boolean para = true;
        int suma = 0;
        System.out.println ("Ingrese numeros para seguir con el ciclo o ingrese 0 para acabar ");

        while (para==true) {
            System.out.println ("Ingrese un numero ");
            int num = input.nextInt();
            if (num==0){
                para = false;
            } else {
                suma +=num;
            }
           
        }
        System.out.println ("La suma de los numeros ingresados es: " + suma);
    }
}