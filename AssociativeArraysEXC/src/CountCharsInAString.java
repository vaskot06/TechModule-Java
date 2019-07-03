import com.sun.source.tree.Tree;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (!counts.containsKey(symbol)) {
                counts.put(symbol, 0);
            }
            counts.put(symbol, counts.get(symbol) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if (key == ' '){
                continue;
            }

            System.out.println(key + " -> " + value);
        }
    }
}
