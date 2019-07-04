import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {

            String commands = scanner.nextLine();

            if (commands.equals("End")) {
                break;
            }

            String[] tokens = commands.split(" ");

            String cmd = tokens[0];

            if (cmd.equals("Add")) {
                int element = Integer.parseInt(tokens[1]);
                numbers.add(element);
            } else if (cmd.equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index < 0 || index > numbers.size()) {
                    System.out.println("Invalid index");
                    break;
                }
                numbers.add(index, element);
            } else if (cmd.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index < 0 || index > numbers.size()) {
                    System.out.println("Invalid index");
                    continue;
                }
                numbers.remove(index);
            } else if (cmd.equals("Shift")) {
                if (tokens[1].equals("left")) {
                    int count = Integer.parseInt(tokens[2]);
                    for (int i = 0; i < count; i++) {
                        int firstNumber = numbers.get(0);
                        numbers.add(firstNumber);
                        numbers.remove(0);
                    }
                } else if (tokens[1].equals("right")){
                    int count = Integer.parseInt(tokens[2]);
                    for (int i = 0; i < count; i++) {
                        int lastNumber = numbers.get(numbers.size()- 1);
                        numbers.add(0, lastNumber);
                        numbers.remove(numbers.size() -1);
                    }
                }

            }

        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
