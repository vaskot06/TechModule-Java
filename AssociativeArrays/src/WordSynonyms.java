import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List <String>> dictionary = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!dictionary.containsKey(word)){
                dictionary.put(word, new ArrayList<>());
            }
            dictionary.get(word).add(synonym);

        }
        for(Map.Entry<String, List <String>> word : dictionary.entrySet()){
            String words = word.getKey();
            List<String> synonyms = word.getValue();

            System.out.print(words + " - ");
            for(int i = 0; i < synonyms.size(); i++){
                if(i == synonyms.size() - 1){
                    System.out.print(synonyms.get(i));
                    break;
                }
                System.out.print(synonyms.get(i) + ", ");
            }
            System.out.println();
        }
    }
}
