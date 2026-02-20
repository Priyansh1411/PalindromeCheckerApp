/**
 *
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Accepts input from user
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

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

        // Variable to store reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);   // String concatenation
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        // Close scanner
        scanner.close();
    }
}