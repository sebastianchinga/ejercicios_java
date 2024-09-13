/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_cuatro;

/**
 *
 * @author Sebastian
 */
public class Ejercicio_cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Superheroe heroe = new Superheroe("Hombre Araña");
        Dimension tierra = new Dimension(50.2, 48, 35);
        Figura fig = new Figura("A20", 120, heroe, tierra);
        System.out.println(fig.toString());
    }
    
}
