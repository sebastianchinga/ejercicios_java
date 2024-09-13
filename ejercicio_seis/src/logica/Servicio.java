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
public abstract class Servicio {
    
    protected String trabajador;
    protected LocalDate fecha_inicio;
    protected String cliente;

    public Servicio() {
    }
    

    public Servicio(String trabajador, LocalDate fecha_inicio, String cliente) {
        this.trabajador = trabajador;
        this.fecha_inicio = fecha_inicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    protected abstract double costeMaterial();
    protected abstract double costeManoObra();
    protected abstract double costeTotal();
    protected abstract String detalleServicio();
}
