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
		
		System.out.println("���Ȃ��̑I�񂾃|�P������" + myPoke[0].getName() + ", "+myPoke[1].getName() +", " + myPoke[2].getName() + "�ł�");
		System.out.println("�����Ă�" + enemyPoke[0].getName() + "���肾����");
		
		System.out.println("�|�P�����o�g�����͂��߂܂�");
		System.out.println();
		
		new BattleBase(myPoke,enemyPoke,ability, pokemon);
		}
		
		
	}