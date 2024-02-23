package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;

public class Ability {
    private boolean isHidden;
    private int slot;
    private AbilityDetails ability;

    // getters and setters


    public boolean isHidden() {
        return isHidden;
    }

    public int getSlot() {
        return slot;
    }

    public AbilityDetails getAbility() {
        return ability;
    }

    public static class AbilityDetails {
        private String name;
        private String url;

        // getters and setters

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }
    }
}