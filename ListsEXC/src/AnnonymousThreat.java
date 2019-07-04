import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("3:1")) {

            String[] tokens = commands.split(" ");
            String cmd = tokens[0];

            if (cmd.equals("merge")){
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                for (int i = startIndex; i <=endIndex ; i++) {
                    names.set(startIndex, names.get(i) + names.get(i + 1));
                    names.remove(i + 1);
                }


            }



            commands = scanner.nextLine();
        }


    }
}
