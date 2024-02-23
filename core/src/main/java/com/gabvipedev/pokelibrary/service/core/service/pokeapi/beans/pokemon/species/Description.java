package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

public class Description {
    private String description;
    private NamedAPIResource language;

    // Getters y setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource language) {
        this.language = language;
    }
}
