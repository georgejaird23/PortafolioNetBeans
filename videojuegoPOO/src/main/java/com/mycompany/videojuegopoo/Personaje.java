/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegopoo;

/**
 *
 * @author USER
 */
public abstract class Personaje {
    private String nombre;
    private int vida;
    
    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public abstract void atacar();
    
    public String getNombre(){return nombre;}
    public int getVida() {return vida;}
    
    public void recibirDanio(int danio){
        this.vida -= danio;
        System.out.println(nombre + " recibió" + danio + " de daño. Vida restante: " + this.vida);
    }
}
