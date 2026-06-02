/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myjavasproject;

/**
 *
 * @author USER
 */
public class Myjavasproject {

    public static void main(String[] args) {
        // 1. Creamos los objetos en la memoria
        Vehiculo miCoche = new Coche("Mazda", "3");
        Vehiculo miCamion = new Camion("Volvo", "FH", 30);
        
        // 2. Aquí están las órdenes de impresión que le faltaban a tu código:
        System.out.println("--- PROBANDO EL COCHE ---");
        miCoche.arrancar();
        miCoche.acelerar();

        System.out.println("\n--- PROBANDO EL CAMIÓN ---");
        miCamion.arrancar();
        miCamion.acelerar();
    }
}

