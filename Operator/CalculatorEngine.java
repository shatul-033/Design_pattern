package Operator;

import simplejavacalculator.operators.BinaryOperator;
import java.util.Optional;

public class CalculatorEngine {
    // engine does no UI, just stateless operations via operators
    public double applyBinary(BinaryOperator op, double a, double b) {
        return op.apply(a, b);
    }
}
