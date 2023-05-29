import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEncryptionFilter {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        encryptFile(inputFile, outputFile);
        System.out.println("Encryption complete.");
    }

    public static void encryptFile(String inputFile, String outputFile) {
        try {
            FileInputStream fileIn = new FileInputStream(inputFile);
            FileOutputStream fileOut = new FileOutputStream(outputFile);

            int data;
            while ((data = fileIn.read()) != -1) {
                int encryptedData = data + 10;
                fileOut.write(encryptedData);
            }
            fileIn.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
