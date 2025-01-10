package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueWords {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }

        System.out.println("Unique words: " + uniqueWords.size());
    }
}

