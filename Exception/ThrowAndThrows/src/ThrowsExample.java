import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    static void readFile() throws IOException {
        FileReader reader = new FileReader("data.txt");

        System.out.println("File opened");

        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}