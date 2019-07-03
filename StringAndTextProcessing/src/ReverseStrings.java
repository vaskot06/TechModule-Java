import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(line).reverse();
            System.out.println(line + " = " + stringBuilder);
            line = scanner.nextLine();
        }
    }
}
