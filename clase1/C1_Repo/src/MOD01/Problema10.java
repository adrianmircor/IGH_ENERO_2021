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
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        double catetoA, catetoB, hipotenusa, area, perimetro;

        Scanner entrada = new Scanner(System.in);

        //entrada de datos
        System.out.println("Ingrese cateto A");
        catetoA = entrada.nextInt();

        System.out.println("Ingrese cateto B");
        catetoB = entrada.nextInt();

        //proceso
        hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        area = (catetoA * catetoB) / 2;
        perimetro = catetoA + catetoB + hipotenusa;

        //reporte
        System.out.println("La hipotenusa es: " + hipotenusa);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }

}
