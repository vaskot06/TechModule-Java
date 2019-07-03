import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String name : input) {
            if (name.length() < 3 || name.length() > 16) {
                continue;
            }
            if (name.matches("\\W*")){
                continue;
            }
            if (name.matches("[!-']*") || name.matches("[:-A]")){
                continue;
            }

            System.out.println(name);
        }
    }
}
