package Variables.MyScanner;

import java.util.Scanner;

public class MyScanner {
    public void welcomeUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your first name?'");
        String firstName = scanner.next();

        System.out.println("What's your last name?'");
        String lastName = scanner.next();

        System.out.println("Welcome " + firstName + " " + lastName + "!");
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        short firstNumber = Short.parseShort(scanner.next());

        System.out.println("Second number: ");
        short secondNumber = Short.parseShort(scanner.next());

        int sum = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

        scanner.close();
    }
}
