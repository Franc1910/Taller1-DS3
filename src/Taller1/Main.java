package Taller1;
/**
 * Importación de los paquetes necesarios para la personalización de la aplicación.
 * Se importan los paquetes para la manipulación de colores, fuentes y los componentes
 * necesarios para personalizar la apariencia de la interfaz de usuario.
 */
import java.awt.Color;  // Paquete para la manipulación de colores
import java.awt.Font;  // Paquete para la manipulación de fuentes
import java.util.Locale;  // Paquete para establecer el idioma de la aplicación
import javax.swing.BorderFactory;
import javax.swing.UIManager;  // Paquete para personalizar la apariencia de los componentes de la interfaz de usuario
import javax.swing.UnsupportedLookAndFeelException;  // Paquete para manejar excepciones de personalización de la apariencia de la interfaz de usuario

public class Main {  
    /**
    * Definición de la fuente personalizada a utilizar en la aplicación.
    * La fuente se crea con el nombre "Lucida Sans", estilo "PLAIN" y tamaño 20.
    */
    public static Font FuentePersonalizada = new Font("Lucida Sans", Font.PLAIN, 20);
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException { 
         /**
         * Personalización del idioma y estilo de los JOptionPane.
         * Se establece el idioma en español y se cambia el texto de los botones "Sí" y "No".
         * Se establece la fuente personalizada para el texto y los botones de los JOptionPane.
         */
        Locale.setDefault(new Locale("es", "ES"));  // Establecer idioma en español
        UIManager.put("OptionPane.yesButtonText", "Sí");  // Cambiar texto del botón "YES"
        UIManager.put("OptionPane.noButtonText", "No");  // Cambiar texto del botón "NO"
        UIManager.put("OptionPane.okButtonText", "Aceptar");  // Cambiar texto delbotón "OK"
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.font", Main.FuentePersonalizada);  // Establecer fuente personalizada para el texto de los JOptionPane
        UIManager.put("OptionPane.messageFont", Main.FuentePersonalizada);  // Establecer fuente personalizada para el mensaje de los JOptionPane
        UIManager.put("OptionPane.buttonFont", Main.FuentePersonalizada);  // Establecer fuente personalizada para los botones de los JOptionPane

         /**
         * Personalización del estilo de las tooltips.
         * Se establece el color de fondo a un tono claro de gris y el color de texto a negro.
         * Se elimina el borde y se establece la fuente personalizada para el texto de las tooltips.
         */
        UIManager.put("ToolTip.background", Color.decode("#f7f6f9"));  // Establecer color de fondo de la tooltip
        UIManager.put("ToolTip.foreground", Color.BLACK);  // Establecer color de texto de la tooltip
        UIManager.put("ToolTip.border", false);  // Eliminar el borde de la tooltip
        UIManager.put("ToolTip.font", Main.FuentePersonalizada);  // Establecer fuente personalizada para el texto de la tooltip
        
        UIManager.put("ScrollPane.border", BorderFactory.createEmptyBorder());  // Establecer bordes invisibles
       
        new Pantallas.Login().setVisible(true);
    }
}
