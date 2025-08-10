package Assignment10;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q9 {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Prathamesh\\Desktop\\Filehandling_practice");
		File f = path.toFile();


        if (f.exists() && f.isDirectory()) {
            FilenameFilter txtFilter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".txt");
                }
            };

            String[] txtFiles = f.list(txtFilter);

            if (txtFiles != null && txtFiles.length > 0) {
                System.out.println(".txt files in folder:");
                for (String file : txtFiles) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No .txt files found in this folder.");
            }
        } else {
            System.out.println("Invalid folder path.");
        }


	}

}
