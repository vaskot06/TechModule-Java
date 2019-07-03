import java.util.Scanner;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int bestQuality = 0;
        int bestAverageQuality = 0;
        String[] bestBatch = new String[0];

        while (!line.equals("Bake It!")) {
            String[] tokens = line.split("#");
            int totalQuality = 0;
            int averageQuality = 0;
            String batch = "";

            for (int i = 0; i < tokens.length; i++) {
                totalQuality += Integer.parseInt(tokens[i]);
                averageQuality = totalQuality / tokens.length;

            }

            if (totalQuality > bestQuality || averageQuality > bestAverageQuality ) {
                bestQuality = totalQuality;
                bestAverageQuality = averageQuality;
                bestBatch = line.split("#");
            } else if (bestQuality == 0) {
                bestQuality = totalQuality;
                bestAverageQuality = averageQuality;
                bestBatch = line.split("#");
            }


            line = scanner.nextLine();
        }
        System.out.printf("Best Batch quality: %d%n", bestQuality);
        for (int i = 0; i < bestBatch.length; i++) {
            System.out.print(bestBatch[i] + " ");
        }

    }
}
