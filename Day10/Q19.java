package Assignment10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
    int id;
    String name;
    
    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q19 {
    public static void main(String[] args) {
        Emp e = new Emp(101, "Prathamesh");
        Emp e1 = new Emp(105, "Sagar");

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.writeObject(e1);
            oos.close();
            fos.close();
            System.out.println("Serialization Done");
        } catch (Exception ex) {
            System.out.println("Failed");
            System.out.println(ex);
        }
    }
}