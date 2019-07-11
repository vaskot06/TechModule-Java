import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] numbers = new int[inputArr.length];
        int result = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int arrResult = 0;
                arrResult = numbers[i] + numbers[j];
                if (result == arrResult) {
                    System.out.print(numbers[i] + " " + numbers[j]);
                    System.out.println();
                }
            }
        }
    }
}
