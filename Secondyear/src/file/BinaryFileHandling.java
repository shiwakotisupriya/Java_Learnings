package file;

import java.io.*;

public class BinaryFileHandling {
    public static void main(String[] args) {
        String fileName = "data.bin";

        // Writing data to the binary file
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            int intValue = 42;
            double doubleValue = 3.14159;

            outputStream.writeInt(intValue);
            outputStream.writeDouble(doubleValue);

            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from the binary file
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
            int intValue = inputStream.readInt();
            double doubleValue = inputStream.readDouble();

            System.out.println("Read int value: " + intValue);
            System.out.println("Read double value: " + doubleValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
