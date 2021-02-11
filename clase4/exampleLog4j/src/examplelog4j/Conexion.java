package examplelog4j;

import org.apache.log4j.Logger;

public class Conexion {

    private final Logger log = Logger.getLogger(Conexion.class);

    public void conectar(int num) {

        if (num == 0) {
            log.info("Exitosa");
        } else if (num < 0) {
            log.warn("Posible error");
        } else {
            log.fatal("Fatal");
        }
    }

}
