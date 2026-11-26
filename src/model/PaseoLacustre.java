/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author enune
 */
public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;

    public PaseoLacustre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacustre(String nombre, double duracionHoras,String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    // Sobrescritura de toString()
    @Override
    public String toString() {
        return super.toString() + " | Categoría: Paseo Lacustre | Embarcación: " + tipoEmbarcacion;
    }
    
}
