/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import servicie.GestorDatos;
import java.util.ArrayList;
import model.Tour;

/**
 *
 * @author enune
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();
        // Carga la lista desde el archivo ubicado en resources
        ArrayList<Tour> misTours = gestor.cargarTours("src/main/java/resources/tour.txt");

        System.out.println("--- CATÁLOGO COMPLETO ---");
        for (Tour t : misTours) {
            System.out.println(t.toString());
        }

        System.out.println("\n--- FILTRADO: TOURS DE AVENTURA ---");
        for (Tour t : misTours) {
            // Filtrado según condición específica
            if (t.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println("Encontrado: " + t.getNombre());
            }
        }
    }

    }
    

