package MOD03;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        //Seccion variables
        Scanner num;
        num = new Scanner(System.in);
        int x, sumPar = 0, sumImpar = 0;

        //Seccion datos
        System.out.println("Ingrese el numero: ");
        x = num.nextInt();

        //Seccion proceso
        for (int i = 1; i <= x; i++) {

            if (i % 2 == 0) {
                sumPar = sumPar + i;
            } else {
                sumImpar = sumImpar + i;
            }
        }

        //Seccion proceso
        System.out.println("Suma par: " + sumPar);
        System.out.println("Suma impar: " + sumImpar);
    }

}
