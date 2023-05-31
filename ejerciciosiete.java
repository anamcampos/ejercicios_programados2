/* Solicitar un número al usuario y mostrar su cuadrado, repetir el proceso hasta
que se introduzca un número negativo */

import java.util.Scanner;

public class ejerciciosiete {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        boolean para = true;
        System.out.println ("Ingrese numeros positivos mayores a 0 para seguir con el ciclo ");

        while (para==true) {
            System.out.println ("Ingrese un numero ");
            int num = input.nextInt();
            if (num<0){
                para = false;
            } else if (num==0) {
                System.out.println ("Ingrese un numero diferente a 0 ");
            } else {
                System.out.println ("El cuadrado del numero es " + num*num);
            }
        }
    }
}