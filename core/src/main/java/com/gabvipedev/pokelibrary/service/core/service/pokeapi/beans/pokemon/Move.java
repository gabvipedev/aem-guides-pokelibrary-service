package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

import java.util.List;

public class Move {
    private NamedAPIResource move;
    private List<VersionGroupDetail> versionGroupDetails;

    // getters and setters


    public NamedAPIResource getMove() {
        return move;
    }

    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public static class MoveDetails {
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

    public static class VersionGroupDetail {
        private int levelLearnedAt;
        private VersionGroup versionGroup;
        private MoveLearnMethod moveLearnMethod;

        // getters and setters

        public int getLevelLearnedAt() {
            return levelLearnedAt;
        }

        public VersionGroup getVersionGroup() {
            return versionGroup;
        }

        public MoveLearnMethod getMoveLearnMethod() {
            return moveLearnMethod;
        }
    }

    public static class VersionGroup {
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

    public static class MoveLearnMethod {
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


