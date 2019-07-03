import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 14:45 - 15:08

        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int ornamentSet = 2;
        int treeSkirt = 5;
        int treeGarlands = 3;
        int treeLights = 15;
        int spirit = 0;
        int totalCost = 0;


        for (int i = 1; i <= days; i++) {

            if (i % 11 == 0) {
                quantity+=2;
            }

            if (i % 2 == 0) {
                totalCost += (ornamentSet * quantity);
                spirit += 5;
            }
             if (i % 3 == 0) {
                totalCost += ((treeSkirt + treeGarlands) * quantity);
                spirit += 13;
            }
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    totalCost += (treeLights * quantity);
                    spirit += 47;
                } else {
                    totalCost += (treeLights * quantity);
                    spirit += 17;
                }
            }
            if (i % 10 == 0) {
                spirit-=20;
                totalCost+=(treeSkirt + treeGarlands+ treeLights);
                if (i == days) {
                    spirit-=30;
                }
            }
        }

        System.out.printf("Total cost: %d%n", totalCost);
        System.out.printf("Total spirit: %d", spirit);
    }
}
