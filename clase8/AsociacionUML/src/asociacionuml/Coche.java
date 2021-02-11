package asociacionuml;

public class Coche {

    private String placa;
    private String marca;

    public Coche(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa + " Marca: " + this.marca;
    }

}
