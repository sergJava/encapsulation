package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product {

    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        if (price <= 0) {
            throw new IllegalArgumentException("цена не может быть меньше 1");
        }
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return "<" + this.getName() + "> : <" + this.price + ">";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SimpleProduct that)) return false;
//        return Objects.equals(this.getName(), that.getName()) && price == that.price;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.getName(), price);
//    }
}
