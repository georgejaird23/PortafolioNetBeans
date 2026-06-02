/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantepoo;

/**
 *
 * @author USER
 */
public class Hamburguesas extends Producto {
    private String tipoCarne;
    
    public Hamburguesas (String nombre, double precioBase, String tipoCarne){
        super (nombre, precioBase);
        this.tipoCarne = tipoCarne;
    }
    
    @Override 
    public void preparar(){
        System.out.println("🍔 cocinando la carne de " + tipoCarne +" a la parrilla y armando la hamburguesa" + getNombre() + ".");
    }
    
}
