/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_uno;

/**
 *
 * @author Sebastian
 */
public class Pikachu extends Pokemon implements Electrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlecaje() {
        System.out.println("Hola soy Picacku y este es mi ataque plecaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Picacku y este es mi ataque arañaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Picacku y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactarTrueno() {
        System.out.println("Hola soy Picacku y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Picacku y este es mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Picacku y este es mi ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Picacku y este es mi ataque rayo carga");
    }
    
}
