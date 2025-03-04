/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.view;

import java.util.Scanner;

/**
 *
 * @author dfpar
 */
public class Ventana {

    Scanner scanner = new Scanner(System.in);

    public String leerNombre() {

        return scanner.nextLine();
    }

    public double leerAltura() {

        return scanner.nextDouble();
    }

    public int leerPeso() {
        return scanner.nextInt();
    }

    public int leerEdad() {
        return scanner.nextInt();
    }

    public int leerNivelAzucar() {
        return scanner.nextInt();
    }

    public int leerImc() {
        return scanner.nextInt();
    }

    public int leerPresionArterial() {
        return scanner.nextInt();
    }

    public int leerCalorias() {
        return scanner.nextInt();
    }

    public int leerCantFibra() {
        return scanner.nextInt();
    }

    public int leerCantProteina() {
        return scanner.nextInt();
    }

    public String leerMedicacion() {
        return scanner.nextLine();
    }

}
