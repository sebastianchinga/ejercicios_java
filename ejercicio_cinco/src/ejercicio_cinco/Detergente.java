package ejercicio_cinco;

public class Detergente implements IDescuento {

    public String marca;
    public double precio;
    public double descuento;

    public Detergente(String marca, double precio, double descuento) {
        this.marca = marca;
        this.precio = precio;
        this.descuento = descuento;
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

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    public int convertirIntero() {
        double desc = this.descuento * 100;
        int resultado = (int) desc;
        return resultado;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio - (this.precio * this.descuento);
    }

}
