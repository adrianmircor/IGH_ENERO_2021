/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD02;

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
        int cantidad;
        double precio, descuento, totalPagar;

        //entrada de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos");
        cantidad = entrada.nextInt();

        System.out.println("Ingrese el precio del productos");
        precio = entrada.nextDouble();

        //proceso
        if (cantidad >= 1 && cantidad < 12) {
            totalPagar = precio * cantidad;
        } else if (cantidad >= 12 && cantidad < 24) {
            descuento = (precio * cantidad) * 0.05;
            totalPagar = precio * cantidad - descuento;
        } else if (cantidad >= 24 && cantidad < 36) {
            descuento = (precio * cantidad) * 0.10;
            totalPagar = precio * cantidad - descuento;
        } else {
            descuento = (precio * cantidad) * 0.15;
            totalPagar = precio * cantidad - descuento;
        }

        //reporte
        System.out.println("Importe de venta: " + totalPagar);
    }

}
