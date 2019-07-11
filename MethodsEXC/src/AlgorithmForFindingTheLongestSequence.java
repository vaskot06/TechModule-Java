import java.util.Arrays;
import java.util.Scanner;


public class AlgorithmForFindingTheLongestSequence {

    static void findSequence(int[] arr, int arrLength) {

        int frequency = 1;
        int bestNumber = arr[0];

        int bestFrequency = 0;

        for (int n = 1; n < arrLength; n++) {
            if (arr[n] != arr[n - 1]) {
                if (frequency > bestFrequency) {
                    bestNumber = arr[n - 1];
                    bestFrequency = frequency;
                }
                frequency = 1;
            } else {
                frequency++;
            }
        }

        if (frequency > bestFrequency) {
            bestNumber = arr[arrLength - 1];
            bestFrequency = frequency;
        }

        for (int i = 0; i < bestFrequency; i++) {
            System.out.print(bestNumber + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        findSequence(arr, arr.length);

    }
}
