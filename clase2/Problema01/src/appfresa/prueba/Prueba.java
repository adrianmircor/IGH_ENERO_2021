package appfresa.prueba;

import appfresa.ventaservice.VentaService;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        // Datos
        Scanner entrada = new Scanner(System.in);
        double precioCaja;
        int cantidadCajas;
        double porcentajeGanancia;

        System.out.println("Ingrese el precio x caja: ");
        precioCaja = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de cajas: ");
        cantidadCajas = entrada.nextInt();
        System.out.println("Ingrese el porcentaje: ");
        porcentajeGanancia = entrada.nextDouble();

        // Proceso
        VentaService service = new VentaService();
        double gastoTotal = service.calcGastosTotales(cantidadCajas, precioCaja);
        double ingresoTotal = service.calcIngresosTotales(gastoTotal, porcentajeGanancia);
        double ganancia = service.calcGanancia(gastoTotal, ingresoTotal);
        double precioVentaCaja = service.calcGanancia(ingresoTotal, cantidadCajas);
        // Reporte
        System.out.println("El gasto total es: " + gastoTotal);
        System.out.println("El ingreso total es: " + ingresoTotal);
        System.out.println("La ganancia total es: " + ganancia);
        System.out.println("El precio de venta por caja es: " + precioVentaCaja);
    }
}
