
public class Student {

    private final String name;
    private final String studentID;
    private final int[] grades;

    // Constructor with studentID
    public Student(String name, String studentID, int[] grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public void displayGrades() {
        System.out.println("Grades for " + name + " (ID: " + studentID + "):");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public String getStatus() {
        double average = getAverageGrade();
        return average >= 60 ? "Passed" : "Failed";
    }
}
