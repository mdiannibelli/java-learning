import java.util.Scanner;
public class Supermercado {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] products = {
            "Mayonesa H",
            "Mostaza N",
            "Chimichurri H",
            "Refresco P",
            "Refresco CC",
            "Refresco F",
            "Dulce de leche S",
            "Dulce de leche LS",
            "Galletas O",
            "Galletas F"
        };

        double[] prices = {
            1599.00,
            1480.00,
            3500.00,
            2200.00,
            2500.00,
            2000.00,
            2199.00,
            2850.00,
            1249.00,
            1100.00
        };

        int[] discounts = {15,15,0,0,10,0,20,22,10,0};

        // Product that has a 10% discount
        System.out.println("Products that have a 10% discount:");
        for(int i = 0; i < discounts.length; i++) {
            int discount = discounts[i];
            if(discount == 10) {
                System.out.println(products[i] + " with price " + prices[i]);
            }
        }

        // Product that has a price greater or equal to 2000
        System.out.println("Products that have a price greater or equal to 2000:");
        for(int i = 0; i < products.length; i++) {
            double price = prices[i];
            if(price >= 2000) {
                System.out.println(i + ": " + products[i]);
            }
        }
        
        // Show refreshments with their prices
        System.out.println("All refreshments with their prices:");
        for(int i = 0; i < products.length; i++) {
            String product = products[i];
            if(product.contains("Refresco")) {
                System.out.println(products[i] + " " + prices[i]);
            }
        }

        // Calculate total of all products
        double total = 0;
        for(int i = 0; i < prices.length; i++) {
            double subtotal = prices[i] - (prices[i]* (double)discounts[i]/100);
            if(prices[i] > 0) {
                total += subtotal;
            }
        }
        System.out.println("The total amount of all products is: " + total);

        // Search a product by prompt
        String productToFind;
        System.out.println("Search product:");
        productToFind = scn.nextLine();
        for(int i = 0; i < products.length; i++) {
            if(products[i].toLowerCase().contains(productToFind.toLowerCase())) {
                System.out.println(products[i] + " " + prices[i]);
            }
        }
    }
}