/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author dfpar
 */
public class Salud extends Persona{

    private int nivelAzucar, imc, presionArterial;
    private String medicacion;

    public Salud(int nivelAzucar, int imc, int presionArterial, String medicacion) {
        this.nivelAzucar = nivelAzucar;
        this.imc = imc;
        this.presionArterial = presionArterial;
        this.medicacion = medicacion;
    }

    public Salud() {
    }

    public int getNivelAzucar() {
        return nivelAzucar;
    }

    public void setNivelAzucar(int nivelAzucar) {
        this.nivelAzucar = nivelAzucar;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public int getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(int presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    @Override
    public String toString() {
        return "Salud{" + "nivelAzucar=" + nivelAzucar + ", imc=" + imc + ", presionArterial=" + presionArterial + ", medicacion=" + medicacion + '}';
    }

}
