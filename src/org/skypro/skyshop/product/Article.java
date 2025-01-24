package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private String name;
    private String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return this.name + "\n"
                + this.text;
    }

    @Override
    public String getSearchTerm() {
        return this.toString();
    }

    @Override
    public String getTypeObject() {
        return "ARTICLE";
    }
}
