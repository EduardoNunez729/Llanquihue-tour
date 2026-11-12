/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Tour;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enune
 */
public class GestorDatos {
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> lista = new ArrayList<>();
        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                // Separación lógica de los datos
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String tipo = partes[1].trim();
                    int precio = Integer.parseInt(partes[2].trim()); 
                    //int precio = Integer.parseInt(partes); // Conversión de texto a entero
                    lista.add(new Tour(nombre, tipo, precio));
                }
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }

}
