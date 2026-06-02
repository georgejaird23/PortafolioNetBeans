/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinariapoo;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class VeterinariaPoo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Animal miAnimal = null;
        
        System.out.println("=== BIENVENID@S A VETERIANARIA GEORGE´S");
        System.out.println("¿Que animal deseeas registrar hoy? ");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("Seleccion (1 o 2): ");
        int opcion = teclado.nextInt ();
        
        teclado.nextLine();
        if(opcion == 1){
            System.out.println("\nEscribe el nombre de tu perro: ");
            String nombreP = teclado.nextLine();
            
            System.out.println("\nEscribe la edad de tu perro: ");
            int edadP = teclado.nextInt();
            teclado.nextLine();
            
            System.out.println("\nEscribe la raza de tu perro: ");
            String razaP = teclado.nextLine();
            
            miAnimal = new Perro (nombreP, edadP, razaP);
            
        } else if (opcion == 2){
            System.out.println("\nEscribe el nombre de tu gato: ");
            String nombreG = teclado.nextLine();
            
            System.out.println("\nEscribe la edad de tu gato: ");
            int edadG = teclado.nextInt();
            teclado.nextLine();
            
            System.out.println("\n¿Es hogareño? (true/false): ");
            boolean razaG = teclado.nextBoolean();
            
            miAnimal = new Gato (nombreG, edadG, razaG);
            
        }else{
            System.out.println("La opción que escogio es erronea vuelva a intentarlo");
        }
        
        // ========================================================
        // FILTRO DE SEGURIDAD CORREGIDO: Evita el NullPointerException
        // ========================================================
        if (miAnimal != null) {
            miAnimal.hacerSonido(); // Mismo comando, ladra o maúlla por Polimorfismo
            System.out.println("\n¡Mascota registrada con éxito! 🐾");
        }
        
        teclado.close();
        
    }
}
