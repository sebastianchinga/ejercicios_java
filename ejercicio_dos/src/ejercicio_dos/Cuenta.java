package ejercicio_dos;

public class Cuenta {
    
    public String titular;
    public int cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Cantidad no valida");
        } else {
            this.cantidad = this.cantidad + cantidad; 
        }
    }
    
    public void retirar(int cantidad) {
        int resultado = this.cantidad - cantidad;
        this.cantidad = resultado;
    }
    
    
}
