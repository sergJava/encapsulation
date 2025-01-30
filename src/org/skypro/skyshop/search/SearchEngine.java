package org.skypro.skyshop.search;

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
            if (numberOfResult >= 5) break;
        }
        return results;
    }

    public void add(Searchable searchable) {
        if (numberInSearchable >= searchables.length) {
            System.out.println("нет места в массиве поиска");
            return;
        }
        searchables[numberInSearchable] = searchable;
        numberInSearchable++;
    }

    public Searchable lineSearch(String search) throws BestResultNotFound {
        Searchable bestResult = null;
        //       int indexOfBestResult = -1;
        int countOfBestResult = 0;
        for (int i = 0; i < searchables.length; i++) {
            int temp = 0;
            if (searchables[i] != null) {
                temp = searchSubstring(searchables[i].getSearchTerm(), search);
            }
            if (temp > countOfBestResult) {
                countOfBestResult = temp;
                //               indexOfBestResult = i;
                bestResult = searchables[i];
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
