import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigInteger = new BigInteger(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());

        System.out.println(bigInteger.multiply(BigInteger.valueOf(i)));
    }
}
