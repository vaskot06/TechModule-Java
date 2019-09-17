import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {


        }





















//        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
//        List<String> toPrint = new ArrayList<>();
//
//        for (int i = 0; i <input.size() ; i++) {
//            String symbol = input.get(i);
//            if (!symbol.equals(">")){
//                toPrint.add(symbol);
//            }else {
//                toPrint.add(">");
//                int power = Integer.parseInt(input.get(i + 1));
//                i+=power;
//            }
//        }
//        for (String symbol : toPrint) {
//            System.out.print(symbol);
//        }


    }
}
