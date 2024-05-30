package part1.variables;

import java.util.Scanner;

// Write a program that asks the user for a value. The program should then print the value provided by the user.
public class integerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        String stringInput = scanner.nextLine();
        int value = Integer.valueOf(stringInput);
        System.out.println("You gave the number" + value);

    }
}
