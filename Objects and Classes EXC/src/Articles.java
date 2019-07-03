import java.util.Scanner;

public class Articles {


   public static class Article{

        String title;
        String content;
        String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String content){
            this.content = content;
        }

        public void rename(String title) {
            this.title = title;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

       @Override
       public String toString() {
           return title + " - " + content + ": " + author;
       }
   }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String [] inputArr = input.split(", ");

        Article article = new Article(inputArr[0], inputArr[1], inputArr[2]);

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(": ");
            String commands = tokens[0];

            if (commands.equals("Edit")){
                article.edit(tokens[1]);
            }else if (commands.equals("ChangeAuthor")){
                article.changeAuthor(tokens[1]);
            }else {
                article.rename(tokens[1]);
            }
        }

        System.out.println(article.toString());

    }
}
