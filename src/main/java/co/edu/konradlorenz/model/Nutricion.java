/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author dfpar
 */
public class Nutricion extends Persona{

    private int calorias, cantFibra, cantProteina;

    public Nutricion(int calorias, int cantFibra, int cantProteina) {
        this.calorias = calorias;
        this.cantFibra = cantFibra;
        this.cantProteina = cantProteina;
    }

    public Nutricion() {
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getCantFibra() {
        return cantFibra;
    }

    public void setCantFibra(int cantFibra) {
        this.cantFibra = cantFibra;
    }

    public int getCantProteina() {
        return cantProteina;
    }

    public void setCantProteina(int cantProteina) {
        this.cantProteina = cantProteina;
    }

    @Override
    public String toString() {
        return "Nutricion{" + "calorias=" + calorias + ", cantFibra=" + cantFibra + ", cantProteina=" + cantProteina + '}';
    }

}
