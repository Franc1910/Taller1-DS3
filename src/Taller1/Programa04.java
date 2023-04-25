package Taller1;

public class Programa04 {
    private double ancho;
    private double alto;
    
    // Calcula el área del rectángulo.
    public double calcularArea() {
        return ancho * alto;
    }
    
    // Calcula el perimetro del rectángulo.
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
    
    // Obtiene el valor del ancho del rectángulo.
    public double getAncho() {
        return ancho;
    }
    
    // Establece el valor del ancho del rectángulo.
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    // Obtiene el valor del alto del rectángulo.
    public double getAlto() {
        return alto;
    }
    
    // Establece el valor del alto del rectángulo.
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    // Pide al usuario que ingrese el alto y el ancho del rectángulo, valida los datos y los establece en los atributos de la clase.
    // Retorna True si los datos son válidos y se establecieron en los atributos de la clase, False de lo contrario.
    public boolean PedirDatos(String alto, String ancho) {
        double altoDouble = Double.parseDouble(alto);
        double anchoDouble = Double.parseDouble(ancho);

        if (altoDouble > 0 && altoDouble <= 9999 && anchoDouble > 0 && anchoDouble <= 9999) {
            this.alto = altoDouble;
            this.ancho = anchoDouble;
            return true;
        } else {
            this.alto = 0;
            this.ancho = 0;
            return false;
        }
    }
}

