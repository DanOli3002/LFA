import java.util.Scanner;

public class g1ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            if (parts.length != 3) {
                System.out.println("ERROR: invalid input format");
                break;
            }
            try {
                double num1 = Double.parseDouble(parts[0]);
                String op = parts[1];
                double num2 = Double.parseDouble(parts[2]);

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
            } catch (NumberFormatException e) {
                System.out.println("ERROR: read number invalid");
            }
        }
    }
}
