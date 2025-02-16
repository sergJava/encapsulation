package org.skypro.skyshop.product;

import java.util.Objects;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 100;

    public FixPriceProduct (String name){
        super(name);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("<%s> : фиксированная цена <%d>", this.getName(), FIX_PRICE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct that)) return false;
        return Objects.equals(this.getName(), that.getName()) && FIX_PRICE == that.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), FIX_PRICE);
    }
}
