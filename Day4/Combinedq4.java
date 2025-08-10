package Assignment4;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void getRoleInfo();
}

class Student extends Person {
    String course;
    int rollNumber;

    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }

    void getRoleInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Professor extends Person {
    String subject;
    double salary;

    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    void getRoleInfo() {
        System.out.println("Professor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class TeachingAssistant extends Student {
    String assistantArea;

    TeachingAssistant(String name, int age, String course, int rollNumber, String assistantArea) {
        super(name, age, course, rollNumber);
        this.assistantArea = assistantArea;
    }

    void getRoleInfo() {
        System.out.println("Teaching Assistant Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Assists in: " + assistantArea);
    }
}

public class Combinedq4 {

	public static void main(String[] args) {
		Person s = new Student("Prathamesh", 22, "CS", 101);
        Person p = new Professor("Prof. Shelke", 45, "M-1", 40000);
        Person ta = new TeachingAssistant("Anurag", 25, "OOPS", 151, "DSA");

        s.getRoleInfo();
        System.out.println();
        p.getRoleInfo();
        System.out.println();
        ta.getRoleInfo();

	}

}
