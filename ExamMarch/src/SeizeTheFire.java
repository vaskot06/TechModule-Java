import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeTheFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("#");
        int water = Integer.parseInt(scanner.nextLine());
        double efford = 0;
        double totalFire = 0;
        List<Double> firesToPrint = new ArrayList<>();



        for (int i = 0; i < input.length; i++) {
            String tokens = input[i];
            String[] array = tokens.split(" = ");
            String levelOfFire = array[0];
            double neededWaterToPutOut = Double.parseDouble(array[1]);

            if (water < neededWaterToPutOut) {
                continue;
            }

            if (levelOfFire.equals("Low")) {
                if (neededWaterToPutOut >= 1 && neededWaterToPutOut <= 50) {
                    water -= neededWaterToPutOut;
                    efford = efford + ((neededWaterToPutOut * 25) / 100);
                    totalFire += neededWaterToPutOut;
                    firesToPrint.add(neededWaterToPutOut);
                } else {
                    continue;
                }
            } else if (levelOfFire.equals("Medium")) {
                if (neededWaterToPutOut >= 51 && neededWaterToPutOut <= 80) {
                    water -= neededWaterToPutOut;
                    efford = efford + ((neededWaterToPutOut * 25) / 100);
                    totalFire += neededWaterToPutOut;
                    firesToPrint.add(neededWaterToPutOut);
                } else {
                    continue;
                }
            } else if (levelOfFire.equals("High")) {
                if (neededWaterToPutOut >= 81 && neededWaterToPutOut <= 125) {
                    water -= neededWaterToPutOut;
                    efford = efford + ((neededWaterToPutOut * 25) / 100);
                    totalFire += neededWaterToPutOut;
                    firesToPrint.add(neededWaterToPutOut);
                }else {
                    continue;
                }
            }

        }
        System.out.println("Cells:");
        for (Double fire : firesToPrint){
            System.out.printf(" - %.0f", fire);
            System.out.println();
        }
        System.out.printf("Effort: %.2f%n", efford);
        System.out.printf("Total Fire: %.0f", totalFire);
    }
}
