import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 15:50 - 15:54
        // 16:24 - 16:53

        int[] houseWithMembers = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String jumpCommands = scanner.nextLine();
        int santaIndex = 0;

        while (!jumpCommands.equals("Merry Xmas!")) {
            String[] tokens = jumpCommands.split(" ");

            if (tokens[0].equals("Jump")) {
                int lengthOfJump = Integer.parseInt(tokens[1]);

                if (santaIndex + lengthOfJump >= houseWithMembers.length) {
                    santaIndex = (santaIndex + lengthOfJump) % houseWithMembers.length;
                } else {
                    santaIndex += lengthOfJump;
                }

                if (houseWithMembers[santaIndex] == 0) {
                    System.out.printf("House %d will have a Merry Christmas.%n", santaIndex);
                } else {
                    houseWithMembers[santaIndex] -= 2;
                }
            }
            jumpCommands = scanner.nextLine();
        }

        System.out.printf("Santa's last position was %d.%n", santaIndex);
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < houseWithMembers.length; i++) {
            if (houseWithMembers[i] != 0){
                counter++;
            }
            sum += houseWithMembers[i];
        }
        if (sum == 0){
            System.out.println("Mission was successful!");
        }else {
            System.out.printf("Santa has failed %d houses.", counter);
        }
    }
}
