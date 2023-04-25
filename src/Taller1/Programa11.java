package Taller1;

public class Programa11 {
    private String marca;
    private String modelo;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void PedirDatos(String marca, String modelo, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = Double.parseDouble(precio);
    }
}
