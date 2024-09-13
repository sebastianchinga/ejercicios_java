package ejercicio_uno;

public class Squirtle extends Pokemon implements Agua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlecaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque plecaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidropulso");
    }
    
}
