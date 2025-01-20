import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String path1 = args[0];
        String path2 = args[1];

        // check if they are files
        if (!new java.io.File(path1).isFile() || !new java.io.File(path2).isFile()) {
            System.out.println("Both files must exist.");
            return;
        }

        // check if they are txt files
        if (!path1.endsWith(".txt") || !path2.endsWith(".txt")) {
            System.out.println("Both files must be txt files.");
            return;
        }

        List<String> lines1 = readTextFromFile(path1);
        List<String> lines2 = readTextFromFile(path2);

        int longerLen = Math.max(lines1.size(), lines2.size());

        for (int i = 0; i < longerLen; i++) {
            try {
                if (lines1.get(i).equals(lines2.get(i))) {
                    continue;
                } else {
                    System.out.println("Different lines: file1: " + lines1.get(i) + " file2: " + lines2.get(i));
                }
            } catch (IndexOutOfBoundsException e) {
                if (lines1.size() > lines2.size()) {
                    System.out.println("Different lines: file1: " + lines1.get(i) + " file2: ");
                } else {
                    System.out.println("Different lines: file1: EMPTY file2: " + lines2.get(i));
                }
            }
        }

    }

    public static List<String> readTextFromFile(String path) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}