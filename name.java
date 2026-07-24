// Import java.util

import java.util.Scanner;

public class name {

    // Main method

    public static void main(String[] args) {

        // Create scanner object

        Scanner scanner = new Scanner(System.in);

        // User Input
        
        System.out.println("Insert name: ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);

    }
}