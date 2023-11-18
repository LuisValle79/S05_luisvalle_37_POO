
package s05_clasesyobjetos;

import javax.swing.*;
public class estudiante_37 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        
        
        /*construimos el cuadro de dialogo para el nombre*/
        nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        
        /*construimos el cuadro de dialogo para la edad*/
        edad=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad"));

        /*envio de msj*/
      
        JOptionPane.showMessageDialog(null, "Hola " + nombre+" tu edad es "+edad+" años campeon");
   
    }
    
}
