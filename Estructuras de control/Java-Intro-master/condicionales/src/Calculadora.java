/*
. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

Por ejemplo:

MENU:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija la opción que corresponda.
 */

/**
 *
 * @author RoxDev (Roxana Rolón)
 */
import java.util.Scanner;

public class Calculadora {

     public static void main(String[] args) {
          //creamos un objeto Scanner para leer la entrada del usuario
          Scanner sc = new Scanner(System.in); 
          
          //pedimos al usuario que ingrese dos números enteros positivos
          System.out.println("Ingrese dos números enteros positivos:"); 
          
          //guardamos el primer número en una variable int
          int num1 = sc.nextInt(); 
          //guardamos el segundo número en una variable int
          int num2 = sc.nextInt(); 
          //creamos una variable int para guardar la opción elegida por el usuario
          int opcion; 
          
          do
          { //usamos un bucle do-while para repetir el menú hasta que se elija la opción 5
               System.out.println("MENU:");
               System.out.println("1. Sumar");
               System.out.println("2. Restar");
               System.out.println("3. Multiplicar");
               System.out.println("4. Dividir");
               System.out.println("5. Salir");
               System.out.println("Elija la opción que corresponda.");
               //leemos la opción elegida por el usuario
               opcion = sc.nextInt(); 
               OUTER:
               switch (opcion)
               {
                    //si la opción es 1, sumamos los números y mostramos el resultado
                    case 1: 
                         int suma = num1 + num2;
                         System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
                         break;
                         
                    //si la opción es 2, restamos los números y mostramos el resultado     
                    case 2: 
                         int resta = num1 - num2;
                         System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
                         break;
                    //si la opción es 3, multiplicamos los números y mostramos el resultado     
                    case 3: 
                         int producto = num1 * num2;
                         System.out.println("El producto de " + num1 + " y " + num2 + " es " + producto);
                         break;
                    //si la opción es 4, dividimos los números y mostramos el resultado     
                    case 4: 
                         if (num2 != 0)
                         { //verificamos que el segundo número no sea cero para evitar una división por cero
                              //convertimos los números a double para obtener un resultado decimal
                              double division = (double) num1 / num2; 
                              System.out.println("La división de " + num1 + " y " + num2 + " es " + division);
                         } else
                              
                         { //si el segundo número es cero, mostramos un mensaje de error
                              System.out.println("No se puede dividir por cero.");
                         }
                         break;
                    case 5:
                         
                         System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                         char respuesta = sc.next().charAt(0);
                         switch (respuesta)
                         {
                              case 'S', 's' ->
                         {
                              //si la respuesta es 'S' o 's', salimos del bucle y del programa
                              break OUTER;
                         }
                              case 'N', 'n' ->
                         {
                              //si la respuesta es 'N' o 'n', volvemos al menú
                              continue;
                         }
                              default ->
                         {
                              //si la respuesta no es ninguna de las anteriores, mostramos un mensaje de error y volvemos al menú
                              System.out.println("Opción inválida.");
                              continue;
                         }
                         }
                    //si la opción no es ninguna de las anteriores, mostramos un mensaje de error y volvemos al menú
                    default:
                         System.out.println("Opción inválida.");
                         break;
               }
          //repetimos el bucle mientras la opción no sea 5     
          } while (opcion != 5); 
          //cerramos el objeto Scanner
          sc.close(); 
          //imprime
          System.out.println("Gracias por usar la calculadora."); 
     }
}
