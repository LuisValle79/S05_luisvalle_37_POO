/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_clasesyobjetos;
import java.util.Scanner;

public class auto_37 {
public static void main(String[] args) {
    
              Scanner sc = new Scanner(System.in);
              String marca, modelo;              
              int kilometraje;
              
              System.out.print("Introduce el modelo del auto: ");
              modelo = sc.nextLine(); //leer el modelo 
              System.out.print("Introduce la marca del auto: ");              
              marca = sc.nextLine(); //leer la marca
              System.out.print("Introduce el kilometraje del auto: ");
              kilometraje = sc.nextInt(); //leer el kilometraje
              
              
              /*impresiones*/
              System.out.println("Modelo: " + modelo);
              System.out.println("Marca: "+ marca);             
              System.out.println("kilometraje: " + kilometraje);                                                     
       }
}
