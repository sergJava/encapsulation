package org.skypro.skyshop.search;

public interface Searchable {
    String getSearchTerm ();
    String getTypeObject();

    default String getStringRepresentation() {
        return this.getClass().getSimpleName() + " - " + getTypeObject();
    }

}
