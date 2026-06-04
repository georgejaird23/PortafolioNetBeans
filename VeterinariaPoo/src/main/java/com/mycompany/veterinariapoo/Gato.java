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

@Entity // 1. Le avisa a la base de datos que el Gato también es una tabla guardable
public class Gato extends Animal {
    private boolean hogareño; // Tu variable original

    // 2. CONSTRUCTOR VACÍO OBLIGATORIO para bases de datos
    public Gato() {}

    public Gato(String nombre, int edad, boolean hogareño) {
        super(nombre, edad); // Pasa los datos al padre Animal
        this.hogareño = hogareño;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    // Getter para tu variable original
    public boolean isHogareño() {
        return hogareño;
    }
}

