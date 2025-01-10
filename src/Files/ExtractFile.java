package Files;

import java.io.File;

public class ExtractFile {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";

        File file = new File(inputFilePath);
        String fileName = file.getName();
        String fileNameWithoutExtension = fileName.contains(".") ? fileName.substring(0, fileName.lastIndexOf('.')) : fileName;
        long fileSizeInBytes = file.length();

        System.out.println("File Name: " + fileNameWithoutExtension);
        System.out.println("File Size: " + fileSizeInBytes + " Bytes");
    }
}
