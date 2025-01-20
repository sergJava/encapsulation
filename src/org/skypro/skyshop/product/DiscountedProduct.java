package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basicPrice;
    private int discountInPercent;

    public DiscountedProduct(String name, int basicPrice, int discountInPercent) {
        super(name);
        this.basicPrice = basicPrice;
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
}
