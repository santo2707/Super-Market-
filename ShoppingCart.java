package com.supermarket;
import java.util.*;

class ShoppingCart {
    private List<Product> cart = new ArrayList<>();
    private double total;

    public void addToCart(Product product, int quantity) {
        if (product.getQuantity() < quantity) {
            System.out.println("Insufficient stock for product: " + product.getName());
        } else {
            product.setQuantity(product.getQuantity() - quantity);
            cart.add(new Product(product.getId(), product.getName(), product.getPrice(), quantity));
            total += product.getPrice() * quantity;
            System.out.println("Added " + quantity + " x " + product.getName() + " to cart.");
        }
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");  
        } else {
            System.out.println("Cart Items:");
            for (Product product : cart) {
                System.out.println(product);
            }
            System.out.println("Total: ₹" + total);
        }
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add some products first.");
        } else {
            System.out.println("Thank you for your purchase. Total amount: ₹" + total);
            cart.clear();
            total = 0;
        }
    }
}
