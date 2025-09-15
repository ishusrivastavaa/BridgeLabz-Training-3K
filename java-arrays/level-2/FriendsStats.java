import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        double[] heights = new double[10];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + friends[youngestIndex]);
        System.out.println("Tallest friend: " + friends[tallestIndex]);

        sc.close();
    }
}