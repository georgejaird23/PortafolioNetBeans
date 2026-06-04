/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariapoo;

/**
 *
 * @author USER
 */

import jakarta.persistence.Entity; // Importación obligatoria

@Entity // 1. Le avisa a la base de datos que el Perro también es una entidad guardable
public class Perro extends Animal {
    private String raza;

    // 2. CONSTRUCTOR VACÍO OBLIGATORIO para bases de datos
    public Perro() {}

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); // Pasa los datos al padre Animal
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    // Getter para la raza
    public String getRaza() {
        return raza;
    }
}

