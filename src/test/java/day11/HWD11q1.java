package day11;

import java.io.File;

public class HWD11q1 {


//    Create a File on Desktop
//    Verify that the file exists

    public static void main(String[] args) {
        String filePath = "C:/Users/salha/OneDrive/Pictures/Book1.exss";

        // Create the file object
        File file = new File(filePath);

        // Create the file (if it doesn't exist)
        try {
            if (file.createNewFile()) {
                System.out.println("yaaay its been created..!");
            } else {
                System.out.println("its existed already..!");
            }
        } catch (Exception e) {
            System.out.println("Error creating the file: " + e.getMessage());
        }

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists: " + filePath);
        } else {
            System.out.println("File not found.");
        }
    }

}
