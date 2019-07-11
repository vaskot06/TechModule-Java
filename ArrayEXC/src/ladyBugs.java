import java.util.Scanner;

public class ladyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] indexes = scanner.nextLine().split(" ");

        int[] field = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
            int index = Integer.parseInt(indexes[i]);

            if (index < fieldSize && index >= 0) {
                field[index] = 1;
            }
        }

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] tokens = commands.split(" ");
            int ladybugIndex = Integer.parseInt(tokens[0]);
            String cmd = tokens[1];
            int length = Integer.parseInt(tokens[2]);

            if (ladybugIndex > field.length - 1 || ladybugIndex < 0 || field[ladybugIndex] == 0) {
                commands = scanner.nextLine();
                continue;
            }

            field[ladybugIndex] = 0;

            if (cmd.equals("right")) {
                ladybugIndex += length;
                while (ladybugIndex < field.length && field[ladybugIndex] == 1) {
                    ladybugIndex+=length;
                }
                if (ladybugIndex < field.length) {
                    field[ladybugIndex] = 1;
                }
            }else {
                ladybugIndex -= length;
                while (ladybugIndex >= 0 && field[ladybugIndex] == 1) {
                    ladybugIndex -=length;
                }
                if (ladybugIndex >= 0) {
                    field[ladybugIndex] = 1;
                }
            }


            commands = scanner.nextLine();
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}
