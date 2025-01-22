package org.skypro.skyshop.product;


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

    @Override
    public String getNameObject() {
        return getName();
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
