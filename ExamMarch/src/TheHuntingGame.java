import java.util.Scanner;

public class TheHuntingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int countOfPlayers = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double totalNeededWater = days * countOfPlayers * waterPerDay;
        double totalNeededFood = days * countOfPlayers * foodPerDay;

        for (int i = 1; i <= days; i++) {
            double dailyEnergyLossFromWood = Double.parseDouble(scanner.nextLine());
            energy -= dailyEnergyLossFromWood;

            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalNeededFood, totalNeededWater);
                //printirai kogaot energyto e 0 ili po malko ot 0
                return;
            }

            if (i % 2 == 0) {
                energy = energy + ((energy * 5) / 100);
                totalNeededWater = totalNeededWater - ((totalNeededWater * 30) / 100);
            }

            if (i % 3 == 0) {
                energy = energy + ((energy * 10) / 100);
                totalNeededFood = totalNeededFood - (totalNeededFood / countOfPlayers);
            }
        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",energy);
    }
}
