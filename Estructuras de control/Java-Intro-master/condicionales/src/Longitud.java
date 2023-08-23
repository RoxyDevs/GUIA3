/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */

/**
 *
 * @author RoxDev (Roxana Rolón)
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Longitud {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        System.out.println("Introduce una frase o palabra:"); // Mostrar un mensaje al usuario
        String frase = sc.nextLine(); // Leer una frase o palabra por teclado
        if (frase.length() == 8) { // Si la longitud de la frase o palabra es igual a 8 usando el método length()
            System.out.println("CORRECTO"); // Mostrar un mensaje de CORRECTO
        } else { // Si no
            System.out.println("INCORRECTO"); // Mostrar un mensaje de INCORRECTO
        }
        sc.close(); // Cerrar el objeto Scanner
    }
}
