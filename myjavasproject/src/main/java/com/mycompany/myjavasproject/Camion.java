/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myjavasproject;

/**
 *
 * @author USER
 */
public class Camion extends Vehiculo {
    private int toneladasCarga; 

    // Este constructor le dice a Java que acepte los 3 datos que pusiste en el Main
    public Camion(String marca, String modelo, int toneladasCarga) {
        super(marca, modelo); // Pasa la marca y modelo al Vehiculo padre
        this.toneladasCarga = toneladasCarga;
    }

    // Comportamiento del camión
    @Override
    public void acelerar() {
        if (isEncendido()) {
            System.out.println("¡Brrr! El camión " + getMarca() + " acelera con " + toneladasCarga + " toneladas.");
        } else {
            System.out.println("⚠️ No puedes acelerar, el camión está apagado.");
        }
    }
}