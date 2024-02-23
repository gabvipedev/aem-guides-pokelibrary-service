package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;

import java.util.List;

public class Type {
    private int slot;
    private TypeInfo type;
    // getters and setters

    public static class TypeInfo {
        private String name;
        private String url;
        // getters and setters
    }

    public static class PastType {
        private GenerationInfo generation;
        private List<Type> types;
        // getters and setters
    }

    public static class GenerationInfo {
        private String name;
        private String url;
        // getters and setters
    }
}

