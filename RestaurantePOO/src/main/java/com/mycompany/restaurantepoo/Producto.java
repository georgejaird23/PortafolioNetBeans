/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantepoo;

/**
 *
 * @author USER
 */
public abstract class Producto {
    private String nombre;
    private double precioBase;
    
    public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    public void procesarPedido() {

        System.out.println("\n--- PREPARANDO TU PEDIDO ---");

        preparar(); // cada hijo define esto

        System.out.println("Producto: " + nombre);
        System.out.println("Precio total: $" + precioBase);

        System.out.println("✔ TU PEDIDO ESTÁ LISTO");
    }
    public abstract void preparar();
    
    public String getNombre(){
        return nombre; 
    }
    
    public double getPrecioBase(){
        return precioBase; 
    }
    
}
