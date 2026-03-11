public class pallindromecheckerapp {

    public static void main(String[] args) {
        // Create an instance of the service
        PalindromeService service = new PalindromeService();

        // Input string as per the example in the prompt
        String input = "racecar";

        // Check if the input is a palindrome
        boolean result = service.checkPalindrome(input);

        // Output the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Handle null or empty cases
        if (input == null) return false;

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // Is a palindrome
    }
}
