package com.example.controllers;

import com.example.service.CalculateSimple;
import com.example.model.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador principal para la aplicación de calculadora web.
 * 
 * <p>Esta clase maneja todas las operaciones matemáticas disponibles en la calculadora,
 * incluyendo operaciones básicas (suma, resta, multiplicación, división) y operaciones
 * avanzadas (potencia, raíz cuadrada, factorial, números de Fibonacci).</p>
 * 
 * <p>El controlador utiliza Thymeleaf como motor de plantillas y Spring Boot
 * para el mapeo de rutas y la inyección de dependencias.</p>
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 */
@Controller
public class CalculatorController {

    /**
     * Modelo de operación que almacena los datos de entrada y configuración
     * para las operaciones matemáticas.
     */
    OperationModel operationModel = new OperationModel();

    /**
     * Servicio que contiene la lógica de negocio para realizar
     * los cálculos matemáticos.
     */
    @Autowired
    private CalculateSimple calculateSimple;

    /**
     * Muestra la página principal de la calculadora.
     * 
     * <p>Este método maneja las peticiones GET a la ruta "/calculator"
     * y prepara el modelo de datos necesario para la vista.</p>
     * 
     * @param model el modelo de Spring MVC para pasar datos a la vista
     * @return el nombre de la plantilla Thymeleaf "calculator"
     */
    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel", operationModel);
        return "calculator";
    }

    /**
     * Realiza una operación de suma.
     * 
     * <p>Procesa las peticiones POST con el parámetro "add" y realiza
     * la suma de los valores proporcionados en el modelo de operación.</p>
     * 
     * @param operationModel el modelo que contiene los operandos para la suma
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado de la suma
     */
    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "calculator";
    }

    /**
     * Realiza una operación de resta.
     * 
     * <p>Procesa las peticiones POST con el parámetro "subtract" y realiza
     * la resta de los valores proporcionados en el modelo de operación.</p>
     * 
     * @param operationModel el modelo que contiene los operandos para la resta
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado de la resta
     */
    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.subtract(operationModel));
        return "calculator";
    }

    /**
     * Realiza una operación de multiplicación.
     * 
     * <p>Procesa las peticiones POST con el parámetro "multiply" y realiza
     * la multiplicación de los valores proporcionados en el modelo de operación.</p>
     * 
     * @param operationModel el modelo que contiene los operandos para la multiplicación
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado de la multiplicación
     */
    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculator";
    }

    /**
     * Realiza una operación de división.
     * 
     * <p>Procesa las peticiones POST con el parámetro "divide" y realiza
     * la división de los valores proporcionados en el modelo de operación.</p>
     * 
     * @param operationModel el modelo que contiene los operandos para la división
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado de la división
     */
    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "calculator";
    }

    /**
     * Calcula el número de Fibonacci en la posición especificada.
     * 
     * <p>Procesa las peticiones POST con el parámetro "fibonacci" y calcula
     * el número de Fibonacci correspondiente a la posición indicada en el modelo.</p>
     * 
     * @param operationModel el modelo que contiene la posición para calcular Fibonacci
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el número de Fibonacci calculado
     */
    @RequestMapping(value="/calculator", params="fibonacci", method = RequestMethod.POST)
    public String fibonacci(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.fibonacci(operationModel));
        return "calculator";
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * 
     * <p>Procesa las peticiones POST con el parámetro "sqrt" y calcula
     * la raíz cuadrada del valor proporcionado en el modelo de operación.</p>
     * 
     * @param operationModel el modelo que contiene el número para calcular la raíz cuadrada
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado de la raíz cuadrada
     */
    @RequestMapping(value="/calculator", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.sqrt(operationModel));
        return "calculator";
    }

    /**
     * Calcula la potencia de un número.
     * 
     * <p>Procesa las peticiones POST con el parámetro "power" y calcula
     * la potencia usando la base y el exponente proporcionados en el modelo.</p>
     * 
     * @param operationModel el modelo que contiene la base y el exponente
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado de la potencia
     */
    @RequestMapping(value="/calculator", params="power", method = RequestMethod.POST)
    public String power(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.power(operationModel));
        return "calculator";
    }

    /**
     * Calcula el factorial de un número.
     * 
     * <p>Procesa las peticiones POST con el parámetro "factorial" y calcula
     * el factorial del número proporcionado en el modelo de operación.</p>
     * 
     * @param operationModel el modelo que contiene el número para calcular el factorial
     * @param model el modelo de Spring MVC para pasar el resultado a la vista
     * @return el nombre de la plantilla "calculator" con el resultado del factorial
     */
    @RequestMapping(value="/calculator", params="factorial", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.factorial(operationModel));
        return "calculator";
    }

    /**
     * Limpia los campos de las operaciones básicas.
     * 
     * <p>Procesa las peticiones POST con el parámetro "clearSimple" y
     * reinicia los valores de los campos utilizados en operaciones básicas
     * (suma, resta, multiplicación, división).</p>
     * 
     * @param operationModel el modelo de operación a limpiar
     * @param model el modelo de Spring MVC para actualizar la vista
     * @return el nombre de la plantilla "calculator" con los campos limpiados
     */
    @RequestMapping(value="/calculator", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("operationModel", calculateSimple.clearSimple(operationModel));
        model.addAttribute("result", 0);
        return "calculator";
    }

    /**
     * Limpia los campos de las operaciones avanzadas.
     * 
     * <p>Procesa las peticiones POST con el parámetro "clearAdvanced" y
     * reinicia los valores de los campos utilizados en operaciones avanzadas
     * (potencia, raíz cuadrada, factorial, Fibonacci).</p>
     * 
     * @param operationModel el modelo de operación a limpiar
     * @param model el modelo de Spring MVC para actualizar la vista
     * @return el nombre de la plantilla "calculator" con los campos limpiados
     */
    @RequestMapping(value="/calculator", params="clearAdvanced", method = RequestMethod.POST)
    public String clearAdvanced(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("operationModel", calculateSimple.clearAdvanced(operationModel));
        model.addAttribute("result", 0);
        return "calculator";
    }
}