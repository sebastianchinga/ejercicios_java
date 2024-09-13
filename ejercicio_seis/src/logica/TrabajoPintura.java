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
public class TrabajoPintura extends Servicio {
    
    public double superficie;
    public double precio;

    public TrabajoPintura() {
    }
    
    

    public TrabajoPintura(double superficie, double precio, String trabajador, LocalDate fecha_inicio, String cliente) {
        super(trabajador, fecha_inicio, cliente);
        this.superficie = superficie;
        this.precio = precio;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    protected double costeMaterial() {
        return (this.superficie/7.8)*this.precio;
    }

    @Override
    protected double costeManoObra() {
        return (this.superficie/10)*9.5;
    }

    @Override
    protected double costeTotal() {
        return this.costeMaterial()+this.costeManoObra();
    }

    @Override
    protected String detalleServicio() {
        return "TRABAJO DE PINTURA \n"
                + "Cliente: " + this.cliente + "\n"
                + "Fecha de inicio: " + this.fecha_inicio + "\n"
                + "--------------- \n"// 15 lineas
                + "Pintor: " + this.trabajador + "\n"
                + "Coste Material..." + this.costeMaterial() + "\n"
                + "Coste Mano de Obra..." + this.costeManoObra() + "\n"
                + "TOTAL......" + this.costeTotal() + "\n"
                + "---------------";
    }
    
    
    
}
