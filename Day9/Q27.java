package Assignment9;

import java.io.File;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name to delete: ");
        String fileName = scanner.nextLine();
        scanner.close();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File could not be deleted.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
