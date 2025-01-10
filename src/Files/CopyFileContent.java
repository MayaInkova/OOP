package Files;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFilePath));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}

