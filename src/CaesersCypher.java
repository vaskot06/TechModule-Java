import java.util.Scanner;

public class CaesersCypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int a = (input.charAt(i) + 3);
            char ch = (char) a;
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
    }
}
