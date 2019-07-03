import java.util.Scanner;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = 100;
        int coins = 100;

        String[] input = scanner.nextLine().split("\\|");


        for (int i = 0; i < input.length; i++) {
            String commands = input[i];
            String[] tokens = commands.split("-");


            if (tokens[0].equals("rest")) {
                int energyGained = Integer.parseInt(tokens[1]);
                if (energy == 100) {
                    System.out.println("You gained 0 energy.");
                    System.out.println("Current energy: 100.");
                } else if (energy + energyGained > 100) {
                    System.out.printf("You gained %d energy.%n", (energyGained - ((energy + energyGained) - 100)));
                    System.out.println("Current energy: 100.");
                    energy = 100;
                } else {
                    energy += energyGained;
                    System.out.printf("You gained %d energy.%n", energyGained);
                    System.out.printf("Current energy: %d.%n", energy);
                }
            } else if (tokens[0].equals("order")) {
                int coinsGained = Integer.parseInt(tokens[1]);
                energy -= 30;
                if (energy >= 0) {
                    System.out.printf("You earned %d coins.%n", coinsGained);
                    coins += coinsGained;
                } else {
                    energy += 50 + 30;
                    System.out.printf("You had to rest!%n");
                }
            } else {
                String ingredient = tokens[0];
                int coinsToSpent = Integer.parseInt(tokens[1]);
                coins -= coinsToSpent;

                if (coins > 0) {
                    System.out.printf("You bought %s.%n", ingredient);
                } else {
                    System.out.printf("Closed! Cannot afford %s.%n", ingredient);
                    return;
                }
            }
        }
        System.out.println("Day completed!");
        System.out.printf("Coins: %d%n", coins);
        System.out.printf("Energy: %d%n", energy);
    }
}
