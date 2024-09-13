package ejercicio_uno;

public class Bullbasaur extends Pokemon implements Planta {

    public Bullbasaur() {
    }

    @Override
    protected void atacarPlecaje() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque de plecaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque de arañaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque de mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque paralizador");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque de drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque de hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola, soy Bullbasaur y este es mi ataque de latigo");
    }
    
}
