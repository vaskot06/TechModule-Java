import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> collected = new LinkedHashMap<>();

        while (true) {
            String resourse = scanner.nextLine();
            if (resourse.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!collected.containsKey(resourse)){
                collected.put(resourse, 0);
            }
            collected.put(resourse, collected.get(resourse) + quantity);
        }
        for (Map.Entry<String, Integer> entries : collected.entrySet()){
            String resourse = entries.getKey();
            int quant = entries.getValue();
            System.out.println(resourse + " -> " + quant);
        }
    }
}
