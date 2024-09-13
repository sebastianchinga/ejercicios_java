package ejercicio_tres;

public abstract class Electrodomesticos {
    protected String tipo;
    protected String marca;
    protected double potencia;

    protected Electrodomesticos(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + '}';
    }
    
    protected abstract double getConsumo(int horas);
    
    protected abstract double getCosteConsumo(int horas, double costeHora);
    
}
