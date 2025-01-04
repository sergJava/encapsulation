package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;


public class ProductBasket {
    int[] arr = new int[5];
    Product[] basket = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                return;
            }
        }
        System.out.println("невозможно добавить продукт");
    }

    public int getPriceOfBasket() {
        int priceOfBasket = 0;
        for (Product product : basket) {
            if (product != null) {
                priceOfBasket += product.getPrice();
            }
        }
        return priceOfBasket;
    }

    public boolean isEmptyBasket() {
        for (Product product : basket) {
            if (product != null) {
                return false;
            }
        }
        return true;
    }

    public void printBasket() {
        if (isEmptyBasket()) {
            System.out.println("в корзине пусто");
            return;
        }
        for (Product product : basket) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: <" + getPriceOfBasket() + ">");
    }
}
