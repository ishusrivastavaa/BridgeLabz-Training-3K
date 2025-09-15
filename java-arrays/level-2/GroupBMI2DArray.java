import java.util.Scanner;

public class GroupBMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create 2D array for weight and height, and 1D array for BMI
        // personData[i][0] = weight, personData[i][1] = height
        double[][] personData = new double[number][2];
        double[] bmiData = new double[number];
        String[] weightStatus = new String[number];

        // Take input for weight and height, validate input
        for (int i = 0; i < number; i++) {
            double weight, height;
            while (true) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight > 0)
                    break;
                System.out.println("Weight must be positive. Please enter again.");
            }
            while (true) {
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height > 0)
                    break;
                System.out.println("Height must be positive. Please enter again.");
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }
        // Calculate BMI and assign weight status
        for (int i = 0; i < number; i++) {
            double heightInMeters = personData[i][1] / 100.0;
            double bmi = personData[i][0] / (heightInMeters * heightInMeters);
            bmiData[i] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Display results
        System.out.printf("%-10s %-12s %-12s %-10s %-15s\n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person%-4d %-12.2f %-12.2f %-10.2f %-15s\n",
                    (i + 1), personData[i][0], personData[i][1], bmiData[i], weightStatus[i]);
        }

        sc.close();
    }
}
