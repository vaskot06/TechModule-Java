import java.util.Scanner;

public class FactorialNumbers {

    public static void factorialDivision (int a, int b){

        double sumFirst = 1;
        double sumSecond = 1;

        for (int i = 1; i <= a ; i++) {
            sumFirst *= i;
        }
        for (int i = 1; i <= b; i++) {
            sumSecond *= i;
        }

        System.out.printf("%.2f", sumFirst / sumSecond);

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        factorialDivision(firstNum,secondNum);
    }
}
