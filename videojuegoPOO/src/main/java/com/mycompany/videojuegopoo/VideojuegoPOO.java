/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videojuegopoo;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class VideojuegoPOO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CONFIGURACIÓN DE TU PARTIDA ===");
        
        System.out.print("Escribe el nombre de tu Guerrero: ");
        String nombreGuerrero = teclado.nextLine();
        System.out.print("Escribe el nombre de su espada: ");
        String espadaGuerrero = teclado.nextLine();
        Personaje guerreroUsuario = new Guerrero(nombreGuerrero, 100, espadaGuerrero);

        System.out.println("-----------------------------------");

        System.out.print("Escribe el nombre de tu Mago: ");
        String nombreMago = teclado.nextLine();
        System.out.print("Escribe el elemento mágico (Fuego/Hielo): ");
        String elementoMago = teclado.nextLine();
        Personaje magoUsuario = new Mago(nombreMago, 100, elementoMago);

        System.out.println("\n--- ¡COMIENZA EL COMBATE MATEMÁTICO! ---");
        int ronda = 1;
        
        // BUCLE DE COMBATE
        while (guerreroUsuario.getVida() > 0 && magoUsuario.getVida() > 0) {
            System.out.println("\n===================================");
            System.out.println("             RONDA " + ronda);
            System.out.println("===================================");
            
            // -------------------------------------------------
            // TURNO DEL GUERRERO: El usuario ataca por el Guerrero
            // -------------------------------------------------
            // Generamos dos números al azar para la multiplicación (ej. del 2 al 9)
            int num1 = (int)(Math.random() * 8) + 2;
            int num2 = (int)(Math.random() * 8) + 2;
            int respuestaCorrectaG = num1 * num2;
            
            System.out.println("👉 Turno de " + guerreroUsuario.getNombre() + " (Guerrero)");
            System.out.print("RESUELVE PARA ATACAR: ¿Cuánto es " + num1 + " x " + num2 + "?: ");
            int respuestaUsuarioG = teclado.nextInt();
            
            if (respuestaUsuarioG == respuestaCorrectaG) {
                System.out.println("✅ ¡CORRECTO!");
                guerreroUsuario.atacar();
                // El mago pierde puntos por la buena respuesta del guerrero
                int daño = respuestaCorrectaG / 2; // El daño se calcula según la multiplicación
                magoUsuario.recibirDanio(daño);
            } else {
                System.out.println("❌ ¡INCORRECTO! La respuesta era " + respuestaCorrectaG);
                System.out.println(guerreroUsuario.getNombre() + " falló su ataque y bajó la guardia.");
                // Castigo: El guerrero pierde puntos por fallar la matemática
                guerreroUsuario.recibirDanio(20);
            }
            
            // Verificamos si el mago cayó tras el turno del guerrero
            if (magoUsuario.getVida() <= 0) {
                break; 
            }
            
            System.out.println("\n-----------------------------------");
            
            // -------------------------------------------------
            // TURNO DEL MAGO: El usuario ataca por el Mago
            // -------------------------------------------------
            int num3 = (int)(Math.random() * 8) + 2;
            int num4 = (int)(Math.random() * 8) + 2;
            int respuestaCorrectaM = num3 * num4;
            
            System.out.println("👉 Turno de " + magoUsuario.getNombre() + " (Mago)");
            System.out.print("CONJURA EL HECHIZO: ¿Cuánto es " + num3 + " x " + num4 + "?: ");
            int respuestaUsuarioM = teclado.nextInt();
            
            if (respuestaUsuarioM == respuestaCorrectaM) {
                System.out.println("✅ ¡CORRECTO!");
                magoUsuario.atacar();
                int dañoMago = respuestaCorrectaM / 2;
                guerreroUsuario.recibirDanio(dañoMago);
            } else {
                System.out.println("❌ ¡INCORRECTO! La respuesta era " + respuestaCorrectaM);
                System.out.println(magoUsuario.getNombre() + " se trabó con el hechizo.");
                // Castigo: El mago pierde puntos por fallar la matemática
                magoUsuario.recibirDanio(20);
            }
            
            ronda++;
        }
        
        // --- ANUNCIO DEL GANADOR ---
        System.out.println("\n===================================");
        if (guerreroUsuario.getVida() <= 0 && magoUsuario.getVida() <= 0) {
            System.out.println("💀 ¡AMBOS CAYERON EN COMBATE! ES UN EMPATE 💀");
        } else if (guerreroUsuario.getVida() <= 0) {
            System.out.println("🏆 ¡EL GANADOR ES EL MAGO " + magoUsuario.getNombre().toUpperCase() + "! 🔮");
        } else {
            System.out.println("🏆 ¡EL GANADOR ES EL GUERRERO " + guerreroUsuario.getNombre().toUpperCase() + "! ⚔️");
        }
        System.out.println("===================================");
        
        teclado.close();
    }
}