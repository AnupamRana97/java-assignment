import java.util.HashSet;
import java.util.Scanner;

public class PanagramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();

        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                uniqueChars.add(c);
            }
        }

        return uniqueChars.size() == 26;
    }
}

