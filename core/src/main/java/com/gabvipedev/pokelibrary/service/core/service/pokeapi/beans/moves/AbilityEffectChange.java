package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.Effect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;

import java.util.List;

public class AbilityEffectChange {
    private List<Effect> effect_entries;
    private NamedAPIResource version_group;

    public List<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource version_group) {
        this.version_group = version_group;
    }
}
