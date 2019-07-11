import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[countWagons];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            String input = scanner.nextLine();
            arr[i] = Integer.parseInt(input);
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
