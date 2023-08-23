/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Bela
 */
import java.util.Scanner;

public class PrimeraLetraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese una frase o palabra:"); //pedimos al usuario que ingrese una frase o palabra
        String frase = sc.nextLine(); //guardamos la frase o palabra en una variable String
        sc.close(); //cerramos el objeto Scanner
        if (frase.substring(0, 1).equals("A")) { //usamos el método substring para obtener la primera letra de la frase y el método equals para compararla con "A"
            System.out.println("CORRECTO"); //si la primera letra es "A", imprimimos "CORRECTO"
        } else {
            System.out.println("INCORRECTO"); //si la primera letra no es "A", imprimimos "INCORRECTO"
        }
    }
}
