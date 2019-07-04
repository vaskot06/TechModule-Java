import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commands; i++) {

            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String name = tokens[0];
            String not = tokens[2];

            if (!not.equals("not") && guests.contains(name)){
                System.out.println(name + " is already in the list!");
            }

            if (!not.equals("not") && !guests.contains(name)){
                guests.add(name);
            }

            if (not.equals("not") && !guests.contains(name)){
                System.out.println(name + " is not in the list!");
                guests.remove(name);
            }else if (not.equals("not") && guests.contains(name)){
                guests.remove(name);
            }

        }

        guests.forEach(System.out::println);
    }
}
