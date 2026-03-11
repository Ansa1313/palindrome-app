import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// 1. Define the Strategy Interface
interface PalindromeStratergy {
    boolean check(String input);
}

// 2. Implement StackStrategy (LIFO Behavior)
class StackStrategy implements PalindromeStratergy {
    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) return true;

        String cleanInput = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();

        // Push characters onto stack
        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }

        // Compare popped characters with original string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleanInput.equals(reversed.toString());
    }
}

// 3. Implement DequeStrategy (Double-Ended Queue)
class DequeStrategy implements PalindromeStratergy {
    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) return true;

        String cleanInput = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : cleanInput.toCharArray()) {
            deque.addLast(c);
        }

        // Compare characters from both ends
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// 4. Main Application Class
public class pallindromecheckerapp {
    private PalindromeStratergy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStratergy strategy) {
        this.strategy = strategy;
    }

    public void validate(String text) {
        if (strategy == null) {
            System.out.println("Error: No strategy selected.");
            return;
        }
        boolean result = strategy.check(text);
        System.out.println("Strategy: " + strategy.getClass().getSimpleName());
        System.out.println("Input: " + text + " | Is Palindrome: " + result + "\n");
    }

    public static void main(String[] args) {
        pallindromecheckerapp app = new pallindromecheckerapp();
        String word = "Racecar";

        // Step 1: Use Stack Strategy
        app.setStrategy(new StackStrategy());
        app.validate(word);

        // Step 2: Swap to Deque Strategy at runtime
        app.setStrategy(new DequeStrategy());
        app.validate(word);
    }
}