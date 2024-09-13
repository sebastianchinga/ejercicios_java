/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
public class RevisionAlarma extends Servicio {
    
    public int alarmas;

    public RevisionAlarma() {
    }
    
    

    public RevisionAlarma(int alarmas, LocalDate fecha_inicio, String cliente) {
        super("Revisor especialista contraincendios", fecha_inicio, cliente);
        this.alarmas = alarmas;
    }

    public int getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(int alarmas) {
        this.alarmas = alarmas;
    }

    @Override
    protected double costeMaterial() {
        return 0;
    }

    @Override
    protected double costeManoObra() {
        return (alarmas/3)*40;
    }

    @Override
    protected double costeTotal() {
        return this.costeManoObra();
    }

    @Override
    protected String detalleServicio() {
        return "REVISION PERIODICA ALARMAS CONTRAINCENDIOS \n"
                + "Cliente: " + this.cliente + "\n"
                + "Fecha de revision: " + this.fecha_inicio + "\n"
                + "---------------\n"
                + "TOTAL: .......... " + this.costeTotal() + "\n"
                + "---------------";
    }
    
    
}
