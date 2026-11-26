/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 *
 * @author enune
 */
public class GestorServicios {
    public void mostrarServiciosPrueba() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("              LLANQUIHUE TOUR - SERVICIOS TURÍSTICOS              ");
        System.out.println("--------------------------------------------------------------------------------------");

        
        RutaGastronomica ruta1 = new RutaGastronomica("Ruta de los sabores del litoral central", 3.0, 3);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta del Vino del Maipo", 6.5, 4);

        
        PaseoLacustre paseo1 = new PaseoLacustre("Navegación Remanzo azul", 2.0, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Susurro de las aguas", 2.5, "Lancha");

       
        ExcursionCultural excursion1 = new ExcursionCultural("Huellas del sur", 4.0, "Iglesias Chiloe");
        ExcursionCultural excursion2 = new ExcursionCultural("Ruta de la Casonas del Sur", 6.0, "Puerto Octay");

        
        System.out.println("--- RUTAS GASTRONÓMICAS ---");
        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println("\n--- PASEOS LACUSTRES ---");
        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println("\n--- EXCURSIONES CULTURALES ---");
        System.out.println(excursion1);
        System.out.println(excursion2);

        System.out.println("--------------------------------------------------------------------------------------");
    }
}
