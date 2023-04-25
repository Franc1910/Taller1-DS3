package Taller1;

public class Programa20 {
    // Atributos
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;
    private double sueldoBase;
    private double pagoExtra;

    public Programa20() {
        this.pagoExtra = 0;
        this.sueldoBase = 0;
    }
    
    // Métodos
    public void calcularSueldoSemanal() {
        if (horasTrabajadas <= 40) {
            sueldoBase = horasTrabajadas * pagoPorHora;
        } else {
            double horasExtra = horasTrabajadas - 40;
            sueldoBase = 40 * pagoPorHora;
            pagoExtra = horasExtra * pagoPorHora * 2;
        }
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getPagoExtra() {
        return pagoExtra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    
    public void PedirDatos(String nombre, String horasTrabajadas, String pagoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = Integer.parseInt(horasTrabajadas);
        this.pagoPorHora = Double.parseDouble(pagoPorHora);
        calcularSueldoSemanal();
    }
}
