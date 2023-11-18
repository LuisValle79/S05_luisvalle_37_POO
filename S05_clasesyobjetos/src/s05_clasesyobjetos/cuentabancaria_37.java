/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_clasesyobjetos;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class cuentabancaria_37 {
  public static void main(String[] args) {
      
              Scanner sc = new Scanner(System.in);
              
              String nombrett;
              String numerocuenta;
              
              System.out.print("Introduce el nombre del titular de la cuenta: ");
              nombrett = sc.nextLine(); //leer el nombre del titular
              System.out.print("Introduce el numero de la cuenta: ");
              numerocuenta = sc.nextLine(); //leer el numero de la cuenta
                                                                   
              System.out.println("Nombre del titular: "+ nombrett);
              System.out.println("Numero de cuenta: " + numerocuenta);
                                                                   
       }
}