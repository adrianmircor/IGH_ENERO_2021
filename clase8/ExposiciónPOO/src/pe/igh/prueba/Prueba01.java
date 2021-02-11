/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.igh.prueba;

import pe.igh.complemento.TarjetaDeCredito;
import pe.igh.entidades.Cliente;

/**
 *
 * @author LENOVO
 */
public class Prueba01 {
    private Cliente cliente;
    public Prueba01(){
        cliente = new Cliente();
    }
    public void cargar(){
        cliente.setCodigo(3);
        cliente.setNombre("Julian");
        //Carga correspondiente a la agregación
        TarjetaDeCredito tarjeta = new TarjetaDeCredito();
        tarjeta.setCodigo(3434);
        tarjeta.setLimite(10000);
        
        cliente.setTarjetaDeCredito(tarjeta);
        
        //Carga correspondiente a la composición
        cliente.getVendedor().setDni("71998180");
        cliente.getVendedor().setNombre("Enrique");
        
    }
    
    public void imprimir(){
        System.out.println(cliente.toString());
    }
    public static void main(String[] args) {
        Prueba01 prueba = new Prueba01();
        prueba.cargar();
        prueba.imprimir();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
