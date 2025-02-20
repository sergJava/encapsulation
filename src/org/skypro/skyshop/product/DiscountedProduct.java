package org.skypro.skyshop.product;

import java.util.Objects;

public class DiscountedProduct extends Product {

    private int basicPrice;
    private int discountInPercent;

    public DiscountedProduct(String name, int basicPrice, int discountInPercent) {
        super(name);
        if (basicPrice <= 0) {
            throw new IllegalArgumentException("цена не может быть меньше 1");
        }
        this.basicPrice = basicPrice;
        if (discountInPercent < 0 || discountInPercent > 100) {
            throw new IllegalArgumentException("скидка должна быть в пределах 0 - 100");
        }
        this.discountInPercent = discountInPercent;
    }

    @Override
    public int getPrice() {
        return (int) (basicPrice * (1 - (float)discountInPercent / 100));
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "<" + this.getName() + "> : <" + getPrice() + "> (<" +
                this.discountInPercent + ">%)";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof DiscountedProduct that)) return false;
//        return Objects.equals(this.getName(), that.getName()) && basicPrice == that.basicPrice &&
//                discountInPercent == that.discountInPercent;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.getName(), basicPrice, discountInPercent);
//    }
}
