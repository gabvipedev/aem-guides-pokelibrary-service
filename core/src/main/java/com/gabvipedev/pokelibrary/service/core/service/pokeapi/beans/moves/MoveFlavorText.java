package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

public class MoveFlavorText {
    private String flavorText;
    private NamedAPIResource language;
    private NamedAPIResource versionGroup;

    // Constructor
    public MoveFlavorText(String flavorText, NamedAPIResource language, NamedAPIResource versionGroup) {
        this.flavorText = flavorText;
        this.language = language;
        this.versionGroup = versionGroup;
    }

    // Getters and Setters
    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource language) {
        this.language = language;
    }

    public NamedAPIResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedAPIResource versionGroup) {
        this.versionGroup = versionGroup;
    }
}