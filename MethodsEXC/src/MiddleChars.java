import java.util.Scanner;

public class MiddleChars {

    public static void toPrintMiddleChar (String s){

        String [] input = s.split("");
        String a = "";

        for (int i = 0; i <input.length ; i++) {
            a = input[i / 2];
            if (input.length % 2 == 0){
                a = input[i/2] + input [(i/2) + 1];
            }
        }
        System.out.println(a);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        toPrintMiddleChar(input);
    }
}
