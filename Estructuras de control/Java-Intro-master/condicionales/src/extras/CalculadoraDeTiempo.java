/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Bela
 */
public class CalculadoraDeTiempo {

     /**
      * @param args the command line arguments
      */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos:");
        int minutos = sc.nextInt();
        int dias = minutos / (24 * 60);
        int horas = (minutos % (24 * 60)) / 60;
        int minutosRestantes = minutos % 60;
        System.out.println(minutos + " minutos equivalen a " + dias + " días, " + horas + " horas y " + minutosRestantes + " minutos.");
    }
}
