package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        System.out.println("Please enter the first number: "); //Enter first number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the second number: "); //Enter first number
        int b = sc.nextInt();
        System.out.println("Please enter an operation: "); //Enter first number
        String op = sc.next();
        switch (op) {
            case "add": add(a, b); break;
            default: System.out.println("Invalid operation"); break;
        }
    }

    public static void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("The sum is: " + sum);

    }
}
