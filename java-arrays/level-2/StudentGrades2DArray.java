import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks: row = student, columns = physics, chemistry, maths
        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("  Enter marks in " + subject + ": ");
                double mark = sc.nextDouble();
                if (mark < 0) {
                    System.out.println("  Invalid value! Enter positive marks.");
                    j--; // Re-enter for this subject
                    continue;
                }
                marks[i][j] = mark;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s\n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-12.2f %-8s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i], percentages[i], grades[i]);
        }

        sc.close();
    }
}
