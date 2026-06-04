/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariapoo;

// Estas importaciones le enseñan a Java a crear las tablas de datos
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity // 1. Configuración de tabla para la base de datos
@Inheritance(strategy = InheritanceType.JOINED) // Truco para que guarde también los datos de los hijos (Perro/Gato)
public abstract class Animal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 2. ID automático único de registro (1, 2, 3...)
    private Long id;
    
    // TUS VARIABLES ORIGINALES (Se quedan igual)
    private String nombre;
    private int edad;
    
    // 3. CONSTRUCTOR VACÍO: Obligatorio para que la base de datos pueda cargar los archivos
    public Animal() {}
    
    // TU CONSTRUCTOR ORIGINAL (Se queda igual)
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // TUS GETTERS ORIGINALES (Se quedan igual)
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    // TU MÉTODO ABSTRACTO ORIGINAL (Se queda igual)
    public abstract void hacerSonido();
}

