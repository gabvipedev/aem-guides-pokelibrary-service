package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;

public  class GameIndex {
    private int gameIndex;
    private Version version;

    // getters and setters


    public int getGameIndex() {
        return gameIndex;
    }

    public Version getVersion() {
        return version;
    }

    public static class Version {
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


