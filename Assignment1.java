//Q1   Welcome to BridgeLabz

// public class Assignment1 {
//     public static void main(String[] args) {
//         System.out.println("Welcome to Bridgelabz!");
//     }
// }

//Q2   Add Two Numbers

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//     }
// }

//Q3  Celsius to Fahrenheit Conversion

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter temperature in Celsius: ");
//         double celsius = sc.nextDouble();
//         double fahrenheit = (celsius * 9/5) + 32;
//         System.out.println("Temperature in Fahrenheit: " + fahrenheit);
//     }
// }


//Q4   Area of a Circle

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius: ");
//         double radius = sc.nextDouble();
//         double area = Math.PI * radius * radius;
//         System.out.println("Area of the circle: " + area);
//     }
// }

//Q5  Volume of a Cylinder

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius: ");
//         double radius = sc.nextDouble();
//         System.out.print("Enter height: ");
//         double height = sc.nextDouble();
//         double volume = Math.PI * radius * radius * height;
//         System.out.println("Volume of the cylinder: " + volume);
//     }
// }

//Q6  Calculate Simple Interest

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Principal: ");
//         double principal = sc.nextDouble();
//         System.out.print("Enter Rate (%): ");
//         double rate = sc.nextDouble();
//         System.out.print("Enter Time (years): ");
//         double time = sc.nextDouble();
//         double interest = (principal * rate * time) / 100;
//         System.out.println("Simple Interest: " + interest);
//     }
// }


//Q7  Perimeter of a Rectangle

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter length: ");
//         double length = sc.nextDouble();
//         System.out.print("Enter width: ");
//         double width = sc.nextDouble();
//         double perimeter = 2 * (length + width);
//         System.out.println("Perimeter of the rectangle: " + perimeter);
//     }
// }

//Q8 Power Calculation

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base: ");
//         double base = sc.nextDouble();
//         System.out.print("Enter exponent: ");
//         double exponent = sc.nextDouble();
//         double result = Math.pow(base, exponent);
//         System.out.println("Result: " + result);
//     }
// }

//Q9 Calculate Average of Three numbers

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double a = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double b = sc.nextDouble();
//         System.out.print("Enter third number: ");
//         double c = sc.nextDouble();
//         double average = (a + b + c) / 3;
//         System.out.println("Average: " + average);
//     }
// }

//Q9  Convert Kilometer to miles

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}