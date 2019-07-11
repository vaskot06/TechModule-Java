import java.util.Scanner;

public class MaxSeqOfEqEls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int maxLenght = 1;
        int counter = 1;
        int bestIndex = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxLenght) {
                maxLenght = counter;
                bestIndex = i + 1;
            }
        }

        int beginIndex = (bestIndex - maxLenght) + 1;
        int endIndex = beginIndex + maxLenght;
        for (int i = beginIndex; i < endIndex; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
