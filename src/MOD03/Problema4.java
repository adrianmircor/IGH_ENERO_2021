/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD03;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num01 = 0;
        int num02 = 1;
        int num03;
        int n;

        System.out.println("Ingrese la cantidad de elementos: ");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(num01);
            num03 = num01 + num02;
            num01 = num02;
            num02 = num03;
        }
    }

}
