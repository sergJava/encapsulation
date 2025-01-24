package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        SimpleProduct apple = new SimpleProduct("apple", 150);
        DiscountedProduct banana = new DiscountedProduct("banana", 200, 10);
        FixPriceProduct pineapple = new FixPriceProduct("pineapple");
        FixPriceProduct tomato = new FixPriceProduct("tomato");
        DiscountedProduct potato = new DiscountedProduct("potato", 50, 20);

        Article appleArticle = new Article("apple", "green apple");
        Article tomatoJuiceArticle = new Article("tomato juice", "tomato with apple juice 50%");
        Article smallBananaArticle = new Article("small ban", "by New Zeland");
        Article appleJuiceArticle = new Article("app juice", "app juice 100%");
        Article appleJuiceArticle2 = new Article("app juice2", "app juice 100%");
        Article appleJuiceArticle3 = new Article("app juice3", "app juice 100%");

        ProductBasket productBasket = new ProductBasket();

        SearchEngine searchEngine = new SearchEngine(15);
        searchEngine.add(apple);
        searchEngine.add(banana);
        searchEngine.add(pineapple);
        searchEngine.add(tomato);
        searchEngine.add(potato);
        searchEngine.add(appleArticle);
        searchEngine.add(tomatoJuiceArticle);
        searchEngine.add(smallBananaArticle);
        searchEngine.add(appleJuiceArticle);
        searchEngine.add(appleJuiceArticle2);
        searchEngine.add(appleJuiceArticle3);

        System.out.println(Arrays.toString(searchEngine.search("apple")));

        for (Searchable searchable : searchEngine.searchables) {
            System.out.println(searchable.getStringRepresentation());
        }

    }
}


