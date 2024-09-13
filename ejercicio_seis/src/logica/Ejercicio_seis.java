/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sebastian
 */
public class Ejercicio_seis {

    public static void main(String[] args) {
        // superficie, precio, trabajador, dia, cliente
        //TrabajoPintura pintor = new TrabajoPintura(2, 50, "Jorge Chinga", LocalDate.now(), "Lady Palacios");
        //System.out.println(pintor.detalleServicio());
        
        // alarmas, fecha_inicio, cliente
        //RevisionAlarma revision = new RevisionAlarma(100, LocalDate.now(), "Sebastian Chinga Palacios");
        //System.out.println(revision.detalleServicio());
        
        List<Servicio> trabajos = new ArrayList<Servicio> ();
        trabajos.add(new TrabajoPintura(5.2, 15, "Jorge Chinga", LocalDate.now(), "Lady Catherine"));
        trabajos.add(new RevisionAlarma(3, LocalDate.now(), "Sebastian Chinga"));
        
        double total = 0;
        for(Servicio i:trabajos) {
            total+= i.costeTotal();
        }
        
        System.out.println("El costo total por todos los trabajos realizados son de " + total);
    }
    
}
