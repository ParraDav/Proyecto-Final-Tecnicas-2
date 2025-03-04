/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author dfpar
 */
public class ActividadFisica extends Persona{

    private String actividadFisica;

    public ActividadFisica() {
    }

    public ActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public String getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    @Override
    public String toString() {
        return "ActividadFisica{" + "actividadFisica=" + actividadFisica + '}';
    }

}
