package main;


import java.util.*;

import Battle.BattleBase;
import Input.ActionSelector;
import Input.PokemonSelector;
import Pokemon.Pokemon;



public class Main {

	public static void main(String[] args) {

		
		PokemonSelector pokemon = new PokemonSelector();
		ActionSelector ability = new ActionSelector();
		
		Pokemon[] myPoke = pokemon.selectPokemon(true);
		Pokemon[] enemyPoke = pokemon.selectPokemon(false);
		
		System.out.println("あなたの選んだポケモンは" + myPoke[0].getName() + ", "+myPoke[1].getName() +", " + myPoke[2].getName() + "です");
		System.out.println("あいては" + enemyPoke[0].getName() + "くりだした");
		
		System.out.println("ポケモンバトルをはじめます");
		System.out.println();
		
		new BattleBase(myPoke,enemyPoke,ability, pokemon);
		}
		
		
	}