import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("Stop")) {
            String[] tokens = commands.split(" ");
            String cmd = tokens[0];

            if (cmd.equals("Delete")) {
                int index = Integer.parseInt(tokens[1]);
                if (index + 1 >= 0 && index + 1 < input.size()) {
                    input.remove(index + 1);
                }
            } else if (cmd.equals("Swap")) {
                String word1 = tokens[1];
                int word1Index = input.indexOf(word1);
                String word2 = tokens[2];
                int word2Index = input.indexOf(word2);

                if (input.contains(word1) && input.contains(word2)) {
                    Collections.swap(input, word1Index, word2Index);
                }
            } else if (cmd.equals("Put")) {
                String word = tokens[1];
                int wordIndex = Integer.parseInt(tokens[2]);
                if (wordIndex - 1 >= 0 && wordIndex - 1 <= input.size()) {
                    input.add(wordIndex - 1, word);
                }
            } else if (cmd.equals("Sort")) {
                input.sort(Collections.reverseOrder());
            } else if (cmd.equals("Replace")) {
                String word1 = tokens[1];
                String word2 = tokens[2];
                int word2Index = input.indexOf(word2);

                if (input.contains(word2)) {
                    input.add(word2Index, word1);
                    input.remove(word2);
                }
            }
            commands = scanner.nextLine();
        }

        for (String word : input) {
            System.out.print(word + " ");
        }

    }
}
