package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        try {
            SimpleProduct apple = new SimpleProduct(" ", 150);
            System.out.println(apple);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            DiscountedProduct banana = new DiscountedProduct("banana", 0, 10);
            System.out.println(banana);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            FixPriceProduct pineapple = new FixPriceProduct("pineapple");
            System.out.println(pineapple);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            DiscountedProduct potato = new DiscountedProduct("potato", 50, 101);
            System.out.println(potato);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



//        Article appleArticle = new Article("apple", "green apple");
//        Article tomatoJuiceArticle = new Article("tomato juice", "tomato with apple juice 50%");
//        Article smallBananaArticle = new Article("small ban", "by New Zeland");
//        Article appleJuiceArticle = new Article("app juice", "app juice 100%");
//        Article appleJuiceArticle2 = new Article("app juice2", "app juice 100%");
//        Article appleJuiceArticle3 = new Article("app juice3", "app juice 100%");



    }
}


