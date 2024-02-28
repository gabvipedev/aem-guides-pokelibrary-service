package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.ability;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Effect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;

import java.util.List;

public class AbilityEffectChange {

	private List<Effect> effectEntries;
	private NamedApiResource<VersionGroup> versionGroup;
	
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	
}
