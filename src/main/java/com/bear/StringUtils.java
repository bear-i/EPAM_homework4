package com.bear;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class StringUtils {

    public static Set<String> getSortedSetOfWords(File file, char sortByOccurenceOf) {
        Set<String> parsedFile = new TreeSet<>(MyComparator.getComparator(sortByOccurenceOf));
        String delimeters = "\\d|\\s|,|!|\\?|/|\\.|;|\\)|\\(|%|\"";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String parsedLine[] = line.split(delimeters);
                for (String word : parsedLine) {
                    parsedFile.add(word.toLowerCase());
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parsedFile;
    }

    public static long countSymbols(String word, char symbol) {
        return word.chars().filter(ch -> ch == symbol).count();
    }
}
