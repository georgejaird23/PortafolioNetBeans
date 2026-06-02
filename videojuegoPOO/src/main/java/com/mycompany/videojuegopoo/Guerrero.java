/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegopoo;

/**
 *
 * @author USER
 */
public class Guerrero extends Personaje {
    private String tipoEspada; // Atributo único del guerrero

    public Guerrero(String nombre, int vida, String tipoEspada) {
        super(nombre, vida);
        this.tipoEspada = tipoEspada;
    }

    @Override
    public void atacar() {
        System.out.println("⚔️ " + getNombre() + " ataca ferozmente con su espada " + tipoEspada + "!");
    }
}
