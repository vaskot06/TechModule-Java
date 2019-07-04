import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = firstPlayer.size() + secondPlayer.size();
        int winnnerSum = 0;
        int sum = 0;
        boolean flag = false;

        while (!firstPlayer.isEmpty() || !secondPlayer.isEmpty()) {


            if (firstPlayer.get(0) > secondPlayer.get(0)) {
                firstPlayer.add(firstPlayer.size(), secondPlayer.get(0));
                firstPlayer.add(firstPlayer.size() - 1, firstPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (firstPlayer.get(0) < secondPlayer.get(0)) {
                secondPlayer.add(secondPlayer.size(), secondPlayer.get(0));
                secondPlayer.add(secondPlayer.size() - 1, firstPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (firstPlayer.get(0).equals(secondPlayer.get(0))) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }


        }
        if (firstPlayer.isEmpty()) {
            sum = secondPlayer.stream().reduce(0, (element1, element2) -> element1 + element2);
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            sum = firstPlayer.stream().reduce(0, (element1, element2) -> element1 + element2);
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
