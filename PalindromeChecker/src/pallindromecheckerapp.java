import java.util.LinkedList;

public class pallindromecheckerapp {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare first and last characters
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}