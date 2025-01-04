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

        //1. Добавление продукта в корзину
        productBasket.addProduct(apple);
        productBasket.addProduct(banana);
        productBasket.addProduct(pineapple);
        productBasket.addProduct(tomato);
        productBasket.addProduct(tomato);

        //2. Добавление продукта в заполненную корзину, в которой нет свободного места
        productBasket.addProduct(potato);
        productBasket.addProduct(potato);

        //3. Печать содержимого корзины с несколькими товарами
        productBasket.printBasket();

        //4. Получение стоимости корзины с несколькими товарами
        System.out.println("стоимость корзины " + productBasket.getPriceOfBasket());

        //5. Поиск товара, который есть в корзине
        System.out.println("имеется ли в корзине " + potato.getName() + "? " + productBasket.checkProduct(potato));

        //6. Поиск товара, которого нет в корзине
        System.out.println("имеется ли в корзине " + tomato.getName() + "? " + productBasket.checkProduct(tomato));

        //7. Очистка корзины
        productBasket.cleaningBasket();

        //8. Печать содержимого пустой корзины
        productBasket.printBasket();

        //9. Получение стоимости пустой корзины
        System.out.println("стоимость корзины " + productBasket.getPriceOfBasket());

        //10. Поиск товара по имени в пустой корзине
        System.out.println("имеется ли в корзине " + tomato.getName() + "? " + productBasket.checkProduct(tomato));

    }
}


