package Files;

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        String wordToReplace = "oldWord";
        String replacementWord = "newWord";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(wordToReplace, replacementWord);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
}


