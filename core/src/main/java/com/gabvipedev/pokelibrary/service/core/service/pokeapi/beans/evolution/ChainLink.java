package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.evolution;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

import java.util.List;

public class ChainLink {
    private boolean is_baby;
    private NamedAPIResource species;
    private List<EvolutionDetail> evolution_details;
    private List<ChainLink> evolves_to;

    // Getters y setters


    public boolean isIs_baby() {
        return is_baby;
    }

    public void setIs_baby(boolean is_baby) {
        this.is_baby = is_baby;
    }

    public NamedAPIResource getSpecies() {
        return species;
    }

    public void setSpecies(NamedAPIResource species) {
        this.species = species;
    }

    public List<EvolutionDetail> getEvolution_details() {
        return evolution_details;
    }

    public void setEvolution_details(List<EvolutionDetail> evolution_details) {
        this.evolution_details = evolution_details;
    }

    public List<ChainLink> getEvolves_to() {
        return evolves_to;
    }

    public void setEvolves_to(List<ChainLink> evolves_to) {
        this.evolves_to = evolves_to;
    }
}
