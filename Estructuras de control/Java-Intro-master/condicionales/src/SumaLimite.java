/*
Bucles y sentencias de salto break y continue

 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */

/**
 *
 * @author Bela
 */
import java.util.Scanner;

public class SumaLimite {

     public static void main(String[] args) {
          
          //creamos un objeto Scanner para leer la entrada del usuario
          Scanner sc = new Scanner(System.in);
          
          //pedimos al usuario que ingrese un valor límite positivo
          System.out.println("Ingrese un valor límite positivo:");
          
          //guardamos el valor límite en una variable int
          int limite = sc.nextInt();
          
          //creamos una variable int para guardar la suma de los números introducidos
          int suma = 0; 
          while (suma <= limite)
               
          { //usamos un bucle while para repetir el proceso mientras la suma sea menor o igual que el límite
               //pedimos al usuario que ingrese un número
               System.out.println("Ingrese un número:"); 
               
               //guardamos el número en una variable int
               int numero = sc.nextInt(); 
               if (numero < 0)
                    
               { //si el número es negativo
                    //salimos del bucle
                    break; 
               }
               //sumamos el número a la suma
               suma = suma + numero; 
          }
          //imprimimos un mensaje cuando se sale del bucle 
          System.out.println("La suma de los números introducidos supera el límite inicial."); 
     }
}
