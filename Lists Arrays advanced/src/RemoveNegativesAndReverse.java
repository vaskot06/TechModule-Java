import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> positiveNumbers = new ArrayList<>();

        for (int i = 0; i <numbers.size() ; i++) {
           positiveNumbers = numbers.stream().filter(e-> e > 0).collect(Collectors.toList());
        }
        if (positiveNumbers.isEmpty()){
            System.out.println("empty");
        }
        Collections.reverse(positiveNumbers);
        positiveNumbers.forEach(e-> System.out.print(e + " "));
    }
}
