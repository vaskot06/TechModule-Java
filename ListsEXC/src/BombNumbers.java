import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberSequence = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int numberToBeDetonated = bombNumbers.get(0);
        int powerOfDetonation = bombNumbers.get(1);

        for (int i = 0; i < numberSequence.size(); i++) {
            if (numberToBeDetonated == numberSequence.get(i)) {

                int leftIndex = i - powerOfDetonation;
                if (leftIndex<0){
                    leftIndex=0;
                }
                int endIndex = i + powerOfDetonation;

                if (endIndex > numberSequence.size()){
                    endIndex = numberSequence.size();
                }


                for (int j = leftIndex; j <=endIndex ; j++) {
                   numberSequence.set(j, 0);
                }
            }

        }
     int sum = numberSequence.stream().reduce(0,
                (element1, element2) -> element1 + element2);
        System.out.println(sum);
    }
}