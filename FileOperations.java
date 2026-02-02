import java.io.*;

public class FileOperations {

    // Method to write data into a file
    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Method to read data from a file
    public static void readFromFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;

            System.out.println("\nReading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to modify (append) data to a file
    public static void modifyFile(String fileName, String newContent) {
        try {
            FileWriter fw = new FileWriter(fileName, true); // true = append mode
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(newContent);
            bw.close();
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        String fileName = "sample.txt";

        writeToFile(fileName, "Hello, this is a File Handling program in Java.");
        readFromFile(fileName);
        modifyFile(fileName, "This line is added later.");
        readFromFile(fileName);
    }
}

    

