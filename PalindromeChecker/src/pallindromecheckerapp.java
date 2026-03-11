import java.util.Scanner;

public class pallindromecheckerapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 1. Capture execution start time
        long startTime = System.nanoTime();

        // 2. Run Algorithm (Two-pointer approach for efficiency)
        boolean isPalindrome = checkPalindrome(input);

        // 3. Capture execution end time
        long endTime = System.nanoTime();

        // 4. Calculate total execution duration
        long executionTime = endTime - startTime;

        // 5. Display benchmarking results
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }

    /**
     * Core logic to check if a string is a palindrome.
     * Uses a two-pointer approach for O(n) time complexity.
     */
    public static boolean checkPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }

        // Standardizing input (removing non-alphanumeric and case sensitivity)
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
