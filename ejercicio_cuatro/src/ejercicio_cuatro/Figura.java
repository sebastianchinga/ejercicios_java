/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuatro;

/**
 *
 * @author Sebastian
 */
public class Figura {
    
    public String codigo;
    public double precio;
    public Superheroe superheroe;
    public Dimension dimension;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Figura{" + "codigo=" + codigo + ", precio=" + precio + ", superheroe=" + superheroe + ", dimension=" + dimension + '}';
    }
    
    public void modificador(int dinero) {
        this.precio = this.precio + dinero;
    }
}
