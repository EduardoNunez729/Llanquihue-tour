/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author enune
 */
public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;

    public RutaGastronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(String nombre, double duracionHoras,int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Categoría: Ruta Gastronómica | Paradas degustación: " + numeroDeParadas;
    }
    
}
