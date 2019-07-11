import java.util.Scanner;

public class VowelCount {


    public static void vowelCount(String i) {


        String[] input = i.toLowerCase().split("");

        int counter = 0;

        for (int j = 0; j < input.length; j++) {
            if (input[j].contains("a")) {
                counter++;
            } else if (input[j].contains("e")) {
                counter++;
            } else if (input[j].contains("u")) {
                counter++;
            } else if (input[j].contains("o")) {
                counter++;
            } else if (input[j].contains("i")) {
                counter++;
            }
        }
        System.out.println(counter);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        vowelCount(input);
    }
}
