package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.*;

import java.util.List;

public class MoveDetail {
    private int id;
    private String name;
    private int accuracy;
    private int effect_chance;
    private int pp;
    private int priority;
    private int power;
    private ContestComboSets contest_combos;
    private NamedAPIResource contest_type;
    private APIResource contest_effect;
    private NamedAPIResource damage_class;
    private List<VerboseEffect> effect_entries;
    private List<AbilityEffectChange> effect_changes;
    private List<NamedAPIResource> learned_by_pokemon;
    private List<MoveFlavorText> flavor_text_ntries;
    private NamedAPIResource generation;
    private List<MachineVersionDetail> machines;
    private MoveMetaData meta;
    private List<Name> names;
    private List<PastMoveStatValues> past_values;
    private List<MoveStatChange> stat_changes;
    private APIResource super_contest_effect;
    private NamedAPIResource target;
    private NamedAPIResource type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getEffect_chance() {
        return effect_chance;
    }

    public void setEffect_chance(int effect_chance) {
        this.effect_chance = effect_chance;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public ContestComboSets getContest_combos() {
        return contest_combos;
    }

    public void setContest_combos(ContestComboSets contest_combos) {
        this.contest_combos = contest_combos;
    }

    public NamedAPIResource getContest_type() {
        return contest_type;
    }

    public void setContest_type(NamedAPIResource contest_type) {
        this.contest_type = contest_type;
    }

    public APIResource getContest_effect() {
        return contest_effect;
    }

    public void setContest_effect(APIResource contest_effect) {
        this.contest_effect = contest_effect;
    }

    public NamedAPIResource getDamage_class() {
        return damage_class;
    }

    public void setDamage_class(NamedAPIResource damage_class) {
        this.damage_class = damage_class;
    }

    public List<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<AbilityEffectChange> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(List<AbilityEffectChange> effect_changes) {
        this.effect_changes = effect_changes;
    }

    public List<NamedAPIResource> getLearned_by_pokemon() {
        return learned_by_pokemon;
    }

    public void setLearned_by_pokemon(List<NamedAPIResource> learned_by_pokemon) {
        this.learned_by_pokemon = learned_by_pokemon;
    }

    public List<MoveFlavorText> getFlavor_text_ntries() {
        return flavor_text_ntries;
    }

    public void setFlavor_text_ntries(List<MoveFlavorText> flavor_text_ntries) {
        this.flavor_text_ntries = flavor_text_ntries;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource generation) {
        this.generation = generation;
    }

    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        this.machines = machines;
    }

    public MoveMetaData getMeta() {
        return meta;
    }

    public void setMeta(MoveMetaData meta) {
        this.meta = meta;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PastMoveStatValues> getPast_values() {
        return past_values;
    }

    public void setPast_values(List<PastMoveStatValues> past_values) {
        this.past_values = past_values;
    }

    public List<MoveStatChange> getStat_changes() {
        return stat_changes;
    }

    public void setStat_changes(List<MoveStatChange> stat_changes) {
        this.stat_changes = stat_changes;
    }

    public APIResource getSuper_contest_effect() {
        return super_contest_effect;
    }

    public void setSuper_contest_effect(APIResource super_contest_effect) {
        this.super_contest_effect = super_contest_effect;
    }

    public NamedAPIResource getTarget() {
        return target;
    }

    public void setTarget(NamedAPIResource target) {
        this.target = target;
    }

    public NamedAPIResource getType() {
        return type;
    }

    public void setType(NamedAPIResource type) {
        this.type = type;
    }
}
