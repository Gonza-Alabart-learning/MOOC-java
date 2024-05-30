package part1.readingInput;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String message = scanner.nextLine();

        System.out.println(message);

        // Concatenation
        System.out.println("Hello" + "World");
        System.out.println("Hello" + " " + "World");
        System.out.println(message + " World");
    }
}
