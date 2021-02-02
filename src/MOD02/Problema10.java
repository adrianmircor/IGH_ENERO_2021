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
public class Problema10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;

        System.out.println("Bienvenidos");
        System.out.println("Ingrese el dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                if (dia < 21) {
                    System.out.println("capricornio");
                } else {
                    System.out.println("acuario");
                }
                break;
            case 2:
                if (dia < 20) {
                    System.out.println("acuario");
                } else {
                    System.out.println("piscis");
                }
                break;
            case 3:
                if (dia < 21) {
                    System.out.println("piscis");
                } else {
                    System.out.println("aries");
                }
                break;
            case 4:
                if (dia < 20) {
                    System.out.println("aries");
                } else {
                    System.out.println("tauro");
                }
                break;
            case 5:
                if (dia < 21) {
                    System.out.println("tauro");
                } else {
                    System.out.println("geminis");
                }
                break;
            case 6:
                if (dia < 21) {
                    System.out.println("geminis");
                } else {
                    System.out.println("cancer");
                }
                break;
            case 7:
                if (dia < 23) {
                    System.out.println("cancer");
                } else {
                    System.out.println("leo");
                }
                break;
            case 8:
                if (dia < 23) {
                    System.out.println("leo");
                } else {
                    System.out.println("virgo");
                }
                break;
            case 9:
                if (dia < 23) {
                    System.out.println("virgo");
                } else {
                    System.out.println("libra");
                }
                break;
            case 10:
                if (dia < 23) {
                    System.out.println("libra");
                } else {
                    System.out.println("escorpio");
                }
                break;
            case 11:
                if (dia < 22) {
                    System.out.println("escorpio");
                } else {
                    System.out.println("sagitario");
                }
                break;
            case 12:
                if (dia < 22) {
                    System.out.println("sagitario");
                } else {
                    System.out.println("capricornio");
                }
                break;
            default:
                System.out.println("ESTE MES NO EXISTE");
        }

    }
}
