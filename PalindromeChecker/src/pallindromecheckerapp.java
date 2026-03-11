import java.util.Scanner;

public class pallindromecheckerapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        boolean isPalindrome = check(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    private static boolean check(String s, int start, int end) {
        // Base Condition: If indices meet or cross, it is a palindrome
        if (start >= end) {
            return true;
        }

        // Recursive call compares start & end
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Move inward using recursive calls
        return check(s, start + 1, end - 1);
    }
}