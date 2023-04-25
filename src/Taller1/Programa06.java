package Taller1;

import javax.swing.JOptionPane;

public class Programa06 {
    private String nombreTitular;
    private String numeroCuenta;
    private double saldo;    

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    /**
    * Método que permite pedir los datos del titular de la cuenta y validar el saldo.
    * @param nombretitular el nombre del titular de la cuenta
    * @param numerocuenta el número de cuenta
    * @param saldo el saldo inicial de la cuenta
    * @return true si el saldo es válido (entre 1 y 1000), false de lo contrario
    */
    public boolean PedirDatos(String nombretitular, String numerocuenta, String saldo) {
        this.nombreTitular = nombretitular;
        this.numeroCuenta = numerocuenta;
        double saldoDouble = Double.parseDouble(saldo);

        if (saldoDouble > 0 && saldoDouble <= 1000) {
            this.saldo = saldoDouble;
            return true;
        } else {
            this.saldo = 0;
            return false;
        }
    }
    
    // Método para validar un monto numérico ingresado por el usuario
    // Devuelve el monto ingresado como un valor double o -1 si se cancela la operación
    private double validarMonto(String mensaje, String titulo) {
        String monto = "";
        boolean montoValido = false;

        while (!montoValido) {
            // Muestra un cuadro de diálogo para solicitar al usuario el ingreso de un monto numérico
            monto = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
            
            // Si el usuario cancela la operación, retorna -1
            if (monto == null) {
                return -1;
            }          
            
            // Utiliza una expresión regular para validar el monto ingresado
            if (!monto.matches("^([1-9]\\d{0,2}|1000)(\\.\\d{1,2})?$")) {
                // Si el monto no cumple con los criterios de la expresión regular, muestra un mensaje de error
                Pantallas.Utilidades.mostrarMensaje("Monto inválido. Por favor ingrese un valor numérico entre 1 y 1000, con un máximo de 2 decimales separados por un punto.", "Error");
            } else {
                // Si el monto es válido, sale del bucle while
                montoValido = true;
            }
        }
        
        // Convierte el monto ingresado a un valor double y lo retorna
        return Double.parseDouble(monto);
    }
    
    // Método para depositar un monto en la cuenta bancaria
    public void depositar() {
        // Llama al método validarMonto para obtener el monto a depositar
        double montoNumerico = validarMonto("Ingrese el monto a depositar:", "Depósito");
        
        // Si el valor devuelto por validarMonto es mayor o igual a cero, actualiza el saldo de la cuenta
        if (montoNumerico >= 0) {
            saldo += montoNumerico;
            // Muestra un mensaje de éxito en un cuadro de diálogo
            Pantallas.Utilidades.mostrarMensaje("Se ha depositado $" + montoNumerico + " en la cuenta de " + nombreTitular + ".", "Depósito exitoso");
        }
    }
    
    // Método para retirar un monto de la cuenta bancaria
    public void retirar() {
        // Llama al método validarMonto para obtener el monto a retirar
        double montoNumerico = validarMonto("Ingrese el monto a retirar:", "Retiro");
        
        // Si el valor devuelto por validarMonto es mayor o igual a cero, verifica que haya suficiente saldo y actualiza el saldo de la cuenta
        if (montoNumerico >= 0) {
            if (montoNumerico > saldo) {
                // Si el monto a retirar es mayor que el saldo disponible, muestra un mensaje de error en un cuadro de diálogo
                Pantallas.Utilidades.mostrarMensaje("El monto a retirar es mayor que el saldo disponible en la cuenta.", "Error");
            } else {
                saldo -= montoNumerico;
                Pantallas.Utilidades.mostrarMensaje("Se ha retirado $" + montoNumerico + " de la cuenta de " + nombreTitular + ".", "Retiro exitoso");
            }
        }
    }
}
