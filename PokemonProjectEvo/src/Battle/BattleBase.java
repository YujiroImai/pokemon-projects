package Battle;

import java.util.*;

import Ability.AbilityBase;
import Input.ActionSelector;
import Input.InputChangePokemon;
import Pokemon.Pokemon;

import TypeRelation.TypeCalculator;
import Input.PokemonSelector;

public class BattleBase implements Battle {

	private Pokemon player ;
	private Pokemon enemy ;
	private ActionSelector _abilitySelector;
	private int myCount = 0;
	private int enemyCount = 0;

	InputChangePokemon myPokemons, enemyPokemons;

	public  BattleBase(Pokemon[] myPoke, Pokemon[] enemyPoke, ActionSelector abilitySelector, PokemonSelector pokeSelect) {
		this.myPokemons = new InputChangePokemon(myPoke);
		this.enemyPokemons = new InputChangePokemon(enemyPoke);
		this.player = myPokemons.getPokemon(1);
		this.enemy = enemyPokemons.getPokemon(1);
		this._abilitySelector = abilitySelector;
		int result = 0;

		while(true) {		
			int ayataka =0;
			int selected = 0;
			
			while(true) {
				selected =  _abilitySelector.selectAbility(player.getAbilities(),true);
				if(selected != 5) {
					break;
				}
				else if(!_judgeUserCanChange(myPokemons.getPokemons())) {
					System.out.println("これ以上交換できません");
					continue;
				}
				else {
					break;
				}
			}
			
			while(true) {
				ayataka =  _abilitySelector.selectAbility(enemy.getAbilities(),false);
				if(ayataka != 5) {
					break;
				}
				else if(!_judgeUserCanChange(enemyPokemons.getPokemons())) {
					continue;
				}
				else {
					break;
				}
			}


			int playerpeed = player.getSpeed();
			int enemypeed = enemy.getSpeed();


			if(selected == 5) {
				playerpeed += 100;
			}
			if(ayataka == 5) {
				enemypeed += 100;
			}

			if(playerpeed >= enemypeed) {

				//自分の攻撃

				result = _act(player, enemy, selected,pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {

					if(result == 2){
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("あいては新たに" + enemy.getName()+ "をくりだした");
						continue;
					}
					else {
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("あなたは新たに" + player.getName()+ "を選びました");
					}
				}
				
				//相手の攻撃
				result = _act(enemy, player, ayataka, pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {
					if(result == 2){
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("あなたは新たに" + player.getName()+ "を選びました");
						continue;
					}
					else {
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("あいては新たに" + enemy.getName()+ "をくりだした");	
					}
				}
			}
			
			else {
				//相手の攻撃
				result = _act(enemy, player, ayataka, pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {
					if(result == 2){
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("あなたは新たに" + player.getName()+ "を選びました");
						continue;
					}
					else {
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("あいては新たに" + enemy.getName()+ "を選びました");	
					}
				}

				//じぶんの攻撃
				result = _act(player, enemy, selected,  pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {

					if(result == 2){
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("あいては新たに" + enemy.getName()+ "を選びました");
						continue;
					}
					else {
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("あなたは新たに" + player.getName()+ "を選びました");
					}
				}
			}
		}
	}
	
	private boolean _attack(Pokemon attacker, Pokemon deffender, AbilityBase ability) {

		if (attacker.equals(player)) {
			System.out.println("あなたの" + attacker.getName() + "の" + ability.getName());
		}
		else if(attacker.equals(enemy)){
			System.out.println("あいての" + attacker.getName() + "の" + ability.getName());
		}

		//おうふくびんた処理
		if(ability.isMulti()) {

			_multiAttack(attacker, deffender, ability);

		}else {
			_singleAttack(attacker, deffender, ability);
		}

		if(deffender.isDead()) {
			if(deffender.equals(enemy)) {
				System.out.println("あいての" + deffender.getName() + "はたおれた");

				return false;
			}
			else if(deffender.equals(player)){
				System.out.println("あなたの" + deffender.getName() + "はたおれた");

				return false;
			}
		}

		System.out.println("のこりHP" + deffender.getHp());
		return true;
	}

	private void _singleAttack(Pokemon attacker,Pokemon deffender, AbilityBase ability) {

		int damage = attacker.getAtk() * ability.getPower();
		if(attacker.getType().equals(ability.getType())) {
			damage *=1.5;
		}
		TypeCalculator relation = new TypeCalculator(ability.getType(), deffender.getType());
		damage *= relation.getResult();

		int critical = (int)(Math.random()*10);
		if(critical == 0) {
			damage *=2.0;
			System.out.println("急所に当たった。");
		}

		damage *= (100-(Math.random()*16))/100;
		deffender.takeDamage(damage);
	}

	private int _multiAttack(Pokemon attacker,Pokemon deffender, AbilityBase ability) {
		//int damage = 0;
		int count = (int)(Math.random()*4)+2;
		for(int i = 1; i <= count; i++) {

			_singleAttack(attacker, deffender, ability);

			//deffender.takeDamage(damage);

			if(deffender.isDead()) {
				System.out.println(i + "回あたった");
				break;
			}

		}
		if(deffender.getHp() > 0) {
			System.out.println(count + "回あたった");
		}

		return deffender.getHp();
	}

	private Pokemon  _selectPokemon(Pokemon poke, PokemonSelector select) {

		if(poke.equals(player)) {
			Pokemon myPoke = myPokemons.changePokemon(player, true);
			return myPoke;
		}
		else if(poke.equals(enemy)){
			Pokemon enemyPoke = enemyPokemons.changePokemon(enemy, false);
			return enemyPoke;
		}
		return null;
	}

	private boolean _judgeUserCanChange(Pokemon[] Pokemons) {

		return (int) Arrays.stream(Pokemons).filter(pokemon -> pokemon.isDead()).count() < 2;
	}

	private int  _act(Pokemon actor , Pokemon notActor, int selected, PokemonSelector pokeSelect) {

		if(selected >= 1&& selected <= 4) {

			AbilityBase ability = actor.getAbility(selected);

			if(!_attack(actor , notActor, ability)) {
				if(actor == enemy) {
					myCount ++;
					if(myCount >= 3) {
						System.out.println("めのまえがまっくらになった");
						return 1;
					}	
				}
				else {
					enemyCount++;
					if(enemyCount >= 3) {
						System.out.println("しょうぶにかった");
						return 1;
					}	
				}

				return 2;
			}
			else {
				return 3;
			}
		}
		else {
			return 4;
		}
	}
}
