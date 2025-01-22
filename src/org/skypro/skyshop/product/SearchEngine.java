package org.skypro.skyshop.product;

public class SearchEngine {
    public Searchable[] searchables;
    private int numberInSearchable = 0;

    public SearchEngine(int size) {
        searchables = new Searchable[size];
    }

    public Searchable[] search(String requestString) {
        Searchable[] results = new Searchable[5];
        int numberOfResult = 0;
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(requestString)) {
                results[numberOfResult] = searchable;
                numberOfResult++;
            }
            if(numberOfResult >= 5) break;
        }
        return results;
    }

    public void add(Searchable searchable) {
        searchables[numberInSearchable] = searchable;
        numberInSearchable++;
        if(numberInSearchable >= searchables.length) {
            System.out.println("нет места в массиве поиска");
            return;
        }
    }
}
