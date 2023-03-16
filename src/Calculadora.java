import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Calculadora {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido a la calculadora de puntajes.");
        List<String> resultados = FileReader("resultados.csv");
        List<String> pronostico = FileReader("pronostico.csv");



    }


    public static List<String> FileReader(String archivo) throws IOException {
        List<String> file = null;
        try {
            file = Files.readAllLines(Paths.get("resources/" + archivo));
        }
        catch (IOException ioe) {
            throw new RuntimeException("Archivo no encontrado: " + archivo);
        }
        return file;
    }
}