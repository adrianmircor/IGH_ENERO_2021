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

public class Problema6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num01;
        double num02;
        double num03;
        double s;
        double area;

        System.out.println("Bienvenidos");
        System.out.println("Ingrese el primer numero: ");
        num01 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num02 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num03 = entrada.nextInt();

        s = (num01 + num02 + num03) / 2;
        area = (Math.sqrt(s * (s - num01) * (s - num02) * (s - num03)));
        System.out.println("El area del triangulo es: " + area);

    }
}
