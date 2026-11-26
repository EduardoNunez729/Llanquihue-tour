/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author enune
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(String nombre, double duracionHoras,String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    

    @Override
    public String toString() {
        return super.toString() + " | Categoría: Excursión Cultural | Sitio: " + lugarHistorico;
    }
    
    
}
