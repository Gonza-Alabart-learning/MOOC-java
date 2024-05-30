package part1.variables;

import java.util.Scanner;
/* Write a program that asks the user for a string, an integer, a floating-point number, and a boolean. The program should then print the values given by the user. */

public class differentTypesOfInput {
    public static void main(String[] args) {
        // Ask for string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String theString = scanner.nextLine();

        // Ask for int
        System.out.println("Give an integer:");
        int theInt = Integer.valueOf(scanner.nextLine());

        // Ask for double
        System.out.println("Give a double:");
        double theDouble = Double.valueOf(scanner.nextLine());

        // Ask for boolean
        System.out.println("Give a boolean:");
        boolean theBoolean = Boolean.valueOf(scanner.nextLine());

        // Print all
        System.out.println("You gave the string " + theString);
        System.out.println("You gave the integer " + theInt);
        System.out.println("You gave the double " + theDouble);
        System.out.println("You gave the boolean " + theBoolean);
    }
}
