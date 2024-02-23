package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContestComboSets {
    private ContestComboDetail normal;
    @JsonProperty("super")
    private ContestComboDetail superContest;


    // Getters and Setters
    public ContestComboDetail getNormal() {
        return normal;
    }

    public void setNormal(ContestComboDetail normal) {
        this.normal = normal;
    }

    public ContestComboDetail getSuperContest() {
        return superContest;
    }

    public void setSuperContest(ContestComboDetail superContest) {
        this.superContest = superContest;
    }
}
