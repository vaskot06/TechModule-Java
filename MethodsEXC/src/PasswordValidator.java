import java.util.Scanner;

public class PasswordValidator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        String input = scanner.nextLine();

        if (input.length() <= 5 || input.length() >= 11) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }else {
            isValid = true;
        }

        char chararray[] = input.toCharArray();

        for (int i = 0; i < chararray.length; i++) {
            int value = (int) chararray[i];
            if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122) || (value >= 48 && value <= 57)) {
            isValid = true;
            } else {
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        }
        int digitCounter = 0;
        for (int i = 0; i < chararray.length; i++) {
            int value = (int) chararray[i];

            if (value >= 48 && value <= 57) {
                digitCounter++;
            }
        }
            if (digitCounter >= 2 && isValid == true) {
                isValid = true;
            } else if (digitCounter < 2){
                System.out.println("Password must have at least 2 digits");
                isValid = false;
            }

        if (isValid){
            System.out.println("Password is valid");
        }

    }
}
