package asociacionuml;

import java.util.ArrayList;
import java.util.List;

public class AsociacionUML {

    public static void main(String[] args) {

        Coche c1 = new Coche("UA-123", "BMW");
        Coche c2 = new Coche("EX-123", "Mercedes-Benz");
        Coche c3 = new Coche("CD-123", "MercedesAudi");
        Coche c4 = new Coche("GA-123", "Ford");
        Coche c5 = new Coche("PA-123", "Renault");

        List<Coche> listaCochesP1 = new ArrayList<>();

        listaCochesP1.add(c1);
        listaCochesP1.add(c2);
        listaCochesP1.add(c3);

        List<Coche> listaCochesP2 = new ArrayList<>();

        listaCochesP2.add(c4);
        listaCochesP2.add(c5);

        Persona p1 = new Persona("Daniel", "23", listaCochesP1);
        Persona p2 = new Persona("Pedro", "20", listaCochesP2);
        Persona p3 = new Persona("Lorena", "18", null);

        for (int i = 0; i < p1.getCoches().size(); i++) {
            System.out.println("Coches de " + p1.getNombre() + ": " + p1.getCoches().get(i));
        }

        for (int i = 0; i < p2.getCoches().size(); i++) {
            System.out.println("Coches de " + p2.getNombre() + ": " + p2.getCoches().get(i));
        }

        if (p3.getCoches() == null) {
            System.out.println("Coches de "+p3.getNombre() + ": No tiene coches");
        }

        //p1 -> tiene c1,c2,c3
        //p2 -> tiene c4,c5
        //p3 -> tiene 0 carros
    }

}
