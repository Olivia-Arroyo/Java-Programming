import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public String courseTitle;
    public int grade;

    Student(String name, int age, String courseTitle, int grade) {
        this.name = name;
        this.age = age;
        this.courseTitle = courseTitle;
        this.grade = grade;
    }

    public void studentInfo() {
        System.out.println("Name: " + name + ", " + "Course: " + courseTitle + "Grade: " + grade);
    }

}


