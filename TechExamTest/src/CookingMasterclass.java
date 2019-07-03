import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        double students = Double.parseDouble(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfEgg = Double.parseDouble(scanner.nextLine());
        double priceOfApron = Double.parseDouble(scanner.nextLine());

        double eggTotal = (priceOfEgg * 10) * students;
        double appronStudents = Math.ceil(students * 20 / 100) + students;
        double apronTotal = priceOfApron * appronStudents;
        double flourTotal = Math.ceil(students - (students / 5)) * priceOfFlour;

        double total = apronTotal + eggTotal + flourTotal;


        if (total > budged) {
            System.out.printf("%.2f$ more needed.", total - budged);
        }else {
            System.out.printf("Items purchased for %.2f$.", total);
        }






    }
}
