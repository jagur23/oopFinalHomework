package Model.calculate.impl;

import Model.calculate.Calculable;


public class ComplexNumberCalculator implements Calculable<ComplexNumber> {

    private ComplexNumber result;

    public ComplexNumberCalculator(){};

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getRealPart() + b.getRealPart(), a.getImaginaryPart() + b.getImaginaryPart());
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getRealPart() - (b.getRealPart()), a.getImaginaryPart() - (b.getImaginaryPart()));
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart(),
                a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart());
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        try {
            double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
            return new ComplexNumber((a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) / denominator,
                    (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) / denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by zero exception");
        }
    }
}
