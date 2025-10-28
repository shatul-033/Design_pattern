package refector;

import java.util.Scanner;

// ----- Strategy Interface -----
interface Strategy {
    int execute(int a, int b);
}

// ----- Concrete Strategies -----
class ConcreteStrategyAdd implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy {
    public int execute(int a, int b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    public int execute(int a, int b) {
        return a * b;
    }
}

// ----- Context -----
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;


    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

// ----- Client -----
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        //System.out.print("Choose operation (add,
//subtract, multiply): ");
        String action = scanner.next();

        // Select strategy based on user input
        switch (action.toLowerCase()) {
            case "add":
                context.setStrategy(new
ConcreteStrategyAdd());
                break;
            case "subtract":
                context.setStrategy(new
ConcreteStrategySubtract());


                break;
            case "multiply":
                context.setStrategy(new
ConcreteStrategyMultiply());
                break;
            default:
                System.out.println("Invalid action.");
                return;
        }

        // Execute chosen strategy
        int result = context.executeStrategy(a, b);
        System.out.println("Result: " + result);
    }
}
