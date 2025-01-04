package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("apple", 150);
        Product banana = new Product("banana", 200);
        Product pineapple = new Product("pineapple", 250);
        Product tomato = new Product("tomato", 300);
        Product potato = new Product("potato", 50);

        ProductBasket productBasket = new ProductBasket();
        productBasket.addProduct(apple);
        productBasket.addProduct(banana);
        productBasket.addProduct(pineapple);
        productBasket.addProduct(tomato);
//        productBasket.addProduct(potato);
//        productBasket.addProduct(potato);



        productBasket.getPriceOfBasket();
        productBasket.printBasket();

    }
}


