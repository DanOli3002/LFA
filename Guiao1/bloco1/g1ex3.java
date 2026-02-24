import java.util.Scanner;
import java.util.Stack;

public class g1ex3 {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                if(sc.hasNextDouble()) {
                    stack.push(sc.nextDouble());
                    printStack(stack);
                }
                else {
                    String op = sc.next();
                    if (stack.size() < 2) {
                        System.out.println("ERROR: not enough operands");
                        return;
                    }
                    double b = stack.pop();
                    double a = stack.pop();
                    switch (op) {
                        case "+":
                            stack.push(a + b);
                            break;
                        case "-":
                            stack.push(a - b);
                            break;
                        case "*":
                            stack.push(a * b);
                            break;
                        case "/":
                            if (b == 0) {
                                System.out.println("ERROR: divided by zero");
                                return;
                            }
                            stack.push(a / b);
                            break;
                        default:
                            System.out.println("ERROR: invalid operator");
                            return;
                    }
                    printStack(stack);
                }
            }
        }
    }

    private static void printStack(Stack<Double> stack) {
        System.out.print("Stack: [");
        for (int i = 0; i < stack.size(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(stack.get(i));
        }
        System.out.println("]");
    }
}
