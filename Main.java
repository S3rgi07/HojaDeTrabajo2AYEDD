
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        FileReader fileReader = new FileReader();
        String input = "";
        try {
            input = fileReader.readFile("datos.txt");
        } catch (IOException ex) {
            System.out.println("No se pudo encontrar o leer el archivo 'datos.txt'. " + ex.getMessage());
        }
        int result = calculator.operate(input);
        System.out.println("Resultado: " + result);
    }
}
