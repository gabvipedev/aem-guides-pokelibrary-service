package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

public class PokemonSpeciesVariety {
    private boolean is_default;
    private NamedAPIResource pokemon;

    // Getters y setters

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public NamedAPIResource getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedAPIResource pokemon) {
        this.pokemon = pokemon;
    }
}
