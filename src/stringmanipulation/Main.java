package stringmanipulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Smith";
        String username = "john";
        String password = "123";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your username: ");

        String usernameInput = s.nextLine();

        System.out.println("Enter your password:");

        String passwordInput = s.nextLine();

        if(username.equalsIgnoreCase(usernameInput)) {
            if(password.equals(passwordInput)) {
                String greeting = "Hello " + firstName + " " + lastName.charAt(0);
                System.out.println(greeting.concat("."));
                System.out.println("Username: ".concat(username));
                System.out.println("Last name: ".concat(lastName));
            } else {
                System.out.println("Password incorrect.");
            }
        } else {
            System.out.println("Username incorrect.");
        }
    }
}
