/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_cinco;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
public class Ejercicio_cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Detergente downey = new Detergente("Downey", 25, 0.50);
        System.out.println("Se aplico el descuento de " + downey.convertirIntero() + "%");
        System.out.println("El precio final a pagar es de " + downey.getPrecioDescuento() + " soles");
        
        Cereales zucaritas = new Cereales("Zucaritas", 20, "trigo");
        zucaritas.setCalorias();
        zucaritas.setCaducidad(LocalDate.now());
        System.out.println(zucaritas);
        
    }
    
}
