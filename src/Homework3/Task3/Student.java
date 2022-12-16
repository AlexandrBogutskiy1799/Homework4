package Homework3.Task3;

public class Student {

    String firstName;
    String lastName;
    int group;
    Course[] coursesTaken;
    int age;

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
}