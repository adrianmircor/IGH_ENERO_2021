package MOD03;

import java.util.Scanner;

public class Problema8 {

    public static void main(String[] args) {
        //Seccion de variables
        Scanner num = new Scanner(System.in);
        int numero;
        int n200, n100, n50, n20, n5, n2, n1;
        int divisor;

        System.out.println("Ingresar numero: ");
        //Seccion de datos
        numero = num.nextInt();
        n200 = 0;
        n100 = 0;
        n50 = 0;
        n20 = 0;
        n5 = 0;
        n2 = 0;
        n1 = 0;
        divisor = 200;

        //Seccion de proceso
        do {

            if (numero >= 200) {
                n200 = numero / divisor;
            } else if (numero >= 100 && numero < 200) {
                divisor = 100;
                n100 = numero / divisor;
            } else if (numero >= 50 && numero < 100) {
                divisor = 50;
                n50 = numero / divisor;
            } else if (numero >= 20 && numero < 50) {
                divisor = 20;
                n20 = numero / divisor;
            } else if (numero >= 5 && numero < 20) {
                divisor = 5;
                n5 = numero / divisor;
            } else if (numero >= 2 && numero < 5) {
                divisor = 2;
                n2 = numero / divisor;
            } else if (numero >= 1 && numero < 2) {
                divisor = 1;
                n1 = numero / divisor;
            }

            numero = numero % divisor;

        } while (numero % divisor != 0);

        //Seccion de reporte
        System.out.println("Billetes de 200: " + n200);
        System.out.println("Billetes de 100: " + n100);
        System.out.println("Billetes de 50: " + n50);
        System.out.println("Billetes de 20: " + n20);
        System.out.println("Billetes de 5: " + n5);
        System.out.println("Billetes de 2: " + n2);
        System.out.println("Billetes de 1: " + n1);
    }

}
