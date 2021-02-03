package MOD03;

import java.util.Scanner;

public class Problema7 {

    public static void main(String[] args) {

        //Seccion de variables
        Scanner num;
        num = new Scanner(System.in);
        int num1, num2, mcd;
        int i, min;

        //Seccion de datos
        System.out.println("Ingrese los numeros: ");
        num1 = num.nextInt();
        num2 = num.nextInt();
        mcd = 1;
        i = 1;
        min = Math.min(num1, num2);

        //Seccion de proceso
        while (i <= min) {

            if (num1 % i == 0 && num2 % i == 0) {
                num1 = num1 / i;
                num2 = num2 / i;
                mcd = i * mcd;
                if (i == 1) {
                    i++;
                }
            } else {
                i++;
            }

        }

        //Seccion de reporte
        System.out.println("MCD: " + mcd);

    }

}
