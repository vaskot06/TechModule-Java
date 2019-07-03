import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }
        DecimalFormat df = new DecimalFormat("#.#");

        for (Map.Entry<Double, Integer> entries : counts.entrySet()) {
            System.out.printf("%s -> %d", df.format(entries.getKey()), entries.getValue());
            System.out.println();
        }
    }
}
