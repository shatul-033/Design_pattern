package Operator;

public interface OperationCommand {
    double execute();
    void undo();
    String description();
}
