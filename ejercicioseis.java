/*Solicitar al usuario el día, mes y año de una fecha e indicar si la fecha es
correcta. Suponiendo todos los meses de 30 días. */

import java.util.Scanner;

public class ejercicioseis {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Ingrese un dia ");
        int dia = input.nextInt();
        while (dia<=0){
            System.out.println ("Ingrese un dia ");
         dia = input.nextInt();
        }
        System.out.println ("Ingrese un mes en numero ");
        int mes = input.nextInt();
        while (mes<=0){
            System.out.println ("Ingrese un mes en numero");
         mes = input.nextInt();
        }
        System.out.println ("Ingrese un año ");
        int ano = input.nextInt();
        while (ano<=0){
            System.out.println ("Ingrese un año ");
         ano = input.nextInt();
        }

        if (dia>30 || mes>12 || ano>2023){
            System.out.println ("La fecha no es correcta ");
        } else {
            System.out.println ("La fecha es correcta "+dia+"/"+mes+"/"+ano);
        }

    }
}