import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String [] tokens = input.split(" ");

            if (Integer.parseInt(tokens[1])> 30){
            map.putIfAbsent(tokens[0], Integer.parseInt(tokens[1]));
            }

        }
        map.forEach((e1,e2)-> System.out.println(e1 + " - " + e2));
    }
}
