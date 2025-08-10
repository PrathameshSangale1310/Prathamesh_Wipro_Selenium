package Assignment10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q10_Student_serialization {

	public static void main(String[] args) throws IOException {
		Q10_Student s1 = new Q10_Student(101,"Prathamesh");
		Q10_Student s2 = new Q10_Student(105,"Sagar");
		
		FileOutputStream fos = new FileOutputStream("students.docx");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(s2);

        oos.close();
        fos.close();

        System.out.println("Objects Serialized Successfully!");
		

	}

}
