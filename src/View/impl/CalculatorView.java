package View.impl;

import Controller.impl.CalculatorController;
import Model.calculate.impl.ComplexNumber;
import View.Viewable;
import util.dataEntry.UserDataEntry;

public class CalculatorView implements Viewable {

    private final CalculatorController calcController;
    private final UserDataEntry input;

    public CalculatorView(CalculatorController calcController, UserDataEntry input){
        this.calcController = calcController;
        this.input = input;
    }

    public void run() {
        while (true) {
            double aReal = input.prompt("Enter the real number A: ");
            double aImaginary = input.prompt("Enter the imaginary number A: ");
            String operator = input.getOperator();
            double bReal = input.prompt("Enter the real number B: ");
            double bImaginary = input.prompt("Enter the imaginary number B: ");

            ComplexNumber realNum = new ComplexNumber(aReal, aImaginary);
            ComplexNumber imaginaryNum = new ComplexNumber(bReal, bImaginary);
            ComplexNumber result;

            switch (operator) {
                case "+":
                    result = calcController.add(realNum, imaginaryNum);
                    System.out.println("Result: " + result.toString());
                    break;
                case "-":
                    result = calcController.subtract(realNum, imaginaryNum);
                    System.out.println("Result: " + result.toString());
                    break;

                case "*":
                    result = calcController.multiply(realNum, imaginaryNum);
                    System.out.println("Result: " + result.toString());
                    break;

                case "/":
                    result = calcController.divide(realNum, imaginaryNum);
                    System.out.println("Result: " + result.toString());
                    break;

                default:
                    System.out.println("Incorrect operator. Try again.");
                    break;
            }
            String action = input.prompt();
            if (action.equalsIgnoreCase("q")) {
                System.exit(0);
            }
        }
    }
}
