package asociacionuml;

import java.util.List;

public class Persona {

    private String nombre;
    private String edad;

    private List<Coche> coches;

    public Persona(String nombre, String edad, List<Coche> coches) {
        this.nombre = nombre;
        this.edad = edad;
        this.coches = coches;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }

}
