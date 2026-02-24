import java.util.HashMap;
import java.util.Scanner;

public class g1ex4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try (Scanner file = new Scanner(new java.io.File("numbers.txt"))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split("-");
                map.put(parts[1].trim(), parts[0].trim());
            }
        } catch (java.io.IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try(Scanner sc = new Scanner(System.in)) {
            StringBuilder result = new StringBuilder();
            while (sc.hasNext()) {
                String input = sc.next().trim();
                
                // Tenta traduzir como palavra inteira
                if (map.containsKey(input)) {
                    if (result.length() > 0) result.append(" ");
                    result.append(map.get(input));
                } 
                // Se contém hífen, separa e traduz cada parte
                else if (input.contains("-")) {
                    String[] parts = input.split("-");
                    boolean translated = false;
                    for (String part : parts) {
                        if (map.containsKey(part)) {
                            if (result.length() > 0) result.append(" ");
                            result.append(map.get(part));
                            translated = true;
                        }
                    }
                    if (!translated) {
                        if (result.length() > 0) result.append(" ");
                        result.append(input);
                    }
                } 
                else {
                    if (result.length() > 0) result.append(" ");
                    result.append(input);
                }
            }
            System.out.println(result.toString());
        }
    }
}


