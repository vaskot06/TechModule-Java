import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Character> toPrint = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (i == input.length() - 1) {
                char b = input.charAt(i - 1);

                if (a == b) {
                    toPrint.add(a);
                    break;
                }else {
                    toPrint.add(a);
                    break;
                }
            }
            char b = input.charAt(i + 1);

            if (a == b) {
                continue;
            }else {
                toPrint.add(a);

            }
        }

        for (Character character : toPrint) {
            System.out.print(character);
        }
    }
}
