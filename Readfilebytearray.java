package LabApril6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readfilebytearray {
	
    public static void main(String[] args) {
        try {
            // Create a File object for the file to be read
            File file = new File("D:\\file.txt");
            
            // Create a FileInputStream to read the file
            FileInputStream fis = new FileInputStream(file);
            
            // Create a byte array to store the contents of the file
            byte[] byteArray = new byte[(int) file.length()];
            
            // Read the file into the byte array using the read() method of FileInputStream
            fis.read(byteArray);
            
            // Close the FileInputStream
            fis.close();
            
            // Print the contents of the byte array to the console
            System.out.println("Contents of file as byte array:");
            for (byte b : byteArray) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
