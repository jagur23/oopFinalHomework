package Controller.impl;

import Controller.Controller;
import Model.calculate.Calculable;
import Model.calculate.impl.ComplexNumber;
import Model.logging.impl.FileLogger;
import java.time.LocalDateTime;

public class CalculatorController implements Controller {
    private final LocalDateTime time = LocalDateTime.now();
    private final Calculable<ComplexNumber> calculator;
    private final FileLogger logger;

    public CalculatorController(Calculable<ComplexNumber> calculator) {
        this.calculator = calculator;
        this.logger = new FileLogger();
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.sum(a, b);
        logger.addLog(time ,"The result of sum " + a + " and " + b + " = ", result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.addLog(time, "The result of multiplying " + a + " by " + b + " = ", result);
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.subtract(a, b);
        logger.addLog(time, "The result of subtracting " + b + " from " + a + " = ", result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.addLog(time, "The result of dividing the numerator " + a + " by the denominator " + b + " = ", result);
        return result;
    }
}
