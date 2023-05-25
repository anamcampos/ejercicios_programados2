//Solicitar al usuario un número entre 0 y 9999 y decir cuantas cifras tiene

import java.util.Scanner;

public class ejerciciocinco {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Ingrese un numero entre 0 y 9999 ");
        int num = input.nextInt();
        while (num<=0 || num>9999){
            System.out.println ("Ingrese un numero entre 0 y 9999, no negativos o mayores ");
             num = input.nextInt();
        }
        if (num<10) {
            System.out.println ("El numero tiene 1 cifra");
        } else if (num>=10 && num<100){
            System.out.println ("El numero tiene 2 cifras");
        } else if (num>=100 && num< 1000){
            System.out.println ("El numero tiene 3 cifras");
        } else {
            System.out.println ("El numero tiene 4 cifras");
        }

        

    }

}