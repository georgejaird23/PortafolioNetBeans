# 🚀 Portafolio de Proyectos Java - Programación Orientada a Objetos (POO)

¡Bienvenido/a a mi repositorio de respaldo universitario! Este espacio contiene los proyectos interactivos que he diseñado y programado desde cero en **Java**, utilizando el entorno de desarrollo integrado **Apache NetBeans** y el sistema de automatización **Maven**.

El objetivo principal de este portafolio es consolidar y demostrar el dominio práctico de los **4 pilares fundamentales de la POO**.

---

## 📂 Contenido del Portafolio

El repositorio se divide en tres proyectos independientes y funcionales:

### 1. 🏥 Clínica Veterinaria Web & Base de Datos Relacional (`VeterinariaPoo`)
* **Descripción:** Evolución de un sistema de consola a una plataforma Full-Stack interactiva para la gestión automatizada de pacientes.
* **Componentes de Arquitectura Profesional:**
  * **Front-End (HTML5/CSS3):** Interfaz visual limpia (`index.html`) con formularios dinámicos y listas de selección para registrar mascotas desde el navegador.
  * **Back-End (Spring Boot):** Servidor web activo en el puerto 8080 que mapea peticiones a través de un controlador REST (`@RestController`) y procesa objetos polimórficos de forma dinámica en la red.
  * **Persistencia de Datos (JPA / Hibernate):** Conexión a un motor de base de datos relacional en memoria (H2) mediante interfaces de repositorio (`JpaRepository`). Mapeo de herencia relacional en el disco duro usando la estrategia `@Inheritance(strategy = InheritanceType.JOINED)`.
  * **Consola de Datos SQL:** Acceso al panel gráfico `/h2-console` para realizar auditorías de tablas e interactuar mediante consultas estructuradas directas (`SELECT * FROM ANIMAL;`).


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
