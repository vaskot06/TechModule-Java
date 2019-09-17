import java.util.Scanner;
import java.util.regex.Pattern;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(Pattern.quote("\\"));
        String extract = "";
        for (int i = 0; i < input.length; i++) {
            extract = input[input.length - 1];
        }
        String [] wordAndExtension = extract.split("\\.");


        String firstWord = wordAndExtension[0];
        String extension = wordAndExtension[1];

        System.out.printf("File name: %s%nFile extension: %s", firstWord, extension);

    }
}
