package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common;

public class Name {
    private String name;
    private NamedAPIResource language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource language) {
        this.language = language;
    }
}
