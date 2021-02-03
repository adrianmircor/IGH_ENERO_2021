package MOD03;

import java.util.Scanner;

public class Problema6 {

    public static void main(String[] args) {

        //Seccion de variables
        Scanner num;
        num = new Scanner(System.in);
        int dividendo, divisor, cociente = 0, residuo = 0;
        int resta, c = 0;

        //Seccion de datos
        System.out.println("Ingrese el numero: ");
        dividendo = num.nextInt();
        divisor = num.nextInt();

        //Seccion de proceso
        do {
            
            c++;

            resta = dividendo - divisor;
            dividendo = resta;
            cociente = c;
            residuo = resta;

        } while (resta >= divisor);

        //Seccion de reporte
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

    }

}
