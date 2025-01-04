package org.skypro.skyshop.product;


public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName (){
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return "<" + this.name + ">: <" + this.price + ">";
    }
}
