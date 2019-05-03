package com.bear;

import java.io.File;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/text.txt");

        char symbol = getSymbol();

        Set<String> parsedFile = StringUtils.getSortedSetOfWords(file, symbol);
        for (String word : parsedFile) {
            System.out.println(word);
        }
    }

    private static char getSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the symbol: ");
        return scanner.nextLine()
                .toLowerCase()
                .charAt(0); //ASK
    }
}
