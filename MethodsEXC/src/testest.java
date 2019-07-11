import java.util.Arrays;
import java.util.Scanner;


public class testest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String [] indexes = scanner.nextLine().split(" ");
        int [] field = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
           int index = Integer.parseInt(indexes[i]);
           if (index >= 0 && index < fieldSize){
               field[index] = 1;
           }
        }


        while (true){
            String commands = scanner.nextLine();
            if (commands.equals("end")){
                break;
            }


        }
     //   System.out.println(fieldSize.length);

    }
}
