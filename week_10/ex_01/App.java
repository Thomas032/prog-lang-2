import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        String filename = "sample_data.txt";
        List<Integer> data = new ArrayList<>();
        
        generateSampleData(filename);
        readDataFromFile(filename, data);
        
        Histogram histogram = new Histogram(data);
        System.out.println(histogram);
    }
    
    private static void generateSampleData(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(100) + 1;
                writer.write(randomNumber + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error generating sample data: " + e.getMessage());
        }
    }
    
    private static void readDataFromFile(String filename, List<Integer> data) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int value = Integer.parseInt(line.trim());
                    data.add(value);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}