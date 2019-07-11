import java.util.Scanner;

public class AddAndSubtact {

    public static int sum (int a, int b){
        return a + b;
    }

    public static int subtact (int a, int b, int c){


        int result = sum(a, b) - c;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(subtact(a , b, c));

    }
}
