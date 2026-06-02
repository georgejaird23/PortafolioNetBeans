/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myjavasproject;

/**
 *
 * @author USER
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private boolean encendido;

    // Este es el constructor que le falta a tu proyecto:
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }

    public void arrancar() {
        this.encendido = true;
        System.out.println("El " + marca + " " + modelo + " ha arrancado.");
    }

    // Método abstracto para el Polimorfismo
    public abstract void acelerar();

    // Métodos para acceder a los datos encapsulados
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public boolean isEncendido() { return encendido; }
}