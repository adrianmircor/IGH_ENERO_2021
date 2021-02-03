/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD01;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        int estudiantes;
        double costo, importe;

        //entrada de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nro de estudiantes");
        estudiantes = entrada.nextInt();

        System.out.println("Ingrese el costo por estudiante");
        costo = entrada.nextInt();

        //proceso
        importe = estudiantes * costo;

        //reporte
        System.out.println("El importe a pagar es: " + importe);
    }

}
