package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common;

public class Effect {
    private String effect;
    private NamedAPIResource language;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource language) {
        this.language = language;
    }
}
