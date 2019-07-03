import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigInteger f = new BigInteger(String.valueOf(1));
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(f);
    }
}
