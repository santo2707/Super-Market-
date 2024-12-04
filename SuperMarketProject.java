package com.supermarket;

import java.util.*;
public class SuperMarketProject {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SuperMarket supermarket = new SuperMarket();
        ShoppingCart cart = new ShoppingCart();

        supermarket.addProduct(new Product(1, "Apple 500GM",                   168, 100));
        supermarket.addProduct(new Product(2, "Banana 500GM",                  15,  150));
        supermarket.addProduct(new Product(3, "Orange 500Gm",                  94,  200));
        supermarket.addProduct(new Product(4, "Apple Ambri",                   86,  100));
        supermarket.addProduct(new Product(5, "Potato 1 pack",                 44,  150));
        supermarket.addProduct(new Product(6, "Pineapple 1kg",                 88,  200));
        supermarket.addProduct(new Product(7, "watermelon 3kg",                105, 100));
        supermarket.addProduct(new Product(8, "Chilly Powder 200gm",           121, 150));
        supermarket.addProduct(new Product(9, "Coconut Oil 500ml",             131, 200));
        supermarket.addProduct(new Product(10,"Chana Masala",                  68,  100));
        supermarket.addProduct(new Product(11, "Sambar Powder",                64,  150));
        supermarket.addProduct(new Product(12, "Cup Noodles",                  50,  200));
        supermarket.addProduct(new Product(13, "Spicy korean chicken Noodles", 89,  100));
        supermarket.addProduct(new Product(14, "Santoor Sandal Soap",          40,  150));
        supermarket.addProduct(new Product(15, "Lux soap",                     105, 200));
        supermarket.addProduct(new Product(16, "Tooth brush 1pc",              25,  100));
        supermarket.addProduct(new Product(17, "Himalaya Face wash 50Ml",      90,  150));
        supermarket.addProduct(new Product(18, "Mixture 200gm",                125, 200));
        supermarket.addProduct(new Product(19, "pakoda",                       70,  100));
        supermarket.addProduct(new Product(20, "Tomato Twist",                 120, 150));
        supermarket.addProduct(new Product(21, "Dark Fantasy",                 35,  200));
        supermarket.addProduct(new Product(22, "Kurkure Masala Munch",         10,  100));
        supermarket.addProduct(new Product(23, "Lays",                         20,  150));
        supermarket.addProduct(new Product(24, "Choco Cookies",                10,  200));


        boolean running = true;

        while (running) {
            System.out.println("\n1. Display Products\n2. Search Product\n3. Add to Cart\n4. View Cart\n5. Checkout\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    supermarket.displayProducts();
                    break;

                case 2:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    Product product = supermarket.searchProductByName(name);
                    if (product != null) {
                        System.out.println("Product found: " + product);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID to add to cart: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    Product prod = supermarket.getProductById(id);
                    if (prod != null) {
                        cart.addToCart(prod, quantity);
                    } else {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 4:
                    cart.displayCart();
                    break;

                case 5:
                    cart.checkout();
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
