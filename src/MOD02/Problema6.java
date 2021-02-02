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
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int nota1, nota2, nota3, nota4, menor1, menor2, menorTotal;
        String condicion;
        double promedio;

        //entrada de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese primer numero");
        nota1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero");
        nota2 = entrada.nextInt();

        System.out.println("Ingrese tercer numero");
        nota3 = entrada.nextInt();

        System.out.println("Ingrese cuarto numero");
        nota4 = entrada.nextInt();

        //proceso
        menor1 = Math.min(nota1, nota2);
        menor2 = Math.min(nota3, nota4);

        menorTotal = Math.min(menor1, menor2);

        if (nota1 != menorTotal) {
            if (nota2 != menorTotal) {
                if (nota3 != menorTotal) {
                    if (nota4 != menorTotal) {
                        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
                    } else {
                        promedio = (nota1 + nota2 + nota3) / 3;
                    }
                } else {
                    promedio = (nota1 + nota2 + nota4) / 3;
                }
            } else {
                promedio = (nota1 + nota3 + nota4) / 3;
            }
        } else {
            promedio = (nota2 + nota3 + nota4) / 3;
        }

        if (promedio >= 14) {
            condicion = "Aprobado";
        } else {
            condicion = "Desaprobado";
        }

        //Reporte
        System.out.println("Promedio: " + promedio);
        System.out.println("Condicion: " + condicion);
    }

}
