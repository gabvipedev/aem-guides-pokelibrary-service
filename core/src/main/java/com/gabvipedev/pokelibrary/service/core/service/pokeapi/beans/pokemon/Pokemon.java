package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;

import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private int baseExperience;
    private int height;
    private boolean isDefault;
    private int order;
    private int weight;
    private List<Ability> abilities;
    private List<PokemonForm> forms;
    private List<GameIndex> gameIndices;
    private List<HeldItem> heldItems;
    private String locationAreaEncounters;
    private List<Move> moves;
    private Species species;
    private Sprites sprites;

    private List<Stat> stats;
    private List<Type> types;
    private List<Type.PastType> pastTypes;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public int getOrder() {
        return order;
    }

    public int getWeight() {
        return weight;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public List<PokemonForm> getForms() {
        return forms;
    }

    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public List<HeldItem> getHeldItems() {
        return heldItems;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public Species getSpecies() {
        return species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    // getters and setters








}

