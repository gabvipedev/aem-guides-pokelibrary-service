package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

import java.util.List;

public class ContestComboDetail {
    private List<NamedAPIResource> use_before;
    private List<NamedAPIResource> use_after;

    public List<NamedAPIResource> getUse_before() {
        return use_before;
    }

    public void setUse_before(List<NamedAPIResource> use_before) {
        this.use_before = use_before;
    }

    public List<NamedAPIResource> getUse_after() {
        return use_after;
    }

    public void setUse_after(List<NamedAPIResource> use_after) {
        this.use_after = use_after;
    }
}