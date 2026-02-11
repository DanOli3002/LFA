import  java.util.Scanner;

public class g1ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Simples (numero op numero):");
        if (!sc.hasNextDouble()) {
            System.out.println("ERROR: read number invalid");
            sc.close();
            return;
        }
        Double num1 = sc.nextDouble();
        String op = sc.next();
        if (!sc.hasNextDouble()) {
            System.out.println("ERROR: read number invalid");
            sc.close();
            return;
        }
        Double num2 = sc.nextDouble();
        sc.close();

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("ERROR: divided by zero");
                    return;
                }
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("ERROR: invalid operator");
        }
    }
}