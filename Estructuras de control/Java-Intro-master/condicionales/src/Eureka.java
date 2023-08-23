/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RoxDev (Roxana Rolón)
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Eureka {

     public static void main(String[] args) {

          // Crear un objeto Scanner 
          Scanner sc = new Scanner(System.in);

          // Mostrar un mensaje al usuario
          System.out.println("Introduce una frase:");

          // Leer una frase por teclado
          String frase = sc.nextLine();
          if (frase.equals("eureka"))
               
          { // Si la frase es igual a "eureka" usando el método equals()
               // Mostrar un mensaje de Correcto
               System.out.println("Correcto"); 
          // Si no
          } else{ 
               // Mostrar un mensaje de Incorrecto
               System.out.println("Incorrecto"); 
          }
          // Cerrar el objeto Scanner
          sc.close(); 
     }
}
