package com.supermarket;
import java.util.*;

class SuperMarket {
    private Map<Integer, Product> m1 = new HashMap<>();

    public void addProduct(Product product) {
        m1.put(product.getId(), product);
    }

    public void displayProducts() {
        if (m1.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : m1.values()) {
                System.out.println(product);
            }
        }
    }

    public Product searchProductByName(String name) {
        for (Product product : m1.values()) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductById(int id) {
        return m1.get(id);
    }
}
