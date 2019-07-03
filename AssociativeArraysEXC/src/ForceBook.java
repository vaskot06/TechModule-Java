import java.util.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceUsers = new TreeMap<>();
        String input = scanner.nextLine();
        String tokenOne = "";
        String tokenTwo = "";

        while (!input.equals("Lumpawaroo")) {

            if (input.contains(" -> ")) {
                String[] tokens = input.split(" -> ");
                tokenOne = tokens[0];
                tokenTwo = tokens[1];

                for (Map.Entry<String, List<String>> name : forceUsers.entrySet()) {
                    String side = name.getKey();
                    List<String> users = name.getValue();
                    Iterator<String> iter = users.iterator();

                    for (Iterator<String> it = iter; it.hasNext(); ) {
                        String user = it.next();
                        if (user.equals(tokenOne) && !side.equals(tokenTwo)) {
                            iter.remove();
                        }
                    }
                }

                if (!forceUsers.containsValue(tokenOne) && !forceUsers.containsKey(tokenTwo)) {
                    forceUsers.put(tokenTwo, new ArrayList<>());
                    forceUsers.get(tokenTwo).add(tokenOne);
                    System.out.printf("%s joins the %s side!%n", tokenOne, tokenTwo);

                } else if (!forceUsers.containsValue(tokenOne) && forceUsers.containsKey(tokenTwo)) {
                    List<String> list = forceUsers.get(tokenTwo);
                    list.add(tokenOne);
                    Collections.sort(list);
                    System.out.printf("%s joins the %s side!%n", tokenOne, tokenTwo);
                }


            } else {
                String[] tokens = input.split(" | ");
                tokenOne = tokens[0];
                tokenTwo = tokens[2];

                if (!forceUsers.containsValue(tokenTwo)) {
                    forceUsers.put(tokenOne, new ArrayList<>());
                }
                List<String> list = forceUsers.get(tokenOne);
                list.add(tokenTwo);
                Collections.sort(list);
            }


            input = scanner.nextLine();
        }


        for (Map.Entry<String, List<String>> entry : forceUsers.entrySet()) {
            String forceSide = entry.getKey();
            List<String> forceWielders = entry.getValue();

            if (forceWielders.size() <= 0) {
                continue;
            }
            System.out.printf("Side: %s, Members: %d%n", forceSide, forceWielders.size());

            for (String forcers : forceWielders) {
                System.out.println("! " + forcers);
            }

        }

    }
}
