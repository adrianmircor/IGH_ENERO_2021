/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD01;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Problema9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num01;
        int num02;
        int tiempo;

        System.out.println("Bienvenidos");
        System.out.println("Ingrese la distancia en Km: ");
        num01 = entrada.nextInt();
        System.out.println("Ingrese la velocidad en Km/Hora: ");
        num02 = entrada.nextInt();

        tiempo = num01 / num02;

        System.out.println("El tiempo que demora en desplazarse es de: " + tiempo + " horas.");

    }
}
