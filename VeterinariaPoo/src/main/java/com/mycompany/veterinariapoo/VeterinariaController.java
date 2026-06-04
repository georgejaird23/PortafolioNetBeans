
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
package com.mycompany.veterinariapoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class VeterinariaController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/registrar")
    public String registrarMascotaWeb(
            @RequestParam String nombre, 
            @RequestParam int edad, 
            @RequestParam String tipo, 
            @RequestParam String datoEspecial) {
        
        // Creamos la variable genérica del padre vacía
        Animal miAnimal = null;
        String detalleHijo = "";

        // POLIMORFISMO EN ACCIÓN: Decidimos qué hijo fabricar en la memoria RAM
        if (tipo.equalsIgnoreCase("perro")) {
            miAnimal = new Perro(nombre, edad, datoEspecial); // datoEspecial funciona como Raza
            detalleHijo = "Raza: " + datoEspecial;
        } else if (tipo.equalsIgnoreCase("gato")) {
            boolean esHogareño = Boolean.parseBoolean(datoEspecial); // Transforma el texto "true" en booleano real
            miAnimal = new Gato(nombre, edad, esHogareño);
            detalleHijo = "¿Es hogareño?: " + esHogareño;
        }

        // Guardamos el objeto correspondiente de forma segura en la base de datos
        if (miAnimal != null) {
            animalRepository.save(miAnimal);
            return "<h2>🐾 Mascota Registrada con Éxito en la Base de Datos 🐾</h2>" +
                   "<p>Se ha guardado un <b>" + tipo.toUpperCase() + "</b> llamado <b>" + nombre + "</b> (" + edad + " años). " + detalleHijo + "</p>" +
                   "<br><a href='/listar'>👉 Ver toda la Base de Datos</a>" +
                   "<br><a href='/h2-console'>🖥️ Ir a la Consola SQL (H2)</a>";
        } else {
            return "<h2>❌ Error al procesar el registro de la mascota.</h2>";
        }
    }

    @GetMapping("/listar")
    public List<Animal> listarMascotas() {
        return animalRepository.findAll();
    }
}


