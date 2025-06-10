package com.example.model;

/**
 * Modelo de datos que representa una operación matemática en la calculadora.
 * 
 * <p>Esta clase encapsula los datos necesarios para realizar diferentes tipos
 * de operaciones matemáticas, incluyendo operaciones básicas que requieren
 * dos operandos (a, b) y operaciones avanzadas que requieren un solo operando (c).</p>
 * 
 * <p>Los campos están diseñados para soportar:</p>
 * <ul>
 * <li>Operaciones básicas: suma, resta, multiplicación, división (usan campos a y b)</li>
 * <li>Operaciones avanzadas: factorial, Fibonacci, raíz cuadrada, potencia (usan campo c)</li>
 * </ul>
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 */
public class OperationModel {

    /**
     * Nombre o tipo de la operación matemática a realizar.
     * Este campo puede contener valores como "add", "subtract", "multiply", etc.
     */
    private String operation;
    
    /**
     * Primer operando para operaciones básicas.
     * Utilizado como el primer número en operaciones de suma, resta, 
     * multiplicación y división.
     */
    private int a;
    
    /**
     * Segundo operando para operaciones básicas.
     * Utilizado como el segundo número en operaciones de suma, resta,
     * multiplicación y división.
     */
    private int b;
    
    /**
     * Operando único para operaciones avanzadas.
     * Utilizado en operaciones como factorial, Fibonacci, raíz cuadrada
     * y potencia al cuadrado.
     */
    private int c;

    /**
     * Constructor por defecto.
     * 
     * <p>Crea una nueva instancia de OperationModel con todos los valores
     * inicializados a sus valores por defecto (0 para enteros, null para String).</p>
     */
    public OperationModel() {
    }

    /**
     * Constructor que inicializa el operando para operaciones avanzadas.
     * 
     * <p>Utilizado cuando se necesita realizar operaciones que requieren
     * un solo operando como factorial, Fibonacci o raíz cuadrada.</p>
     * 
     * @param c el valor del operando para operaciones avanzadas
     */
    public OperationModel(int c) {
        this.c = c;
    }

    /**
     * Constructor que inicializa el tipo de operación.
     * 
     * <p>Utilizado para especificar qué tipo de operación matemática
     * se va a realizar.</p>
     * 
     * @param operation el nombre o tipo de la operación a realizar
     */
    public OperationModel(String operation) {
        this.operation = operation;
    }

    /**
     * Constructor que inicializa los operandos para operaciones básicas.
     * 
     * <p>Utilizado cuando se necesita realizar operaciones que requieren
     * dos operandos como suma, resta, multiplicación o división.</p>
     * 
     * @param a el primer operando
     * @param b el segundo operando
     */
    public OperationModel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Obtiene el valor del primer operando.
     * 
     * @return el valor del primer operando (campo a)
     */
    public int getA() {
        return a;
    }

    /**
     * Establece el valor del primer operando.
     * 
     * @param a el nuevo valor para el primer operando
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Obtiene el valor del segundo operando.
     * 
     * @return el valor del segundo operando (campo b)
     */
    public int getB() {
        return b;
    }

    /**
     * Establece el valor del segundo operando.
     * 
     * @param b el nuevo valor para el segundo operando
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Obtiene el nombre o tipo de la operación.
     * 
     * @return el nombre de la operación como String
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Establece el nombre o tipo de la operación.
     * 
     * @param operation el nombre de la operación a establecer
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Obtiene el valor del operando para operaciones avanzadas.
     * 
     * @return el valor del operando avanzado (campo c)
     */
    public int getC() {
        return c;
    }

    /**
     * Establece el valor del operando para operaciones avanzadas.
     * 
     * @param c el nuevo valor para el operando avanzado
     */
    public void setC(int c) {
        this.c = c;
    }
}