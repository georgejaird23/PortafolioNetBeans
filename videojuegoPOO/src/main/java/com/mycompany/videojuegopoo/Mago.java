/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegopoo;

/**
 *
 * @author USER
 */
public class Mago extends Personaje{
    private String elementoMagico;
    
    public Mago(String nombre, int vida, String elementoMagico){
        super(nombre, vida);
        this.elementoMagico = elementoMagico;
    }
    
    @Override
    public void atacar(){
        System.out.println("🔮 " + getNombre() + " lanza hechizo devastador de " + elementoMagico + "!");
    }
}
