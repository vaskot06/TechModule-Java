import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split(" ");

            String cmd = tokens[0];

            if (cmd.equals("Contains")) {
                int cmdNumber = Integer.parseInt(tokens[1]);
                if (numbers.contains(cmdNumber)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (cmd.equals("Print")) {
                String tokenCommand = tokens[1];
                if (tokenCommand.equals("even")) {
                    List<Integer> even = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
                    even.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                } else if (tokenCommand.equals("odd")) {
                    List<Integer> odd = numbers.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
                    odd.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                }
            } else if (cmd.equals("Get")) {
                String tokenCommand = tokens[1];
                if (tokenCommand.equals("sum")){
                    int sum = numbers.stream().reduce(0,(e1, e2)->e1 + e2);
                    System.out.println(sum);
                }
            }else if (cmd.equals("Filter")){
                String condition = tokens[1];
                int number = Integer.parseInt(tokens[2]);
                if (condition.equals("<")){
                    List<Integer> result = numbers.stream().filter(e-> e < number).collect(Collectors.toList());
                    result.forEach(e-> System.out.print(e + " "));
                    System.out.println();
                }else if (condition.equals(">")){
                    List<Integer> result = numbers.stream().filter(e-> e > number).collect(Collectors.toList());
                    result.forEach(e-> System.out.print(e + " "));
                    System.out.println();
                }else if (condition.equals("<=")){
                    List<Integer> result = numbers.stream().filter(e-> e <= number).collect(Collectors.toList());
                    result.forEach(e-> System.out.print(e + " "));
                    System.out.println();
                }else if (condition.equals(">=")){
                    List<Integer> result = numbers.stream().filter(e-> e >= number).collect(Collectors.toList());
                    result.forEach(e-> System.out.print(e + " "));
                    System.out.println();
                }
            }
            input = scanner.nextLine();
        }
    }
}
