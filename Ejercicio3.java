/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Estudiante
 */
public class Ejercicio3 {

    /**
     * @
     */
    public static void main(String[] args) {
        
        double salarioBase = 2000000; 
        double descuentoSalud = salarioBase * 0.04; 
        double descuentoPension = salarioBase * 0.05; 

       
        double totalDescuentos = descuentoSalud + descuentoPension;
        double salarioNeto = salarioBase - totalDescuentos;

        
       
     
        System.out.println("Tu saldo final es de " + salarioNeto + " monedas de oro. ¡Prepárate para tu próxima aventura!");
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
