import java.util.Scanner;

public class pallindromecheckerapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // 1. Normalize string (Remove spaces/symbols and convert to lowercase)
        // regex [^a-zA-Z0-9] replaces everything that is NOT a letter or number
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Apply previous logic (Palindrome check)
        boolean isPalindrome = true;

        // Use the provided hint logic: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Is Palindrome?: " + isPalindrome);

        scanner.close();
    }
}
