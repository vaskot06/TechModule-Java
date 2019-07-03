import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> productsAndQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> productAndPrice = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("buy")){
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!productsAndQuantity.containsKey(name)){
                productsAndQuantity.put(name, quantity);
            }else {
                productsAndQuantity.put(name, productsAndQuantity.get(name) + quantity);
            }
            productAndPrice.put(name, price);

            line = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsAndQuantity.entrySet()){
            String productName = entry.getKey();
            int quant = entry.getValue();
            for (Map.Entry<String, Double> price : productAndPrice.entrySet()){
                String name = price.getKey();
                double productPrice  = price.getValue();
                if (productName.equals(name)){
                    System.out.printf("%s -> %.2f%n", name, (quant * productPrice));
                }
            }
        }
    }
}
