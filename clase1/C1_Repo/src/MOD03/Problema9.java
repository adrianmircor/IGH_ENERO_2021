package MOD03;

import java.util.Scanner;

public class Problema9 {

    public static void main(String[] args) {

        //Seccion de variables
        Scanner num = new Scanner(System.in);
        int nota;
        int compensacion = 0;
        int resto = 0;
        int rango = 0;

        System.out.println("Ingresar numero: ");
        //Seccion de datos
        nota = num.nextInt();

        //Seccion de proceso
        do {
            if (rango >= 0 && rango <= 5) {
                resto = nota - rango;
                compensacion = compensacion + nota * 50;
            } else if (rango >= 6 && rango <= 12) {

            } else if (rango >= 13 && rango <= 17) {

            } else if (rango >= 18 && rango <= 20) {

            }

        } while (resto != 0);

        //Seccion de reporte
        System.out.println("Billetes de 1: ");

    }

}
