/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myjavasproject;

/**
 *
 * @author USER
 */
public class Coche extends Vehiculo {

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        if (isEncendido()) {
            System.out.println("¡Ruuun! El coche " + getMarca() + " acelera rápido.");
        } else {
            System.out.println("⚠️ No puedes acelerar, el coche está apagado.");
        }
    }
}