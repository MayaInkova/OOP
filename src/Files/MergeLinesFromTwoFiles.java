package Files;

import java.io.*;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) {
        String inputFilePath1 = "input1.txt";
        String inputFilePath2 = "input2.txt";
        String outputFilePath = "output.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFilePath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(inputFilePath2));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {

            String line1, line2;
            while ((line1 = reader1.readLine()) != null | (line2 = reader2.readLine()) != null) {
                if (line1 != null) {
                    writer.println(line1);
                }
                if (line2 != null) {
                    writer.println(line2);
                }
            }
        } catch (IOException e) {
            System.out.println("Грешка при обработка на файловете: " + e.getMessage());
        }
    }
}

