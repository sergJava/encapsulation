package org.skypro.skyshop.product;


import org.skypro.skyshop.search.Searchable;

import java.util.Objects;

public abstract class Product implements Searchable {
    private String name;
    static int id = 0;

    @Override
    public String getSearchTerm() {
        return this.name;
    }

    @Override
    public String getTypeObject() {
        return "PRODUCT";
    }

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("неправильное название продукта");
        }
        this.name = name;
        this.id++;
    }

    public String getName() {
        return this.name;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    public int hashCode(){
        return Objects.hashCode(name);
    }
}
