/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantepoo;

/**
 *
 * @author USER
 */
public class Bebida extends Producto{
    private boolean conHielo;
    
    public Bebida ( String nombre, double precioBase, boolean conHielo){
        
        super(nombre, precioBase);
        this.conHielo = conHielo;
        
    }
    @Override
    public void preparar(){
        System.out.println("🍸 Sirviendo bebida: " + getNombre() + " | Hielo: " + conHielo);
    }
}
