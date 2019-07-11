import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budged = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int totalSum = 0;
        int price = 0;

        while (true) {
            String object = scanner.nextLine();
            totalSum = 0;
            sum = 0;

            if (object.equals("Stop")){
                System.out.printf("Money left: %d", budged);
                break;
            }

            for (int i = 0; i < object.length(); i++) {
                price = object.charAt(i);
                sum += price;
            }
            totalSum += sum;
            if (budged >= totalSum) {
                System.out.println("Item successfully purchased!");
                budged = budged - totalSum;
            } else {
                System.out.println("Not enough money!");
                break;
            }

        }
    }
}
