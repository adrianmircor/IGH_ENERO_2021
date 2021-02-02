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
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        int horas;
        double pagoHora, sueldoNeto, retencion, totalIngresos;

        //entrada de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese horas");
        horas = entrada.nextInt();

        System.out.println("Ingrese pago por horas");
        pagoHora = entrada.nextDouble();

        //proceso
        totalIngresos = horas * pagoHora;
        retencion = totalIngresos * 0.05;
        sueldoNeto = totalIngresos - retencion;

        //reporte
        System.out.println("El sueldo neto del trabajador es: " + sueldoNeto);
    }

}
