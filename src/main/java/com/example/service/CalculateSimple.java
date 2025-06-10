package com.example.service;

import com.example.model.OperationModel;
import org.springframework.stereotype.Service;
import java.lang.Math;

/**
 * Servicio que implementa las operaciones matemáticas de la calculadora.
 * 
 * <p>Esta clase contiene la lógica de negocio para realizar todas las operaciones
 * matemáticas disponibles en la aplicación, incluyendo operaciones básicas
 * (suma, resta, multiplicación, división) y operaciones avanzadas (factorial,
 * Fibonacci, raíz cuadrada, potencia).</p>
 * 
 * <p>El servicio está marcado con {@code @Service} para ser detectado automáticamente
 * por Spring Boot y poder ser inyectado en otros componentes.</p>
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 */
@Service
public class CalculateSimple {

    /**
     * Realiza la suma de dos números.
     * 
     * <p>Toma los valores de los campos 'a' y 'b' del modelo de operación
     * y retorna su suma.</p>
     * 
     * @param model el modelo que contiene los operandos a sumar
     * @return la suma de model.getA() + model.getB()
     */
    public int add(OperationModel model) {
        return model.getA() + model.getB();
    }

    /**
     * Realiza la resta de dos números.
     * 
     * <p>Toma los valores de los campos 'a' y 'b' del modelo de operación
     * y retorna la diferencia (a - b).</p>
     * 
     * @param model el modelo que contiene los operandos para la resta
     * @return la diferencia de model.getA() - model.getB()
     */
    public int subtract(OperationModel model) {
        return model.getA() - model.getB();
    }

    /**
     * Realiza la multiplicación de dos números.
     * 
     * <p>Toma los valores de los campos 'a' y 'b' del modelo de operación
     * y retorna su producto.</p>
     * 
     * @param model el modelo que contiene los operandos a multiplicar
     * @return el producto de model.getA() * model.getB()
     */
    public int multiply(OperationModel model) {
        return model.getA() * model.getB();
    }

    /**
     * Realiza la división de dos números.
     * 
     * <p>Toma los valores de los campos 'a' y 'b' del modelo de operación
     * y retorna su cociente. Incluye validación para evitar división por cero
     * y manejo de casos especiales.</p>
     * 
     * @param model el modelo que contiene el dividendo (a) y divisor (b)
     * @return el cociente de model.getA() / model.getB() como double,
     *         o 0.0 si alguno de los operandos es cero
     */
    public double divide(OperationModel model) {
        if (model.getA() == 0) return 0;
        if (model.getB() == 0) return 0;
        return (double) model.getA() / model.getB();
    }

    /**
     * Calcula el factorial de un número.
     * 
     * <p>Utiliza el valor del campo 'c' del modelo de operación como entrada
     * para calcular su factorial usando recursión.</p>
     * 
     * @param model el modelo que contiene el número para calcular el factorial
     * @return el factorial del número model.getC()
     * @see #factorial(int)
     */
    public int factorial(OperationModel model) {
        return factorial(model.getC());
    }

    /**
     * Método recursivo privado para calcular el factorial.
     * 
     * <p>Implementa el cálculo del factorial usando recursión.
     * El factorial de un número n es el producto de todos los enteros
     * positivos menores o iguales a n.</p>
     * 
     * <p><strong>Fórmula:</strong> n! = n × (n-1) × (n-2) × ... × 1</p>
     * 
     * @param n el número del cual calcular el factorial
     * @return el factorial de n, donde 0! = 1 y 1! = 1
     */
    private int factorial(int n) {
        return n < 2 ? n : n * factorial(n - 1);
    }

    /**
     * Calcula el número de Fibonacci en una posición específica.
     * 
     * <p>Utiliza el valor del campo 'c' del modelo de operación como la posición
     * en la secuencia de Fibonacci para retornar el número correspondiente.</p>
     * 
     * @param model el modelo que contiene la posición en la secuencia de Fibonacci
     * @return el número de Fibonacci en la posición model.getC()
     * @see #fibonacci(int)
     */
    public int fibonacci(OperationModel model) {
        return fibonacci(model.getC());
    }

    /**
     * Método recursivo privado para calcular números de Fibonacci.
     * 
     * <p>Implementa el cálculo de la secuencia de Fibonacci usando recursión.
     * La secuencia de Fibonacci es: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...</p>
     * 
     * <p><strong>Fórmula:</strong> F(n) = F(n-1) + F(n-2) donde F(0) = 0 y F(1) = 1</p>
     * 
     * @param n la posición en la secuencia de Fibonacci (empezando desde 0)
     * @return el número de Fibonacci en la posición n
     */
    private int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * 
     * <p>Utiliza el valor del campo 'c' del modelo de operación y aplica
     * la función Math.sqrt() para obtener su raíz cuadrada.</p>
     * 
     * @param model el modelo que contiene el número para calcular la raíz cuadrada
     * @return la raíz cuadrada de model.getC() como double
     */
    public double sqrt(OperationModel model) {
        return Math.sqrt(model.getC());
    }

    /**
     * Calcula la potencia al cuadrado de un número.
     * 
     * <p>Utiliza el valor del campo 'c' del modelo de operación y lo eleva
     * al cuadrado (multiplica por sí mismo).</p>
     * 
     * @param model el modelo que contiene el número a elevar al cuadrado
     * @return el cuadrado de model.getC() (c × c)
     */
    public int power(OperationModel model) {
        return model.getC() * model.getC();
    }

    /**
     * Reinicia los valores de los operandos para operaciones básicas.
     * 
     * <p>Establece los campos 'a' y 'b' del modelo a cero, efectivamente
     * limpiando los valores utilizados en operaciones básicas como suma,
     * resta, multiplicación y división.</p>
     * 
     * @param model el modelo de operación a limpiar
     * @return el mismo modelo con los campos 'a' y 'b' establecidos a 0
     */
    public OperationModel clearSimple(OperationModel model) {
        model.setA(0);
        model.setB(0);
        return model;
    }

    /**
     * Reinicia el valor del operando para operaciones avanzadas.
     * 
     * <p>Establece el campo 'c' del modelo a cero, efectivamente limpiando
     * el valor utilizado en operaciones avanzadas como factorial, Fibonacci,
     * raíz cuadrada y potencia.</p>
     * 
     * @param model el modelo de operación a limpiar
     * @return el mismo modelo con el campo 'c' establecido a 0
     */
    public OperationModel clearAdvanced(OperationModel model) {
        model.setC(0);
        return model;
    }
}