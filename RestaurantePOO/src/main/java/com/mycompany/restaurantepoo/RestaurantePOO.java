/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantepoo;

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class RestaurantePOO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Producto miPedido = null;
        
        System.out.println("=== BIENVENIDO A BURGUER GEORGE");
        System.out.println("¿Que deseas odenar hoy?");
        System.out.println("1. Hambruguesa");
        System.out.println("2. Bebida");
        System.out.println("Seleccion (1 o 2): ");
        int opcion = teclado.nextInt ();
        
        teclado.nextLine();
        if (opcion == 1){
            System.out.print("\nEscribe el tipo de carne (Res, Pollo, Vegana) : ");
            String carneH = teclado.nextLine();
            
            miPedido = new Hamburguesas(carneH, 15.50, carneH);
            
        }
        else if( opcion == 2){
            System.out.print("\nEscribe el tipo de Bebida) : ");
            String nombreB = teclado.nextLine();
            System.out.print("¿la deseas con hielo? (true/false) : ");
            boolean hieloB = teclado.nextBoolean();
            
            miPedido = new Bebida (nombreB, 4.25, hieloB);
        }
        if (miPedido != null) {
            miPedido.procesarPedido();    
        }
        else {
            System.out.println("✖ Opción inválida.");
        }
    }
}
