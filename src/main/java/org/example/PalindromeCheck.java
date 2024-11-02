package org.example;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user


        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        String input = "Java Developer";
        // Remove spaces and convert to lowercase for uniformity
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Check if the input is a palindrome
        if (isPalindrome(cleanInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
}
