// Solcitar al usuario un número N de sueldos, y mostrar el sueldo máximo.

import java.util.Scanner;

public class ejercicioonce {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        boolean para = true;
        System.out.println ("Ingrese salarios mayores a 0 para continuar el ciclo o de lo contrario ingrese 0 o negativo para terminarlo ");
        int max = 0;

        while (para==true) {
            System.out.println ("Ingrese un numero ");
            int num = input.nextInt();
            if (num>max){
                max= num;
            }
            if (num<=0){
                para = false;
            }
        }
        System.out.println ("El salario maximo es de: " + max);
    }
}