import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] inputArray = line.split(" ");

        Random rnd = new Random();

        for (int pos1 = 0; pos1 < inputArray.length; pos1++) {
            int pos2 = rnd.nextInt(inputArray.length);

            if (pos1 != pos2) {
                String oldWord = inputArray[pos1];
                inputArray[pos1] = inputArray[pos2];
                inputArray[pos2] = oldWord;
            }
        }
        System.out.println(String.join(System.lineSeparator(),
                inputArray));
    }
}
