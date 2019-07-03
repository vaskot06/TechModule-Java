import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String input = scanner.nextLine();


        for (String banWord : banWords) {
            if (input.contains(banWord)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <banWord.length() ; i++) {
                    sb.append("*");
                }
                input = input.replace(banWord, sb);
            }
        }
        System.out.println(input);
    }
}
