package examplelog4j;

import org.apache.log4j.PropertyConfigurator;

public class ExampleLog4j {

    public static void main(String[] args) {
        
        PropertyConfigurator.configure("Log4j.properties");
        org.apache.log4j.BasicConfigurator.configure(); //Mostrar por consola

        Conexion c1 = new Conexion();
        c1.conectar(0);
        c1.conectar(-1);
        c1.conectar(2);
    }

}
