/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_tres;

public class Ejercicio_tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Marca, precio, potencia, aguaCaliente
        Lavadora lavadora = new Lavadora("LG", 20, 8, true);
        double resultado = lavadora.getConsumo(5);
        
        System.out.println(lavadora.isAguaCaliente() ? "El consumo es de " + resultado + " kW porque se uso agua caliente"  : "El consumo es de " + resultado + " kW porque se uso agua fria");
    }
    
}
