/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_tres;

/**
 *
 * @author Sebastian
 */
public class Lavadora extends Electrodomesticos {
    
    protected double precio;
    protected boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora (String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora",marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", aguaCaliente=" + aguaCaliente + '}';
    }    

    @Override
    protected double getConsumo(int horas) {
        double resultado;
        
        if (this.aguaCaliente == false) {
            resultado = horas * this.potencia;
        } else {
            resultado = horas* (this.potencia + this.potencia * 0.20);
        }
        
        return resultado;
    }

    @Override
    protected double getCosteConsumo(int horas, double costeHora) {
        double resultado = horas * costeHora;
        return resultado;
    }

    
    
}
