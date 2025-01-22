package org.skypro.skyshop.product;

public interface Searchable {
    String getSearchTerm ();
    String getTypeObject();
    String getNameObject();

    default String getStringRepresentation() {
        return getNameObject() + " - " + getTypeObject();
    }

}
