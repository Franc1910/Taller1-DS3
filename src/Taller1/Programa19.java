package Taller1;

public class Programa19 {
    // Atributos
    private double precio;
    private double valorDelDescuento;
    
    // Constructor
    public Programa19() {
        this.precio = precio;
        this.valorDelDescuento = 0;
    }
    
    // Método para calcular el descuento del artículo
    public void calcularDescuento() {
        if (precio >= 200) {
            valorDelDescuento = precio * 0.15;
        } else if (precio > 100 && precio < 200) {
            valorDelDescuento = precio * 0.12;
        } else {
            valorDelDescuento = precio * 0.10;
        }
    }
    
    // Getters y setters
    public double getPrecio() {
        return precio;
    }
    
    public double getValorDelDescuento() {
        return valorDelDescuento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setValorDelDescuento(double valorDelDescuento) {
        this.valorDelDescuento = valorDelDescuento;
    }
    
    public void PedirDatos(String precio) {
        this.precio = Double.parseDouble(precio);
        calcularDescuento();
    }
}
