/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuatro;

/**
 *
 * @author Sebastian
 */
public class Dimension {
    
   public double alto;
   public double ancho;
   public double profundidad;

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
    public double getVolumen() {
        return this.ancho * this.alto * this.profundidad;
    }

    @Override
    public String toString() {
        return "Las medidas de la dimension son: Alto " + this.alto + " Ancho " + this.ancho + " Profundidad " + this.profundidad + " Volumen " + this.getVolumen();
    }
    
    
}
