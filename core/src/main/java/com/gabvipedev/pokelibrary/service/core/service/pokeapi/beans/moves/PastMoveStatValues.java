package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.VerboseEffect;

import java.util.List;

public class PastMoveStatValues {
    private int accuracy;
    private int effectChance;
    private int power;
    private int pp;
    private List<VerboseEffect> effectEntries;
    private NamedAPIResource type;
    private NamedAPIResource versionGroup;

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(int effectChance) {
        this.effectChance = effectChance;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public NamedAPIResource getType() {
        return type;
    }

    public void setType(NamedAPIResource type) {
        this.type = type;
    }

    public NamedAPIResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedAPIResource versionGroup) {
        this.versionGroup = versionGroup;
    }
}
