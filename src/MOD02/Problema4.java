/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD02;

import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num01;

        System.out.println("Bienvenidos");
        System.out.println("Ingrese el primer numero: ");
        num01 = entrada.nextInt();

        if (num01 >= 80) {
            System.out.println("SISTEMAS");
        } else {
            if (num01 >= 70 && num01 < 80) {
                System.out.println("ELECTRONICA");
            } else {
                if (num01 >= 60 && num01 < 70) {
                    System.out.println("INDUSTRIAL");
                } else {
                    if (num01 >= 50 && num01 < 60) {
                        System.out.println("MECANICA");
                    } else {
                        System.out.println("NO INGRESO A NINGUNA ESCUELA");
                    }
                }
            }

        }
    }
}
