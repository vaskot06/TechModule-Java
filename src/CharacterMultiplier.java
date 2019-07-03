import java.util.Scanner;

public class CharacterMultiplier {


    private static int multiply(String number1, String number2) {

        int sum = 0;
        if (number1.length() > number2.length()) {
            for (int i = 0; i < number1.length(); i++) {
                if (number2.length() <= i) {
                    sum += number1.charAt(i);
                } else {
                    int firstNumber = number1.charAt(i);
                    int secondNumber = number2.charAt(i);
                    sum += (firstNumber * secondNumber);
                }
            }
        } else {
            for (int i = 0; i < number2.length(); i++) {
                if (number1.length() <= i) {
                    sum += number2.charAt(i);
                } else {
                    int firstNumber = number1.charAt(i);
                    int secondNumber = number2.charAt(i);
                    sum += (firstNumber * secondNumber);
                }
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];

        System.out.println(multiply(first, second));

    }

}
