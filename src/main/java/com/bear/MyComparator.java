package com.bear;

import java.util.Comparator;

import static com.bear.StringUtils.countSymbols;

public class MyComparator {

    public static Comparator<String> getComparator(char sortByOccurenceOf) {
        Comparator<String> bySymbolOccurence = Comparator.comparingLong(o -> countSymbols(o, sortByOccurenceOf));

        return bySymbolOccurence.thenComparing(String::compareTo);
    }
}
