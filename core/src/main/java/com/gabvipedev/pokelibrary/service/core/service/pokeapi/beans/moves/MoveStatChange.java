package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

public class MoveStatChange {
    private int change;
    private NamedAPIResource stat;

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public NamedAPIResource getStat() {
        return stat;
    }

    public void setStat(NamedAPIResource stat) {
        this.stat = stat;
    }
}
