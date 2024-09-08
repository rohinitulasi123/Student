
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            Student[] students = new Student[numStudents];
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter name for student " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter student ID for " + name + ": ");
                String studentID = scanner.nextLine();
                System.out.print("Enter number of grades for " + name + ": ");
                int numGrades = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                int[] grades = new int[numGrades];
                for (int j = 0; j < numGrades; j++) {
                    System.out.print("Enter grade " + (j + 1) + ": ");
                    grades[j] = scanner.nextInt();
                }
                scanner.nextLine(); // Consume newline left-over

                students[i] = new Student(name, studentID, grades);
            }

            double totalAverage = 0;
            for (Student student : students) {
                student.displayGrades();
                System.out.println("Average grade: " + student.getAverageGrade());
                System.out.println("Status: " + student.getStatus());
                System.out.println();
                totalAverage += student.getAverageGrade();
            }

            double classAverage = totalAverage / students.length;
            System.out.println("Class average: " + classAverage);
        }
    }
}
