package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;

import java.util.List;

public class HeldItem {
    private Item item;
    private List<VersionDetail> versionDetails;

    // getters and setters


    public Item getItem() {
        return item;
    }

    public List<VersionDetail> getVersionDetails() {
        return versionDetails;
    }

    public static class Item {
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

    public static class VersionDetail {
        private int rarity;
        private GameIndex.Version version;

        // getters and setters

        public int getRarity() {
            return rarity;
        }

        public GameIndex.Version getVersion() {
            return version;
        }
    }
}

