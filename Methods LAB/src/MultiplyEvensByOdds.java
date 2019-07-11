import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static int sumOfOdds (int number){
        int sumOfOdds = 0;



        return sumOfOdds;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int oddSum =0;
        int evenSum =0;
        int actualNumber = Integer.parseInt(number);
        for (int i = 0; i < number.length(); i++) {

            int digit = actualNumber % 10;
            actualNumber /= 10;
            if (digit % 2 == 0){
                evenSum += digit;
            }else {
                oddSum += digit;
            }

        }
        int result = evenSum * oddSum;
        System.out.println(result);
    }
}
