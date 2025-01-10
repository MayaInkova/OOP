package Files;

import java.io.*;


    public class ReverseLines {
        public static void main(String[] args) {
            String inputFilePath = "input.txt";
            String outputFilePath = "output.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                 PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    String reversedLine = new StringBuilder(line).reverse().toString();
                    writer.println(reversedLine);
                }
            } catch (IOException e) {
                System.out.println("Error processing the file: " + e.getMessage());
            }
        }
    }

