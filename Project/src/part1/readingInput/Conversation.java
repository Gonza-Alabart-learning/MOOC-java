package part1.readingInput;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        System.out.println("Greetings! How are you doing?");

        Scanner scanner = new Scanner(System.in);
        String answ1 = scanner.nextLine();
        // System.out.println(answ1);

        System.out.println("Oh, how interesting. Tell me more!");
        String answ2 = scanner.nextLine();
        // System.out.println(answ2);

        System.out.println("Thanks for sharing");
    }
}
