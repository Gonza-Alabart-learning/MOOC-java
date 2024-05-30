package part1.variables;

import java.util.Scanner;

public class doubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value");
        String text = scanner.nextLine();
        float number = Float.valueOf(text);
        System.out.println("You wrote " + number);
    }
}