import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int temp = number;

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits
        while (temp != 0) {
            if (index == maxDigit)
                break;
            digits[index++] = temp % 10;
            temp /= 10;
        }

        if (index == 0) {
            System.out.println("No digits to display.");
            sc.close();
            return;
        }

        // Reverse array
        int[] reversed = new int[index];
        for (int i = 0; i < index; i++) {
            reversed[i] = digits[index - 1 - i];
        }

        System.out.print("Reversed number digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        sc.close();
    }
}
