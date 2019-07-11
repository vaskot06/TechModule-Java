import java.util.Scanner;

public class SmallestOf3Numbers {

    public static void printSmallestof3Numbers(int f, int s, int t) {

        if (f > s && t > s){
            System.out.println(s);
        }else if (f > t && s > t){
            System.out.println(t);
        }else {
            System.out.println(f);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

            printSmallestof3Numbers(first,second,third);
    }
}
