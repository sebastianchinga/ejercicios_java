/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_uno;

public abstract class Pokemon {
    
    protected int num_pokedex;
    protected String nombre_pokemon;
    protected double peso_pokemon;
    protected String sexo;
    protected int temp_aparicion;
    
    protected abstract void atacarPlecaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
}