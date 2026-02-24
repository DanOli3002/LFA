import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class g1ex2 {
    private static Map<String, Double> variables = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                continue;
            }

            try {
                if (line.contains("=")) {
                    // Atribuição: var = expressão
                    int eqIndex = line.indexOf('=');
                    String varName = line.substring(0, eqIndex).trim();
                    String expression = line.substring(eqIndex + 1).trim();

                    if (!isValidVariableName(varName)) {
                        System.out.println("ERROR: invalid variable name");
                        continue;
                    }

                    double value = evaluateExpression(expression);
                    variables.put(varName, value);
                } else {
                    // Expressão simples
                    double result = evaluateExpression(line);
                    System.out.println(result);
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        sc.close();
    }

    private static boolean isValidVariableName(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }

    private static double evaluateExpression(String expr) throws Exception {
        List<String> tokens = tokenize(expr);
        return parseAddition(tokens, new int[]{0});
    }

    private static List<String> tokenize(String expr) throws Exception {
        List<String> tokens = new ArrayList<>();
        String current = "";

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == ' ') {
                if (!current.isEmpty()) {
                    tokens.add(current);
                    current = "";
                }
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (!current.isEmpty()) {
                    tokens.add(current);
                    current = "";
                }
                tokens.add(String.valueOf(c));
            } else {
                current += c;
            }
        }

        if (!current.isEmpty()) {
            tokens.add(current);
        }

        return tokens;
    }

    // Respeitando precedência: adição e subtração (menor precedência)
    private static double parseAddition(List<String> tokens, int[] pos) throws Exception {
        double result = parseMultiplication(tokens, pos);

        while (pos[0] < tokens.size()) {
            String op = tokens.get(pos[0]);
            if (op.equals("+") || op.equals("-")) {
                pos[0]++;
                double right = parseMultiplication(tokens, pos);
                if (op.equals("+")) {
                    result += right;
                } else {
                    result -= right;
                }
            } else {
                break;
            }
        }

        return result;
    }

    // Multiplicação e divisão (maior precedência)
    private static double parseMultiplication(List<String> tokens, int[] pos) throws Exception {
        double result = parseValue(tokens, pos);

        while (pos[0] < tokens.size()) {
            String op = tokens.get(pos[0]);
            if (op.equals("*") || op.equals("/")) {
                pos[0]++;
                double right = parseValue(tokens, pos);
                if (op.equals("*")) {
                    result *= right;
                } else {
                    if (right == 0) {
                        throw new Exception("divided by zero");
                    }
                    result /= right;
                }
            } else {
                break;
            }
        }

        return result;
    }

    private static double parseValue(List<String> tokens, int[] pos) throws Exception {
        if (pos[0] >= tokens.size()) {
            throw new Exception("unexpected end of expression");
        }

        String token = tokens.get(pos[0]);
        pos[0]++;

        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            if (variables.containsKey(token)) {
                return variables.get(token);
            }
            throw new Exception("undefined variable or invalid number: " + token);
        }
    }
}
