package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move.Move;

import java.util.List;

public class PokemonMove {

	private NamedApiResource<Move> move;
	private List<PokemonMoveVersion> versionGroupDetails;
	
	public NamedApiResource<Move> getMove() {
		return move;
	}
	public void setMove(NamedApiResource<Move> move) {
		this.move = move;
	}
	public List<PokemonMoveVersion> getVersionGroupDetails() {
		return versionGroupDetails;
	}
	public void setVersionGroupDetails(List<PokemonMoveVersion> versionGroupDetails) {
		this.versionGroupDetails = versionGroupDetails;
	}
	
}
