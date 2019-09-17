import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        double sum = 0;

        for (String thing : line) {
            String[] symbols = thing.split("");
            String firstLetter = symbols[0];
            String lastLetter = symbols[symbols.length - 1];
            String numberInString = thing.substring(1, thing.length() - 1);
            double number = Double.parseDouble(numberInString);

            if (upperCaseLetters.contains(firstLetter)) {
                double upperCasePositionFirstLetter = upperCaseLetters.indexOf(firstLetter) + 1;
                number /= upperCasePositionFirstLetter;

            }
            if (lowerCaseLetters.contains(firstLetter)) {
                double lowerCasePositionFirstLetter = lowerCaseLetters.indexOf(firstLetter) + 1;
                number *= lowerCasePositionFirstLetter;

            }

            if (upperCaseLetters.contains(lastLetter)) {
                double upperCasePositionLastLetter = upperCaseLetters.indexOf(lastLetter) + 1;
                number -= upperCasePositionLastLetter;
            }


            if (lowerCaseLetters.contains(lastLetter)) {
                double lowerCasePositionLastLetter = lowerCaseLetters.indexOf(lastLetter) + 1;
                number += lowerCasePositionLastLetter;

            }
            sum += number;
        }
        System.out.printf("%.2f", sum);
    }


}
