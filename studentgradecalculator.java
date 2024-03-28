import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define weights for different components
        double assignmentWeight = 0.3;
        double examWeight = 0.7;

        // Prompt user to input grades for assignments
        System.out.print("Enter your assignment grades (comma-separated): ");
        String assignmentGradesInput = scanner.nextLine();
        double assignmentGrade = calculateAverage(assignmentGradesInput);

        // Prompt user to input grades for exams
        System.out.print("Enter your exam grades (comma-separated): ");
        String examGradesInput = scanner.nextLine();
        double examGrade = calculateAverage(examGradesInput);

        // Calculate overall grade
        double overallGrade = (assignmentGrade * assignmentWeight) + (examGrade * examWeight);

        // Display the results
        System.out.println("\nAssignment Grade: " + assignmentGrade);
        System.out.println("Exam Grade: " + examGrade);
        System.out.println("Overall Grade: " + overallGrade);

        // Provide a simple letter grade based on the overall grade
        System.out.println("Letter Grade: " + getLetterGrade(overallGrade));

        scanner.close();
    }

    // Helper method to calculate average from a comma-separated list of grades
    private static double calculateAverage(String input) {
        String[] grades = input.split(",");
        double sum = 0;

        for (String grade : grades) {
            sum += Double.parseDouble(grade.trim());
        }

        return sum / grades.length;
    }

    // Helper method to determine letter grade based on overall grade
    private static String getLetterGrade(double overallGrade) {
        if (overallGrade >= 90) {
            return "A";
        } else if (overallGrade >= 80) {
            return "B";
        } else if (overallGrade >= 70) {
            return "C";
        } else if (overallGrade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
