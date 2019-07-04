import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int size = sequence.size();
        int sum = 0;

        while (!sequence.isEmpty()) {

            int distanceIndex = Integer.parseInt(scanner.nextLine());
            if (distanceIndex<0){
                distanceIndex = 0;
                int removedIndexNumber = sequence.get(distanceIndex);
                sum += removedIndexNumber;
                sequence.remove(distanceIndex);
                sequence.add(0, sequence.size());

                for (int i = 0; i < sequence.size(); i++) {
                    if (removedIndexNumber >= sequence.get(i)) {
                        int increasedElement = sequence.get(i) + removedIndexNumber;
                        sequence.remove(i);
                        sequence.add(i, increasedElement);
                    } else if (removedIndexNumber < sequence.get(i)) {
                        int decreasedElement = sequence.get(i) - removedIndexNumber;
                        sequence.remove(i);
                        sequence.add(i, decreasedElement);
                    }
                }
                continue;
            }else if (distanceIndex >= sequence.size()){
                distanceIndex = sequence.size() -1;
                int removedIndexNumber = sequence.get(distanceIndex);
                sum += removedIndexNumber;
                sequence.remove(distanceIndex);
                sequence.add(sequence.size(), removedIndexNumber);

                for (int i = 0; i < sequence.size(); i++) {
                    if (removedIndexNumber >= sequence.get(i)) {
                        int increasedElement = sequence.get(i) + removedIndexNumber;
                        sequence.remove(i);
                        sequence.add(i, increasedElement);
                    } else if (removedIndexNumber < sequence.get(i)) {
                        int decreasedElement = sequence.get(i) - removedIndexNumber;
                        sequence.remove(i);
                        sequence.add(i, decreasedElement);
                    }
                }
                continue;
            }
            int removedIndexNumber = sequence.get(distanceIndex);
            sum += removedIndexNumber;
            sequence.remove(distanceIndex);

            for (int i = 0; i < sequence.size(); i++) {
                if (removedIndexNumber >= sequence.get(i)) {
                    int increasedElement = sequence.get(i) + removedIndexNumber;
                    sequence.remove(i);
                    sequence.add(i, increasedElement);
                } else if (removedIndexNumber < sequence.get(i)) {
                    int decreasedElement = sequence.get(i) - removedIndexNumber;
                    sequence.remove(i);
                    sequence.add(i, decreasedElement);
                }
            }

        }
        System.out.println(sum);
    }
}
