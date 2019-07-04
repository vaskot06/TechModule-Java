import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split(" ");

            String cmd = tokens[0];
            int number = Integer.parseInt(tokens[1]);
            if (cmd.equals("Delete")) {
                numbers.removeAll(Collections.singleton(number));
                break;
            } else if (cmd.equals("Insert")) {
                int position = Integer.parseInt(tokens[2]);
                if (position >= numbers.size() || position < 0) {
                    numbers.add(number);
                } else {
                    numbers.add(position, number);

                }
                command = scanner.nextLine();
            }
            numbers.forEach(e -> System.out.print(e + " "));
        }
    }
}