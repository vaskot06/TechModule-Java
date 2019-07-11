import java.util.Scanner;

public class PalindromeIntegers {


    public static boolean isPalindrome(int integer) {
        String intStr = String.valueOf(integer);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            System.out.println(isPalindrome(number));
            input = scanner.nextLine();
        }
    }
}
