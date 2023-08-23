/*
  Crear un programa que dado un número determine si es par o impar.
 */

/**
 *
 * @author RoxDev (Roxana Rolón)
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class ParImpar {

     public static void main(String[] args) {

          // Crear un objeto Scanner
          Scanner sc = new Scanner(System.in);

          // Mostrar un mensaje al usuario
          System.out.println("Introduce un número entero:");
          
         // Leer un número entero por teclado
          int numero = sc.nextInt(); 
          if (numero % 2 == 0) {
               
          // Si el número es divisible entre 2 (el residuo es 0)
           
               // Mostrar que el número es par
               System.out.println("El número " + numero + " es par"); 
         // Si no
          } else {
               // Mostrar que el número es impar
               System.out.println("El número " + numero + " es impar"); 
          }
          // Cerrar el objeto Scanner
          sc.close(); 
     }
}
