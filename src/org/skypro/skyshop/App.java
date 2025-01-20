package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {

    public static void main(String[] args) {
        SimpleProduct apple = new SimpleProduct("apple", 150);
        DiscountedProduct banana = new DiscountedProduct("banana", 200, 10);
        FixPriceProduct pineapple = new FixPriceProduct("pineapple");
        FixPriceProduct tomato = new FixPriceProduct("tomato");
        DiscountedProduct potato = new DiscountedProduct("potato", 50, 20);

        ProductBasket productBasket = new ProductBasket();

        //1. Добавление продукта в корзину
        productBasket.addProduct(apple);
        productBasket.addProduct(banana);
        productBasket.addProduct(pineapple);
        productBasket.addProduct(tomato);
        productBasket.addProduct(potato);

        //2. Печать содержимого корзины с несколькими товарами
        productBasket.printBasket();

        //3. Получение стоимости корзины с несколькими товарами
        System.out.println("стоимость корзины " + productBasket.getPriceOfBasket());


    }
}


