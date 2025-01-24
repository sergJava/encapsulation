package org.skypro.skyshop.product;


import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private String name;

    @Override
    public String getSearchTerm() {
        return this.name;
    }

    @Override
    public String getTypeObject() {
        return "PRODUCT";
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();
}
