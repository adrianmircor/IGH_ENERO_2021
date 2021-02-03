package MOD03;

import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        
        //reporte?
        

        //Seccion de variables
        Scanner num;
        num = new Scanner(System.in);
        int x, res = 0;

        //Seccion de datos
        System.out.println("Ingrese el numero: ");
        x = num.nextInt();

        //Seccion de proceso
        for (int i = 0; i <= 10; i++) {
            res = i * x;
            System.out.println("res: " + res);

        }

        //Seccion de reporte
    }

    
}
