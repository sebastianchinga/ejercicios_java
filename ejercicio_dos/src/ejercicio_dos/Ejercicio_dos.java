/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_dos;

/**
 *
 * @author Sebastian
 */
public class Ejercicio_dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Sebastian", 20);
        cuenta.ingresar(90);
        System.out.println("El monto de la cuenta es " + cuenta.getCantidad());
        cuenta.retirar(10);
        System.out.println("El monto de la cuenta es " + cuenta.getCantidad());
        cuenta.retirar(100);
        System.out.println("El monto de la cuenta es " + cuenta.getCantidad());
    }
    
}
