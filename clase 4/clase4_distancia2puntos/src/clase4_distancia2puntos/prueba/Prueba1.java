/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_distancia2puntos.prueba;

import clase4_distancia2puntos.dto.Punto;
import clase4_distancia2puntos.service.PuntoService;

/**
 *
 * @author user
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        Punto p1;
        Punto p2;
        Punto p3;
        Punto p4;
        PuntoService puntoService = new PuntoService();
        String cuadrante;
        double calculoDistancia;
        //Datos
        p1 = new Punto(1, 4);
        p2 = new Punto(-1, 4);
        p3 = new Punto(1, -4);
        p4 = new Punto(-1, -4);
        //Proceso
        cuadrante = puntoService.cuadrante(p1);
        calculoDistancia = puntoService.calculoDistancia(p1, p4);
        //Reporte
        System.out.println("Pertenece al cuadrante: " + cuadrante);
        System.out.println("Distnacia entre puntos: " + calculoDistancia);

    }

}
