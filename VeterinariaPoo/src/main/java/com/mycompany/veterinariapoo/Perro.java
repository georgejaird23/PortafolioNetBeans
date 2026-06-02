/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariapoo;

/**
 *
 * @author USER
 */
public class Perro extends Animal{
    
    private String raza;
    
    public Perro( String nombre, int edad, String raza){
        super (nombre, edad);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("🐶 Guau guau");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Raza: " + raza);
    }
}
