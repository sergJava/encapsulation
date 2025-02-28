package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.BestResultNotFound;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        SimpleProduct apple = new SimpleProduct("apple", 150);
        SimpleProduct apple2 = new SimpleProduct("apple", 200);
        DiscountedProduct banana = new DiscountedProduct("banana", 200, 10);
        FixPriceProduct pineapple = new FixPriceProduct("pineapple");
        FixPriceProduct pineapple2 = new FixPriceProduct("bineapple");
        FixPriceProduct tomato = new FixPriceProduct("tomato");
        DiscountedProduct potato = new DiscountedProduct("potato", 50, 20);
        DiscountedProduct appleDiscount = new DiscountedProduct("apple", 100, 20);
        DiscountedProduct appleDiscount2 = new DiscountedProduct("appleDiscount", 150, 10);

        ProductBasket productBasket = new ProductBasket();

        productBasket.addProduct(apple);
        productBasket.addProduct(apple2);

        productBasket.addProduct(banana);
        productBasket.addProduct(pineapple);
        productBasket.addProduct(tomato);
        productBasket.addProduct(potato);
        productBasket.addProduct(potato);
        productBasket.addProduct(appleDiscount);
        productBasket.addProduct(appleDiscount2);

        productBasket.printBasket();
        System.out.println(productBasket.getPriceOfBasket());
        System.out.println(productBasket.getCountOfSpecialProduct());

        System.out.println("удаленние продукта apple: " + productBasket.deleteProduct("apple"));
        System.out.println("Список продуктов после удаления: ");
        productBasket.printBasket();

        System.out.println("удаленние продукта potato: " + productBasket.deleteProduct("potato"));
        System.out.println("Список продуктов после удаления: ");
        productBasket.printBasket();

        productBasket.cleaningBasket();
        productBasket.printBasket();


        Article appleArticle = new Article("apple", "green apple");
        Article tomatoJuiceArticle = new Article("tomato juice", "tomato with apple juice 50%");
        Article smallBananaArticle = new Article("small ban", "by New Zeland");
        Article appleJuiceArticle = new Article("apple juice", "apple juice 100%");
        Article appleJuiceArticle2 = new Article("apple juice", "app juice 100% app");
        Article appleJuiceArticle3 = new Article("apple juice", "app juice 100%");

        SearchEngine searchEngine = new SearchEngine();

        searchEngine.add(apple);
        searchEngine.add(apple2);
        searchEngine.add(banana);
        searchEngine.add(pineapple);
        searchEngine.add(tomato);
        searchEngine.add(potato);
        searchEngine.add(appleDiscount);
        searchEngine.add(appleDiscount2);


        searchEngine.add(appleArticle);
        searchEngine.add(tomatoJuiceArticle);
        searchEngine.add(smallBananaArticle);
        searchEngine.add(appleJuiceArticle);
        searchEngine.add(appleJuiceArticle2);
        searchEngine.add(appleJuiceArticle3);
        searchEngine.add(pineapple2);

//        searchEngine.printSearchables();

        System.out.println(searchEngine.search("apple"));



    }
}


