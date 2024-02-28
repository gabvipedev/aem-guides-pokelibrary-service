package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.locationarea;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encountermethod.EncounterMethod;

import java.util.List;

public class EncounterMethodRate {

	private NamedApiResource<EncounterMethod> encounterMethod;
	private List<EncounterVersionDetails> versionDetails;
	
	public NamedApiResource<EncounterMethod> getEncounterMethod() {
		return encounterMethod;
	}
	public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
		this.encounterMethod = encounterMethod;
	}
	public List<EncounterVersionDetails> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
