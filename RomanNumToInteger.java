import java.util.*;

public class RomanNumToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        scanner.close();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer equivalent: " + result);
    }

    public static int romanToInteger(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('i', 1);
        roman.put('V', 5);
        roman.put('v', 5);
        roman.put('X', 10);
        roman.put('x', 10);
        roman.put('L', 50);
        roman.put('l', 50);
        roman.put('C', 100);
        roman.put('c', 100);
        roman.put('D', 500);
        roman.put('d', 500);
        roman.put('M', 1000);
        roman.put('m', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = roman.get(s.charAt(i));
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}

