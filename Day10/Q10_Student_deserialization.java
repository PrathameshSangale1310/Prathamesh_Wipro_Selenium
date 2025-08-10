package Assignment10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Q10_Student_deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("students.docx");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Q10_Student  d1 = (Q10_Student ) ois.readObject();
        Q10_Student  d2 = (Q10_Student ) ois.readObject();

        System.out.println("Deserialized Objects:");
        System.out.println(d1);
        System.out.println(d2);

        ois.close();
        fis.close();

	}

}
