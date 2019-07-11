import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] firstArr = new int[n];
        int [] secondArr = new int[n];

        for (int i = 0; i < n; i++) {

            String [] input = scanner.nextLine().split(" ");


            if (i % 2 == 0){
                firstArr [i] = Integer.parseInt(input[0]);
                secondArr [i] = Integer.parseInt(input[1]);
            }else {
                firstArr [i] = Integer.parseInt(input[1]);
                secondArr [i] = Integer.parseInt(input[0]);
            }
        }
        for (int i : firstArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArr) {
            System.out.print(i + " ");
        }
    }
}
