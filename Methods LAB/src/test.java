import java.util.Scanner;

public class test {

    public static int getMultiplyOfEvenAndOdds(int n) {

        int oddSum = 0;
        int evenSum = 0;
        int actualNumber = n;
        String actualNumberStr = String.valueOf(actualNumber);

        for (int i = 0; i < actualNumberStr.length(); i++) {

            int digit = actualNumber % 10;
            actualNumber /= 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        int result = Math.abs(evenSum * oddSum);
        return result;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int actualNumber = Integer.parseInt(number);
        System.out.println(getMultiplyOfEvenAndOdds(actualNumber));
    }
}
