package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.version.Version;

import java.util.List;

public class VersionEncounterDetail {

	private NamedApiResource<Version> version;
	private Integer maxChance;
	private List<Encounter> encounterDetails;
	
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	public Integer getMaxChance() {
		return maxChance;
	}
	public void setMaxChance(Integer maxChance) {
		this.maxChance = maxChance;
	}
	public List<Encounter> getEncounterDetails() {
		return encounterDetails;
	}
	public void setEncounterDetails(List<Encounter> encounterDetails) {
		this.encounterDetails = encounterDetails;
	}
	
}
