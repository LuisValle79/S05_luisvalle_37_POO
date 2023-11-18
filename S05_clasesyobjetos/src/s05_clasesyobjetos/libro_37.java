/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_clasesyobjetos;

import javax.swing.*;
public class libro_37 {
    public static void main(String[] args) {
        int cantidad;
        int paginas;
        String nombre;
        
        /*construimos el cuadro de dialogo para el nombre*/
        nombre=JOptionPane.showInputDialog("Introduce el nombre del libro");
        
        /*construimos el cuadro de dialogo para la cantidad*/
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("cantidad de libros a llevar"));
        
        /*construimos el cuadro de dialogo para las paginas*/
        paginas=Integer.parseInt(JOptionPane.showInputDialog("total paginas del libro"));

        /*envio de msj*/
      
        JOptionPane.showMessageDialog(null, "Hola estimado estudiante esta llevando el libro " + nombre+" total "+cantidad+" libros con "+paginas+" paginas c/u");
   
    }
}
    

    
    

