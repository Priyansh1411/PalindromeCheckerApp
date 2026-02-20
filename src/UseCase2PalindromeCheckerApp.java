/**
 *
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 *
 * Use Case 3: User Input Palindrome Validation
 *
 * Description:
 * This class demonstrates palindrome validation
 * using user input from the console.
 *
 * The application:
 * - Accepts a string from the user
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * @author Developer
 * @version 3.0
 *
 */

import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        // Close scanner
        scanner.close();
    }
}