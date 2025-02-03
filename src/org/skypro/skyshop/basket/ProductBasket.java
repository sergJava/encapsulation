package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProductBasket {
    private List<Product> basket = new ArrayList<>();

    public void addProduct(Product product) {
        basket.add(product);
    }

//    public void addProduct(Product product) {
//        for (int i = 0; i < basket.length; i++) {
//            if (basket[i] == null) {
//                basket[i] = product;
//                return;
//            }
//        }
//        System.out.println("невозможно добавить продукт");
//    }

    public int getPriceOfBasket() {
        int priceOfBasket = 0;
        for (Product product : basket) {
            if (product != null) {
                priceOfBasket += product.getPrice();
            }
        }
        return priceOfBasket;
    }

    public int getCountOfSpecialProduct () {
        int countOfSpecialProduct = 0;
        for (Product product : basket) {
            if (product != null && product.isSpecial()) {
                countOfSpecialProduct++;
            }
        }
        return countOfSpecialProduct;
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

//    public void cleaningBasket() {
//        Arrays.fill(basket, null);
//    }


}
