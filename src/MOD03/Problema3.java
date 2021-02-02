package MOD03;

import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {

        //Seccion de variables
        Scanner num;
        num = new Scanner(System.in);
        int x, contador = 0;
        String msje ;

        //Seccion de datos
        System.out.println("Ingrese el numero: ");
        x = num.nextInt();
        msje = "No es primo";

        //Seccion de proceso
        for (int i = 1; i <= x; i++) {

            if (x == 1) {
                break;
            }

            if (x % i == 0) {
                contador++;
            }

            if (x == i) {
                if (contador == 2) {
                    msje = "Es primo";
                    break;
                }
            }

        }

        //Seccion de reporte
        System.out.println(msje);
    }

}
