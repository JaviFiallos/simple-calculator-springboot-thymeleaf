package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Clase principal de la aplicación Spring Boot Calculator.
 * 
 * <p>Esta clase contiene el método {@code main} que sirve como punto de entrada
 * para la aplicación de calculadora web. La aplicación proporciona una interfaz
 * web para realizar operaciones matemáticas básicas y avanzadas utilizando
 * Spring Boot y Thymeleaf.</p>
 * 
 * <p>La aplicación incluye las siguientes funcionalidades:</p>
 * <ul>
 * <li><strong>Operaciones básicas:</strong> suma, resta, multiplicación, división</li>
 * <li><strong>Operaciones avanzadas:</strong> factorial, números de Fibonacci, raíz cuadrada, potencia</li>
 * <li><strong>Interfaz web:</strong> desarrollada con Thymeleaf para una experiencia de usuario intuitiva</li>
 * <li><strong>Arquitectura MVC:</strong> implementada con Spring Boot siguiendo las mejores prácticas</li>
 * </ul>
 * 
 * <p><strong>Tecnologías utilizadas:</strong></p>
 * <ul>
 * <li>Java 17</li>
 * <li>Spring Boot 3.2.5</li>
 * <li>Maven</li>
 * <li>Thymeleaf</li>
 * </ul>
 * 
 * <p>La anotación {@code @SpringBootApplication} es una anotación de conveniencia
 * que combina {@code @Configuration}, {@code @EnableAutoConfiguration} y
 * {@code @ComponentScan} con sus atributos por defecto.</p>
 * 
 * <p>La anotación {@code @ComponentScan} está configurada para escanear
 * automáticamente todos los componentes en el paquete base "com.example" y
 * sus subpaquetes, incluyendo controladores, servicios y modelos.</p>
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 * @see org.springframework.boot.SpringApplication
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 * @see org.springframework.context.annotation.ComponentScan
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.example" })
public class CalculatorSpringBoot {

    /**
     * Método principal que inicia la aplicación Spring Boot.
     * 
     * <p>Este método es el punto de entrada de la aplicación. Utiliza
     * {@link SpringApplication#run(Class, String...)} para arrancar el
     * contexto de Spring Boot, configurar el servidor web embebido
     * (Tomcat por defecto) y inicializar todos los beans y componentes
     * de la aplicación.</p>
     * 
     * <p>Una vez iniciada, la aplicación estará disponible por defecto en:</p>
     * <pre>
     * http://localhost:8080/calculator
     * </pre>
     * 
     * <p><strong>Pasos de inicialización:</strong></p>
     * <ol>
     * <li>Configura el contexto de aplicación de Spring</li>
     * <li>Escanea y registra los componentes anotados (@Controller, @Service, etc.)</li>
     * <li>Configura automáticamente las dependencias necesarias</li>
     * <li>Inicia el servidor web embebido</li>
     * <li>Despliega la aplicación web</li>
     * </ol>
     * 
     * <p><strong>Ejemplo de uso:</strong></p>
     * <pre>
     * // Para iniciar la aplicación desde la línea de comandos:
     * java -jar calculator-spring-boot.jar
     * 
     * // O usando Maven:
     * mvn spring-boot:run
     * </pre>
     * 
     * @param args argumentos de línea de comandos pasados a la aplicación.
     *             Pueden incluir propiedades de configuración como:
     *             --server.port=8081 (para cambiar el puerto)
     *             --spring.profiles.active=dev (para activar perfiles específicos)
     * 
     * @throws Exception si ocurre un error durante el arranque de la aplicación
     * 
     * @see SpringApplication#run(Class, String...)
     * @see <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html">
     *      Documentación oficial de Spring Boot</a>
     */
    public static void main(String[] args) {
        SpringApplication.run(CalculatorSpringBoot.class, args);
    }
}