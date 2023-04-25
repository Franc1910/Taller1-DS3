package Taller1;

public class Programa03 {
    private String color;
    private double radio;

    // Calcula el área del círculo.
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Calcula el perimetro del círculo.
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Obtiene el valor del radio del círculo.
    public double getRadio() {
        return radio;
    }

    // Establece el valor del radio del círculo.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Obtiene el color del círculo.
    public String getColor() {
        return color;
    }

    // Establece el color del círculo.
    public void setColor(String color) {
        this.color = color;
    }

    // Pide al usuario que ingrese el color y el radio del círculo, valida los datos y los establece en los atributos de la clase.
    // Retorna True si los datos son válidos y se establecieron en los atributos de la clase, False de lo contrario.
    public boolean PedirDatos(String color, String radio) {     
        this.color = color;
        double radioDouble = Double.parseDouble(radio);
        return (radioDouble > 0 && radioDouble <= 9999) ? (this.radio = radioDouble) > 0 : false;
    }
}
