import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOcurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }
        ArrayList<String> odds = new ArrayList<>();
        for (var entry : counts.entrySet()){
            if (entry.getValue() % 2 == 1){
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i <odds.size() ; i++) {
            if (i == odds.size() - 1){
                System.out.print(odds.get(i));
                break;
            }
            System.out.print(odds.get(i) + ", ");
        }
    }
}
