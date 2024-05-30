package part1.variables;

import java.util.Scanner;

public class booleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something");
        String text = scanner.nextLine();
        Boolean textBoolean = Boolean.valueOf(text);
        System.out.println("True or false? " + textBoolean);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write another thing");
        String text2 = scanner2.nextLine();
        Boolean textBoolean2 = Boolean.valueOf(text2);
        System.out.println("True or false? " + textBoolean2);

    }
}