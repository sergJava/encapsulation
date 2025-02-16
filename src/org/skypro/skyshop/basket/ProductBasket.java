package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;


public class ProductBasket {
    private Map<String, List<Product>> basket = new HashMap<>();

    public void addProduct(Product product) {
        basket.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public List<Product> deleteProduct(String name) {
        List<Product> removedProducts = basket.get(name);
        basket.remove(name);
        if (removedProducts == null) {
            System.out.println("Список пуст");
        }
        return removedProducts;
    }

    public int getPriceOfBasket() {
        int priceOfBasket = 0;
        for (List<Product> productList : basket.values()) {
            if (productList != null) {
                for (Product product : productList) {
                    if (product != null) {
                        priceOfBasket += product.getPrice();
                    }
                }
            }
        }
        return priceOfBasket;
    }

    public int getCountOfSpecialProduct() {
        int countOfSpecialProduct = 0;
        for (List<Product> productList : basket.values()) {
            if (productList != null) {
                for (Product product : productList) {
                    if (product != null && product.isSpecial()) {
                        countOfSpecialProduct++;
                    }
                }
            }
        }
        return countOfSpecialProduct;
    }

    public void printBasket() {
        System.out.println("ProductBasket.printBasket");
        if (basket.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        for (List<Product> productList : basket.values()) {
            if (productList != null) {
                for (Product product : productList) {
                    if (product != null) {
                        System.out.println(product);
                    }
                }
            }
        }
        System.out.println("Итого: <" + getPriceOfBasket() + ">");
        System.out.println("Специальных товаров: " + this.getCountOfSpecialProduct());

    }

    public void cleaningBasket() {
        basket.clear();
    }


}
