package part1.readingInput;

import java.util.Scanner;

public class Message3Times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        String texto = scanner.nextLine();

        System.out.println(texto);
        System.out.println(texto);
        System.out.println(texto);
    }
}
