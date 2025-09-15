import java.util.Scanner;

public class GroupBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // b. Create arrays to store data
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // c. Take input for weight and height for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // d. Calculate BMI and status, store in arrays
        for (int i = 0; i < n; i++) {
            double heightInMeter = heights[i] / 100.0;
            bmis[i] = weights[i] / (heightInMeter * heightInMeter);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // e. Display all values
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person%-4d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), heights[i], weights[i], bmis[i],
                    statuses[i]);
        }

        sc.close();
    }
}
