
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hello! Welcome to the Student Database system.");
            System.out.println("Select a choice from the menu below.");
            System.out.println("1. Enter student information");
            System.out.println("2. View student information and course enrollment");
            System.out.println("3. Exit program");
            int selection = Integer.valueOf(scanner.nextLine());

            if (selection == 1) {
                System.out.println("Enter student name, empty will end: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                System.out.println("Enter " + name + "'s age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter " + name + "'s course title: ");
                String courseTitle = scanner.nextLine();
                System.out.println("Enter " + name + "'s grade for the course: ");
                int grade = Integer.valueOf(scanner.nextLine());

                students.add(new Student(name, age, courseTitle, grade));

                System.out.println("Continue? Enter Y or N");
                String response = scanner.nextLine();
                if (response.equals("Y")) {
                    continue;
                }
            }
            if (selection == 2) {
                System.out.println("Total number of students: " + students.size());
                System.out.println("Students and Courses: ");

                Iterator itr = students.iterator();
                while(itr.hasNext()){
                    Student st=(Student)itr.next();
                    System.out.println(st.name + ", " + st.age + ", " + st.courseTitle + ", " + st.grade);
                }
                System.out.println("Continue? Enter Y or N");
                String response = scanner.nextLine();
                if (response.equals("Y")) {
                    continue;
                }
            }
            if (selection == 3) {
                    break;
            }
        }
    }
}

