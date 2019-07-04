import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            String [] tokens = command.split(" ");

            String cmd = tokens[0];
            int cmdNumber = Integer.parseInt(tokens[1]);


            if (cmd.equals("Add")){
                input.add(cmdNumber);
            } else if (cmd.equals("Remove")) {
                input.remove(cmdNumber);
            }else if (cmd.equals("RemoveAt")){
                input.remove(cmdNumber);
            }else if (cmd.equals("Insert")){
                int cmdSecondNumber = Integer.parseInt(tokens[2]);
                input.add(cmdSecondNumber, cmdNumber);
            }

            command = scanner.nextLine();
        }
        input.forEach(e-> System.out.print(e + " "));
    }
}
