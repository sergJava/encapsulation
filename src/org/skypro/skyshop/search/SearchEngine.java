package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {

    private Set<Searchable> searchables;

    public SearchEngine() {
        searchables = new HashSet<>();
    }

    public Set<Searchable> search(String requestString) {
        System.out.println("search = " + requestString);
        TreeSet<Searchable> results = searchables.stream()
                .filter(Objects::nonNull)
                .filter(searchable -> searchable.getSearchTerm().contains(requestString))
                .collect(Collectors.toCollection(()-> new TreeSet<>(new SearchableComparator())));

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

    public void printStringRepresentation(){
        for (Searchable searchable : searchables) {
            System.out.println(searchable.getStringRepresentation());
        }
    }

    public void printSearchables() {
        System.out.println("SearchEngine.printSearchables");
        for (Searchable searchable : searchables) {
            System.out.println(searchable);
        }
    }

    public static class SearchableComparator implements Comparator<Searchable> {
        @Override
        public int compare(Searchable s1, Searchable s2) {
            int i = 0;
            i = Integer.compare(s1.getName().length(), s2.getName().length());
            if (i == 0) {
                i = s1.getName().compareTo(s2.getName());
            }
            return i;
        }
    }
}
