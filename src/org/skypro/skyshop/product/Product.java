package org.skypro.skyshop.product;


public abstract class Product {
    private String name;
    // private int price;

    public Product(String name) {
        this.name = name;
        //this.price = price;
    }

    public String getName (){
        return this.name;
    }
    public abstract int getPrice();

    public abstract boolean isSpecial();
}
