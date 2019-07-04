import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagon = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            if (tokens[0].equals("Add")) {
                int newWagon = Integer.parseInt(tokens[1]);
                wagon.add(newWagon);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                wagon.stream().filter(w -> maxCapacity - w >= passengers).findFirst().ifPresent(freeWagon -> {
                    int indexOfFreeWagon = wagon.indexOf(freeWagon);
                    wagon.set(indexOfFreeWagon, freeWagon + passengers);
                });

            }

            input = scanner.nextLine();
        }

        wagon.forEach(e -> System.out.print(e + " "));
    }
}
