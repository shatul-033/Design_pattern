package Operator;

public class AddOperator implements BinaryOperator {
    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}

