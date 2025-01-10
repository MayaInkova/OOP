package Files;

import java.io.File;

public class CalculateDirectorySize {
        public static void main(String[] args) {
            String directoryPath = "path/to/directory";
            File directory = new File(directoryPath);

            long totalSize = calculateDirectorySize(directory);
            System.out.println("Total size: " + totalSize + " bytes");
        }

        public static long calculateDirectorySize(File directory) {
            long totalSize = 0;
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();
                if (files != null) {
                    for (File file : files) {
                        totalSize += calculateDirectorySize(file);
                    }
                }
            } else {
                totalSize += directory.length();
            }
            return totalSize;
        }
    }

