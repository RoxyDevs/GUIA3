/*
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */

/**
 *
 * @author RoxDev (Roxana Rolón)
 */
import java.util.Scanner;

public class RS232 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); //creamos un objeto Scanner para leer la entrada del usuario
          int correctas = 0; //creamos una variable int para contar las lecturas correctas
          int incorrectas = 0; //creamos una variable int para contar las lecturas incorrectas
          String cadena; //creamos una variable String para guardar la cadena leída
          int contador = 0; //creamos una variable int para contar las iteraciones del bucle
          do
          { //usamos un bucle do-while para repetir el proceso hasta que se ingrese la secuencia FDE o se alcance el límite de 10 cadenas
               System.out.println("Ingrese una cadena:"); //pedimos al usuario que ingrese una cadena
               cadena = sc.nextLine(); //guardamos la cadena en la variable
               if (cadena.equalsIgnoreCase("&&&&&"))
               { //si la cadena es igual a FDE, salimos del bucle
                    break;
               } else if (cadena.trim().toUpperCase().length() == 5 && cadena.trim().toUpperCase().charAt(0) == 'X' && cadena.trim().toUpperCase().charAt(4) == 'O')
               { //si la cadena tiene 5 caracteres, el primero es X y el último es O, es correcta. Usamos trim() para eliminar los espacios en blanco y toUpperCase() para convertir la cadena a mayúsculas antes de compararla.
                    correctas++; //incrementamos el contador de lecturas correctas
               } else
               { //si la cadena no cumple con el formato, es incorrecta
                    incorrectas++; //incrementamos el contador de lecturas incorrectas
               }
               contador++; //incrementamos el contador de iteraciones del bucle
          } while (contador < 3); //repetimos el bucle mientras el contador sea menor que 10
          sc.close(); //cerramos el objeto Scanner
          System.out.println("Informe:"); //imprimimos un informe con los resultados
          System.out.println("Lecturas correctas: " + correctas);
          System.out.println("Lecturas incorrectas: " + incorrectas);
     }
}
