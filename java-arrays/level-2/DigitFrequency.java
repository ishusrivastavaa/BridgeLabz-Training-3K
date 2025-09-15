import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        int temp = Math.abs(number); // Handle negative numbers if needed

        // Count frequency of each digit
        if (temp == 0) {
            frequency[0] = 1; // Edge case if number is 0
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                frequency[digit]++;
                temp /= 10;
            }
        }

        // Display frequency
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
