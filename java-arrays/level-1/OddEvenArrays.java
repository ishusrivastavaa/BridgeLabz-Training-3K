import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Error: Number is not a natural number.");
            sc.close();
            return;
        }

        int evenSize = number / 2;
        int oddSize = number - evenSize;
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                if (evenIndex < even.length)
                    even[evenIndex++] = i;
            } else {
                if (oddIndex < odd.length)
                    odd[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
