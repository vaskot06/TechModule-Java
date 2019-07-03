import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            input = input.replace(wordToRemove, "");
        }
        System.out.println(input);
    }
}
