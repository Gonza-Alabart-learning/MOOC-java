package part1.variables.theory;

import java.util.Scanner;

public class theory3 {
    public static void main(String[] args) {
        int months = 12;
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Booelan variable: " + trueOrFalse);

        wholeNumber = 42;
        System.out.println("The value of the variable is: " + wholeNumber);

        // U cant change the type after declaring the variable. Except from int to
        // double.
        // floatingPoint = "Hola";
        // System.out.println(floatingPoint); //Cannont convert from string to double

        // Reading integers - u can use this for the user input
        String valueAsString = "42";
        int value = Integer.valueOf(valueAsString);
        System.out.println(value);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value ");
        String Text = scanner.nextLine();
        int value2 = Integer.valueOf(Text);
        System.out.println("You wrote " + value2);

        // Reading doubles
        String valueAsString3 = "42.42";
        double value3 = Double.valueOf(valueAsString3);
        System.out.println(value3);

        // Reading booleans - everything that is not TRUE (is not case sensitive) is
        // false
        String iWont = "I won't!";
        boolean answer = Boolean.valueOf(iWont);
        System.out.println(answer);
        String TRUE = "TRUE";
        boolean answer2 = Boolean.valueOf(TRUE);
        System.out.println(answer2);
        String true2 = "true";
        boolean answer3 = Boolean.valueOf(true2);
        System.out.println(answer3);

    }
}
