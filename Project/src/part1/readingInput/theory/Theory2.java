package part1.readingInput.theory;

/*Temas:
 * User input
 * String concatenation
 */

import java.util.Scanner; //Hay que importar el scaner que permite input

public class Theory2 {
    public static void main(String[] ars) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("Write a message: ");

        /*
         * Read the string written by the user, and assign it
         * to program memory "String message = (string that was given as input)"
         */
        String message = scanner.nextLine();

        // Print the message written by the user
        System.out.println(message);
    }
}
