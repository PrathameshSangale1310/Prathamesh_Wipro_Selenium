package Assignment9;

import java.io.File;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter folder path: ");
        String path = scanner.nextLine();
        scanner.close();

        File folder = new File(path);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            System.out.println("Files in the directory:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Invalid folder path.");
        }
    }
}
