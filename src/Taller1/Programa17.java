package Taller1;

public class Programa17 {
    private String destino;
    private double precio;

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void PedirDatos(String destino, String precio) {
        this.destino = destino;
        this.precio = Double.parseDouble(precio);
    }
}
