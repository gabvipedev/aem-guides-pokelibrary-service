package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;

import java.util.List;

public class ContestComboDetail {

	private List<NamedApiResource<Move>> userBefore;
	private List<NamedApiResource<Move>> userAfter;
	
	public List<NamedApiResource<Move>> getUserBefore() {
		return userBefore;
	}
	public void setUserBefore(List<NamedApiResource<Move>> userBefore) {
		this.userBefore = userBefore;
	}
	public List<NamedApiResource<Move>> getUserAfter() {
		return userAfter;
	}
	public void setUserAfter(List<NamedApiResource<Move>> userAfter) {
		this.userAfter = userAfter;
	}
	
}
