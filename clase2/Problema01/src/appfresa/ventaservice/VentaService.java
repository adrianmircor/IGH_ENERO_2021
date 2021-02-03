package appfresa.ventaservice;

public class VentaService {

    public double calcGastosTotales(int cantidadCajas, double precioCaja) {
        double gastoTotal;
        gastoTotal = (cantidadCajas * precioCaja) * 1.05;
        return gastoTotal;
    }

    public double calcIngresosTotales(double gastoTotal, double porcentajeGanancia) {
        double ingresoTotal;
        ingresoTotal = gastoTotal * porcentajeGanancia + gastoTotal;
        return ingresoTotal;
    }

    public double calcGanancia(double gastoTotal, double ingresoTotal) {
        double ganancia;
        ganancia = ingresoTotal - gastoTotal;
        return ganancia;
    }
    
    public double calcprecioVentaCaja(double ingresoTotal, int cantidadCajas) {
         double precioVentaCaja;
         precioVentaCaja = ingresoTotal/cantidadCajas;
         return precioVentaCaja;
    }

}
