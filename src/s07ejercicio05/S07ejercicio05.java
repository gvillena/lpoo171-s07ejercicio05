/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero1 = Integer.parseInt(reader.nextLine());
        if (numero1 > 0) {
            System.out.println("\nEl numero es positivo.");
        }
        else {
            System.out.println("\nEl numero es negativo.");
        }        
        
    }
    
}
