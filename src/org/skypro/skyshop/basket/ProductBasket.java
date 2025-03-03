package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;
import java.util.stream.Collectors;


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
        int sum = basket.values()
                .stream()
                .flatMap(Collection::stream)
                .mapToInt(Product::getPrice)
                .sum();
        return sum;
    }

    public int getCountOfSpecialProduct() {
        return (int) basket.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(Product::isSpecial)
                .count();
    }

    public void printBasket() {
        System.out.println("ProductBasket.printBasket");
        if (basket.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        basket.values()
                .stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("Итого: <" + getPriceOfBasket() + ">");
        System.out.println("Специальных товаров: " + this.getCountOfSpecialProduct());

    }

    public void cleaningBasket() {
        basket.clear();
    }


}
