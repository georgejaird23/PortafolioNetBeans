# 🚀 Portafolio de Proyectos Java - Programación Orientada a Objetos (POO)

¡Bienvenido/a a mi repositorio de respaldo universitario! Este espacio contiene los proyectos interactivos que he diseñado y programado desde cero en **Java**, utilizando el entorno de desarrollo integrado **Apache NetBeans** y el sistema de automatización **Maven**.

El objetivo principal de este portafolio es consolidar y demostrar el dominio práctico de los **4 pilares fundamentales de la POO**.

---

## 📂 Contenido del Portafolio

El repositorio se divide en tres proyectos independientes y funcionales:

### 1. 🐕 Sistema de Veterinaria (`VeterinariaPoo`)
* **Descripción:** Un simulador interactivo de gestión de pacientes en una clínica veterinaria.
* **Pilares Aplicados:** 
  * **Abstracción:** Clase base abstracta `Animal`.
  * **Encapsulamiento:** Atributos de edad y nombre protegidos con nivel de acceso `private`.
  * **Herencia:** Clases hijas específicas `Perro` y `Gato` que extienden del padre.
  * **Polimorfismo:** Implementación de firmas del método abstracto `.hacerSonido()` redefinido con `@Override`.
  * **Seguridad de Datos:** Manejo explícito de excepciones y condicionales `if (miAnimal != null)` para prevenir el colapso del sistema por errores tipo `NullPointerException`.

### 2. 🎮 Videojuego de Combate Matemático (`videojuegoPOO`)
* **Descripción:** Un juego de rol y trivia matemática por turnos en el que el poder de ataque y la supervivencia de los personajes dependen de la agilidad mental del usuario en la consola.
* **Mecánicas Clave:** Generación de operaciones aritméticas aleatorias por ciclo y lógica de daño dinámico según las respuestas registradas por teclado (`Scanner`).

### 3. 🚗 Concepto Base de Vehículos (`myjavasproject`)
* **Descripción:** Proyecto fundacional donde estructuré por primera vez la lógica de herencia cruzada de comportamientos utilizando simulación de aceleración diferenciada entre automóviles y camiones de carga pesada.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

* **Lenguaje:** Java 23 (JDK 23)
* **IDE:** Apache NetBeans 30
* **Gestor de Dependencias:** Apache Maven
* **Control de Versiones:** Git & GitHub

---

## 🧠 Conceptos Técnicos Demostrados

* **Estructuras de Control:** Bucles dinámicos `while` y evaluaciones condicionales anidadas (`if / else if / else`).
* **Interactividad de Consola:** Flujos de datos controlados de lectura de enteros, booleanos y cadenas mediante `java.util.Scanner`.
* **Clean Code:** Arquitectura de software desacoplada, separando la lógica de control del negocio (`Main`) de la lógica estructural de los objetos (Modelos).
