import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 15:50 - 15:54
        // 16:24 - 16:53

        List<Integer> houseWithMembers = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String jumpCommands = scanner.nextLine();
        int santaIndex = 0;

        while (!jumpCommands.equals("Merry Xmas!")){
            String[] tokens = jumpCommands.split(" ");

            if (tokens[0].equals("Jump")){
                int lengthOfJump = Integer.parseInt(tokens[1]);

                if (santaIndex + lengthOfJump == houseWithMembers.size()){
                    santaIndex = (santaIndex + lengthOfJump) % houseWithMembers.size();
                }else {
                    santaIndex += lengthOfJump;
                }

                if (houseWithMembers.indexOf(santaIndex) == 0){
                    System.out.printf("House %d will have a Merry Christmas.",santaIndex);
                }else {

                }


            }




            jumpCommands = scanner.nextLine();
        }

    }
}
