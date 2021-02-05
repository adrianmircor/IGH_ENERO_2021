/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_distancia2puntos.service;

import clase4_distancia2puntos.dto.Punto;

/**
 *
 * @author user
 */
public class PuntoService {

    public String cuadrante(Punto punto) {

        String perteneceCuadrante = "No pertenece a ningun cuadrante";

        if (punto.getX() > 0 && punto.getY() > 0) {
            perteneceCuadrante = "Pertenece al 1er cuadrante";
        } else if (punto.getX() < 0 && punto.getY() > 0) {
            perteneceCuadrante = "Pertenece al 2do cuadrante";
        } else if (punto.getX() < 0 && punto.getY() < 0) {
            perteneceCuadrante = "Pertenece al 3er cuadrante";
        } else if (punto.getX() > 0 && punto.getY() < 0) {
            perteneceCuadrante = "Pertenece al 4to cuadrante";
        }

        return perteneceCuadrante;
    }

    public double calculoDistancia(Punto p1, Punto p2) {

        double distancia;
        double difX;
        double difY;

        difX = p1.getX() - p2.getX();
        difY = p1.getY() - p2.getY();

        distancia = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
        distancia = Math.round(distancia*100.0)/100.0;
        
        return distancia;
    }

}
