package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.stat;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move.Move;

public class MoveStatAffect {

	private Integer change;
	private NamedApiResource<Move> move;
	
	public Integer getChange() {
		return change;
	}
	public void setChange(Integer change) {
		this.change = change;
	}
	public NamedApiResource<Move> getMove() {
		return move;
	}
	public void setMove(NamedApiResource<Move> move) {
		this.move = move;
	}
	
}
