package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

public class FlavorText {
    private String flavor_text;
    private NamedAPIResource language;
    private NamedAPIResource version;

    // Getters y setters

    public String getFlavor_text() {
        return flavor_text;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource language) {
        this.language = language;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource version) {
        this.version = version;
    }
}
