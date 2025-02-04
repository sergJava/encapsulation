package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ProductBasket {
    private List<Product> basket = new ArrayList<>();

    public void addProduct(Product product) {
        basket.add(product);
    }

    public List<Product> deleteProduct(String name) {
        List<Product> removedProducts = new ArrayList<>();
        Iterator<Product> iterator = basket.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                removedProducts.add(product);
                iterator.remove();
            }
        }
        if (removedProducts.isEmpty()) {
            System.out.println("Список пуст");
        }
        return removedProducts;
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

    public int getCountOfSpecialProduct() {
        int countOfSpecialProduct = 0;
        for (Product product : basket) {
            if (product != null && product.isSpecial()) {
                countOfSpecialProduct++;
            }
        }
        return countOfSpecialProduct;
    }

    public void printBasket() {
        if (basket.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        for (Product product : basket) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: <" + getPriceOfBasket() + ">");
        System.out.println("Специальных товаров: " + this.getCountOfSpecialProduct());

    }

    public boolean checkProduct(Product product) {
        boolean isThereProduct = false;
        for (Product productTemp : basket) {
            if (productTemp != null && productTemp.getName().equals(product.getName())) {
                isThereProduct = true;
            }
        }
        return isThereProduct;
    }

    public void cleaningBasket() {
        basket.clear();
    }


}
