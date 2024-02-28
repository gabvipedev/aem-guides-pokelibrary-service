package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryflavor;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berry.Berry;

public class FlavorBerryMap {

	private Integer potency;
	private NamedApiResource<Berry> berry;
	
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedApiResource<Berry> getBerry() {
		return berry;
	}
	public void setBerry(NamedApiResource<Berry> berry) {
		this.berry = berry;
	}
	
}
