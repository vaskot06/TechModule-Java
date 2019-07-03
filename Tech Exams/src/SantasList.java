import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 15:20 - 15:36

        List<String> initialList = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("Finished!")) {
            String[] tokens = commands.split(" ");
            String cmd = tokens[0];
            if (cmd.equals("Bad")) {
                if (initialList.contains(tokens[1])) {
                    commands = scanner.nextLine();
                    continue;
                } else {
                    initialList.add(0, tokens[1]);
                }
            } else if (cmd.equals("Good")) {
                if (initialList.contains(tokens[1])) {
                    initialList.remove(tokens[1]);
                } else {
                    commands = scanner.nextLine();
                    continue;
                }
            } else if (cmd.equals("Rename")) {
                if (!initialList.contains(tokens[1])) {
                    commands = scanner.nextLine();
                    continue;
                } else {
                    int index = initialList.indexOf(tokens[1]);
                    initialList.add(index, tokens[2]);
                    initialList.remove(tokens[1]);
                }
            } else if (cmd.equals("Rearrange")) {
                if (!initialList.contains(tokens[1])) {
                    commands = scanner.nextLine();
                    continue;
                } else {
                    initialList.remove(tokens[1]);
                    initialList.add(tokens[1]);
                }

            }


            commands = scanner.nextLine();
        }
        for (int i = 0; i < initialList.size() - 1; i++) {
            System.out.print(initialList.get(i) + ", ");
        }
        for (int i = initialList.size() - 1; i < initialList.size(); i++) {
            System.out.print(initialList.get(i));
        }
    }
}
