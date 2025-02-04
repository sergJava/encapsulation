package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {

    private List<Searchable> searchables;

    public SearchEngine() {
        searchables = new ArrayList<>();
    }

    public List<Searchable> search(String requestString) {
        List<Searchable> results = new ArrayList<>();
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(requestString)) {
                results.add(searchable);
            }
        }
        return results;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public Searchable lineSearch(String search) throws BestResultNotFound {
        Searchable bestResult = null;

        int countOfBestResult = 0;
        for (Searchable searchable : searchables) {
            int temp = 0;
            if (searchable != null) {
                temp = searchSubstring(searchable.getSearchTerm(), search);
            }
            if (temp > countOfBestResult) {
                countOfBestResult = temp;
                bestResult = searchable;
            }
        }


        if (bestResult == null) {
            throw new BestResultNotFound("для " + search + " нет совпадений");
        }
        return bestResult;
    }

    public int searchSubstring(String source, String substring) {
        int count = 0;
        int index = 0;
        int indexOfSubstring = source.indexOf(substring, index);
        while (indexOfSubstring != -1) {
            count++;
            index = index + indexOfSubstring + substring.length();
            indexOfSubstring = source.indexOf(substring, index);
        }
        return count;
    }
}
