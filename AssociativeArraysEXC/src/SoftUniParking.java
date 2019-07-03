import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> namesAndPlates = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String cmd = tokens[0];
            String username = tokens[1];

            if (cmd.equals("register")) {
                String licensedPlate = tokens[2];
                if (!namesAndPlates.containsKey(username)) {
                    namesAndPlates.put(username, licensedPlate);
                    System.out.printf("%s registered %s successfully%n", username, licensedPlate);
                } else if (namesAndPlates.containsKey(username) && namesAndPlates.containsValue(licensedPlate)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensedPlate);
                }
            } else {
                if (!namesAndPlates.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    namesAndPlates.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
            namesAndPlates.forEach((e1, e2) -> System.out.printf("%s => %s%n", e1,e2));
    }
}
