package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berry;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryflavor.BerryFlavor;

public class BerryFlavorMap {

	private Integer potency;
	private NamedApiResource<BerryFlavor> flavor;
	
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedApiResource<BerryFlavor> getFlavor() {
		return flavor;
	}
	public void setFlavor(NamedApiResource<BerryFlavor> flavor) {
		this.flavor = flavor;
	}
	
}
