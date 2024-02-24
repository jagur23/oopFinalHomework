package util;

import Controller.impl.CalculatorController;
import Model.calculate.Calculable;
import Model.calculate.impl.ComplexNumber;
import Model.calculate.impl.ComplexNumberCalculator;
import View.impl.CalculatorView;
import util.dataEntry.UserDataEntry;

import java.util.Scanner;

public class ApplicationRunner {

    public ApplicationRunner() {
        Calculable<ComplexNumber> calculator = new ComplexNumberCalculator();
        CalculatorController calcController = new CalculatorController(calculator);
        CalculatorView calculatorView = new CalculatorView(calcController, new UserDataEntry(new Scanner(System.in)));
        calculatorView.run();
    }

    public static void run() {
        new ApplicationRunner();
    }
}
