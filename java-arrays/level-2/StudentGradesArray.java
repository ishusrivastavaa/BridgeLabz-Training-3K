import java.util.Scanner;

public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // c. Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            // Physics marks input and validation
            System.out.print("  Enter marks in Physics: ");
            double p = sc.nextDouble();
            if (p < 0) {
                System.out.println("  Invalid value! Enter positive marks.");
                i--;
                continue;
            }
            physics[i] = p;

            // Chemistry marks input and validation
            System.out.print("  Enter marks in Chemistry: ");
            double c = sc.nextDouble();
            if (c < 0) {
                System.out.println("  Invalid value! Enter positive marks.");
                i--;
                continue;
            }
            chemistry[i] = c;

            // Maths marks input and validation
            System.out.print("  Enter marks in Maths: ");
            double m = sc.nextDouble();
            if (m < 0) {
                System.out.println("  Invalid value! Enter positive marks.");
                i--;
                continue;
            }
            maths[i] = m;
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            double total = physics[i] + chemistry[i] + maths[i];
            percentages[i] = total / 3.0;
            double perc = percentages[i];

            if (perc >= 80) {
                grades[i] = "A";
            } else if (perc >= 70) {
                grades[i] = "B";
            } else if (perc >= 60) {
                grades[i] = "C";
            } else if (perc >= 50) {
                grades[i] = "D";
            } else if (perc >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // e. Display results
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-8s\n",
                "Student", "Physics", "Chemistry", "Maths", "Percent", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-12.2f %-10.2f %-8s\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        sc.close();
    }
}
