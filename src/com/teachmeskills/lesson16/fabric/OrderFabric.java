package com.teachmeskills.lesson16.fabric;

/**
 * This class contain fabric for creating Orders for clients (in other
 * words - simulate database work).
 */


import com.teachmeskills.lesson16.product.Product;
import java.util.ArrayList;
import java.util.List;

public class OrderFabric {
    public static List<Product> genFirstOrder(){
        Product pr1 = new Product(1, "Phone", 500.10);
        Product pr2 = new Product(2, "Table", 230.15);
        Product pr3 = new Product(3, "Toothpick", 0.10);
        List<Product> firstOrder= new ArrayList<>();
        firstOrder.add(pr1);
        firstOrder.add(pr2);
        firstOrder.add(pr3);
        return firstOrder;
    }
    public static List<Product> genSecondOrder(){
        Product pr4 = new Product(4, "Guitar", 34.40);
        Product pr5 = new Product(5, "Laptop", 2000.0);
        List<Product> secondOrder= new ArrayList<>();
        secondOrder.add(pr4);
        secondOrder.add(pr5);
        return secondOrder;
    }
    public static List<Product> genThirdOrder(){
        Product pr6 = new Product(6, "Book", 20.10);
        Product pr7 = new Product(7, "Knife", 40.10);
        List<Product> thirdOrder= new ArrayList<>();
        thirdOrder.add(pr6);
        thirdOrder.add(pr7);
        return thirdOrder;
    }
}
