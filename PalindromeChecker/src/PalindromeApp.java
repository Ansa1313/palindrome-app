public class PalindromeApp {

    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
