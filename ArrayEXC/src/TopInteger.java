import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // not finished!!!!!!!!!!!!!!!!!!!!

        String[] array = scanner.nextLine().split(" ");
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        boolean numberFound = false;
        for (int i = 0; i < numbers.length; i++) {
            numberFound = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    numberFound = true;
                }
            }


        }
    }
}
