import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputOne = scanner.nextLine();
        String [] inputOneArr = inputOne.split(" ");

        String inputTwo = scanner.nextLine();
        String [] inputTwoArr = inputTwo.split(" ");

        for (int i = 0; i < inputTwoArr.length; i++) {
            for (int j = 0; j < inputOneArr.length; j++) {
                if (inputTwoArr[i].equals(inputOneArr[j])){
                    System.out.print(inputTwoArr[i] + " ");
                }
            }
        }
    }
}
