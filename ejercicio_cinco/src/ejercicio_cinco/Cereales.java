/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cinco;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
public class Cereales implements IAlimento {
    
    public String marca;
    public double precio;
    public String tipo;
    public int calorias;
    public LocalDate caducidad;

    public Cereales(String marca, double precio, String tipo) {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }
    
    public void setCalorias() {
        if (this.tipo.equalsIgnoreCase("espelta")) {
            this.calorias = 5;
        } else if(this.tipo.equalsIgnoreCase("maiz")) {
            this.calorias = 8;
        } else if(this.tipo.equalsIgnoreCase("trigo")) {
            this.calorias = 12;
        } else {
            this.calorias = 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + ", calorias=" + calorias + ", caducidad=" + caducidad + '}';
    }
    
    
    
}
