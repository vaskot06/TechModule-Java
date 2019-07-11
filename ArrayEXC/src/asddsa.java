import java.util.Scanner;

public class asddsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howMuchDNAs = Integer.parseInt(scanner.nextLine());
        String dnaSequence = scanner.nextLine();
        int bestIndex = 0;
        int bestSum = 0;
        int counter = 0;
        int bestCounter = 0;
        String bestSequence = "";
        int bestLength = 0;

        while (!dnaSequence.equals("Clone them!")) {

            counter++;
            String sequence = dnaSequence.replaceAll("!", "");
            String[] dnas = sequence.split("0");

            int maxLenght = 0;
            int sum = 0;
            String bestLocalDna = "";

            for (int i = 0; i < dnas.length; i++) {
                if (maxLenght < dnas[i].length()){
                    maxLenght = dnas[i].length();
                    bestLocalDna = dnas[i];
                }
                sum += dnas[i].length();
            }


            int beginIndex = sequence.indexOf(bestLocalDna);

            if (maxLenght > bestLength){
                bestLength = maxLenght;
                bestSum = sum;
                bestIndex = beginIndex;
                bestCounter = counter;
                bestSequence = sequence;
            }else if (maxLenght == bestLength && bestIndex > beginIndex || sum > bestSum){
                bestLength = maxLenght;
                bestSum = sum;
                bestIndex = beginIndex;
                bestCounter = counter;
                bestSequence = sequence;
            }else if (counter == 1){
                bestLength = maxLenght;
                bestSum = sum;
                bestIndex = beginIndex;
                bestCounter = counter;
                bestSequence = sequence;
            }


            dnaSequence = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.", bestCounter, bestSum);

        System.out.println();
        for (int i = 0; i <bestSequence.length() ; i++) {
            System.out.print(bestSequence.charAt(i) + " ");
        }

    }
}
