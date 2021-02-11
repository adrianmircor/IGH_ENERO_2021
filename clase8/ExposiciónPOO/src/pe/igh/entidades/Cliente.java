/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.igh.entidades;

import pe.igh.complemento.TarjetaDeCredito;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    private int codigo;
    private String nombre;
    //Variable de composición
    private Vendedor vendedor;
    
    //Variable de la agregación
    private TarjetaDeCredito tarjetaDeCredito;
    public Cliente(){
        super();
        codigo=0;
        nombre="";
        //Aplicación de composición
        vendedor = new Vendedor();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Aplicando la agregación
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", vendedor=" + vendedor + ", tarjetaDeCredito=" + tarjetaDeCredito 
                + '}';
    }

   
}
