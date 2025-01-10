package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWordsAndCharacters {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
                charCount += line.length();
            }
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}

