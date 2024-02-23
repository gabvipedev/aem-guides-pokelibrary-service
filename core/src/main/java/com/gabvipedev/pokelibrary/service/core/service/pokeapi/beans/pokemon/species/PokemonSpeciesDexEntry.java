package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

public class PokemonSpeciesDexEntry {
    private int entry_number;
    private NamedAPIResource pokedex;

    // Getters y setters


    public int getEntry_number() {
        return entry_number;
    }

    public void setEntry_number(int entry_number) {
        this.entry_number = entry_number;
    }

    public NamedAPIResource getPokedex() {
        return pokedex;
    }

    public void setPokedex(NamedAPIResource pokedex) {
        this.pokedex = pokedex;
    }
}
