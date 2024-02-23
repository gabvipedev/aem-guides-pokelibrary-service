package com.gabvipedev.pokelibrary.service.core.utils;

public class StringUtils {
    public static String capitalizeWords(String input) {
        String[] words = input.split("-");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(capitalizedWord).append(" ");
        }

        return result.toString().trim();
    }

    public static int extractIdFromUrl(String url) {
        String[] parts = url.split("/");

        return Integer.parseInt(parts[parts.length - 1]);
    }
}
