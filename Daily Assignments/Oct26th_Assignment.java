package DailyAssignments;

class Student {
    int rollNumber;
    String name;
    static String collegeName = "ABC Engineering College";
    static int studentCount = 0;

    // Static block runs once when the Student class is loaded
    static {
        System.out.println("The Student class is initialised");
    }

    Student(int rollNumber, String name) {
        studentCount++;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    static void changeCollegeName(String collegeName1) {
        collegeName = collegeName1;
        System.out.println("College name updated successfully");
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
    }

    static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}

public class Oct26th_Assignment {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        s1.displayDetails();

        Student s2 = new Student(102, "Priya");
        s2.displayDetails();

        Student s3 = new Student(103, "Amit");
        s3.displayDetails();

        Student.displayStudentCount();
        Student.changeCollegeName("XYZ Institute of Technology");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.displayStudentCount();
    }
}