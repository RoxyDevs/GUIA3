/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*       *
*       *
* * * *
 */

/**
 *
 * @author RoxDev (Roxana Rolón)
 */
import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese el número de elementos por lado del cuadrado:"); //pedimos al usuario que ingrese el número de elementos por lado
        int n = sc.nextInt(); //guardamos el número en una variable int
        sc.close(); //cerramos el objeto Scanner
        for (int i = 0; i < n; i++) { //usamos un bucle for para recorrer las filas del cuadrado
            for (int j = 0; j < n; j++) { //usamos otro bucle for para recorrer las columnas del cuadrado
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) { //si estamos en la primera o última fila o columna, imprimimos un "*"
                    System.out.print("* ");
                } else { //si no, imprimimos un espacio en blanco
                    System.out.print("  ");
                }
            }
            System.out.println(); //al final de cada fila, imprimimos un salto de línea
        }
    }
}

