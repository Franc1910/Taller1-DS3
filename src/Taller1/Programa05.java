package Taller1;

public class Programa05 {
    private double base;
    private double altura;
    
    // Calcula el área del triángulo.
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    // Calcula el perimetro del triángulo.
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + lado;
    }
    
    // Obtiene el valor del ancho del triángulo.
    public double getBase() {
        return base;
    }
    
    // Establece el valor del ancho del triángulo.
    public void setBase(double base) {
        this.base = base;
    }
    
    // Obtiene el valor del alto del triángulo.
    public double getAltura() {
        return altura;
    }
    
    // Establece el valor del alto del triángulo.
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Pide al usuario que ingrese la altura y la base del triángulo, valida los datos y los establece en los atributos de la clase.
    // Retorna True si los datos son válidos y se establecieron en los atributos de la clase, False de lo contrario.
    public boolean PedirDatos(String base, String altura) {
        double alturaDouble = Double.parseDouble(base);
        double baseDouble = Double.parseDouble(altura);

        if (alturaDouble > 0 && alturaDouble <= 9999 && baseDouble > 0 && baseDouble <= 9999) {
            this.altura = alturaDouble;
            this.base = baseDouble;
            return true;
        } else {
            this.altura = 0;
            this.base = 0;
            return false;
        }
    }
}
