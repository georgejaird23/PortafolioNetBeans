/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariapoo;

/**
 *
 * @author USER
 */
public class Gato extends Animal{
    
    private boolean hogareno;
    
    public Gato (String nombre, int edad, boolean hogareno){
        
        super(nombre, edad);
        this.hogareno = hogareno;
    }
    @Override
    public void hacerSonido(){
        System.out.println("🐱 Miau");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: "+ getEdad());
        
        if(hogareno){
            System.out.println("Condición: Hogareño 🏠");
        }
        else{
            System.out.println("Condición: Callejero 🌙");
        }
    }
}
