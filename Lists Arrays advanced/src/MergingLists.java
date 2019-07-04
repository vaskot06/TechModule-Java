import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = firstList.size() + secondList.size();
        List<Integer> result = new ArrayList<>(firstList.size() + secondList.size());
        int counter = 0;

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                counter++;
                result.add(firstList.get(i));
                if (counter <= secondList.size()) {
                    result.add(secondList.get(i));
                }
            }
        } else if ((secondList.size() > firstList.size())) {
            for (int i = 0; i < secondList.size(); i++) {
                counter++;
                if (counter <= firstList.size()) {
                    result.add(firstList.get(i));
                }
                result.add(secondList.get(i));
            }
        }else {
            for (int i = 0; i <firstList.size() ; i++) {
                result.add(firstList.get(i));
                result.add(secondList.get(i));
            }
        }
        result.forEach(e -> System.out.print(e + " "));
    }
}
