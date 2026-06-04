package com.mycompany.veterinariapoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeterinariaPoo {

    public static void main(String[] args) {
        // TRUCO: Forzamos a Java a encender la consola web de la base de datos
        System.setProperty("spring.h2.console.enabled", "true");
        
        SpringApplication.run(VeterinariaPoo.class, args);
        System.out.println("🚀 ¡SERVIDOR WEB ACTIVO EN http://localhost:8080 !");
    }
}
