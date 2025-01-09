package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLengths {
    public static void main(String[] args) {
        String fileName = "input.txt";

        // Using try-with-resources to ensure automatic resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as a delimiter
                String[] words = line.split("\\s+");

                // Print the length of each word
                for (int i = 0; i < words.length; i++) {
                    System.out.print(words[i].length());
                    if (i < words.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


