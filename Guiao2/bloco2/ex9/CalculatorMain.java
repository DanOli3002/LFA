import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class CalculatorMain {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.err.println("Usage: java CalculatorMain <filename>");
                System.exit(1);
            }

            String filename = args[0];
            InputStream input = new FileInputStream(filename);
            
            CommonTokenStream tokens = new CommonTokenStream(
                new Calculator_fractionsLexer(CharStreams.fromStream(input))
            );
            
            Calculator_fractionsParser parser = new Calculator_fractionsParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            
            Calculator_fractionsParser.ProgramContext program = parser.program();
            
            Interpreter interpreter = new Interpreter();
            interpreter.visitProgram(program);
            
            input.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
