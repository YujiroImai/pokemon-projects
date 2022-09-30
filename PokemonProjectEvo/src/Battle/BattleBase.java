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
					System.out.println("����ȏ�����ł��܂���");
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

				//�����̍U��

				result = _act(player, enemy, selected,pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {

					if(result == 2){
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("�����Ă͐V����" + enemy.getName()+ "�����肾����");
						continue;
					}
					else {
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("���Ȃ��͐V����" + player.getName()+ "��I�т܂���");
					}
				}
				
				//����̍U��
				result = _act(enemy, player, ayataka, pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {
					if(result == 2){
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("���Ȃ��͐V����" + player.getName()+ "��I�т܂���");
						continue;
					}
					else {
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("�����Ă͐V����" + enemy.getName()+ "�����肾����");	
					}
				}
			}
			
			else {
				//����̍U��
				result = _act(enemy, player, ayataka, pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {
					if(result == 2){
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("���Ȃ��͐V����" + player.getName()+ "��I�т܂���");
						continue;
					}
					else {
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("�����Ă͐V����" + enemy.getName()+ "��I�т܂���");	
					}
				}

				//���Ԃ�̍U��
				result = _act(player, enemy, selected,  pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {

					if(result == 2){
						enemy =  _selectPokemon(enemy, pokeSelect);
						this.enemy = enemy;
						System.out.println("�����Ă͐V����" + enemy.getName()+ "��I�т܂���");
						continue;
					}
					else {
						player =  _selectPokemon(player, pokeSelect);
						this.player = player;
						System.out.println("���Ȃ��͐V����" + player.getName()+ "��I�т܂���");
					}
				}
			}
		}
	}
	
	private boolean _attack(Pokemon attacker, Pokemon deffender, AbilityBase ability) {

		if (attacker.equals(player)) {
			System.out.println("���Ȃ���" + attacker.getName() + "��" + ability.getName());
		}
		else if(attacker.equals(enemy)){
			System.out.println("�����Ă�" + attacker.getName() + "��" + ability.getName());
		}

		//�����ӂ��т񂽏���
		if(ability.isMulti()) {

			_multiAttack(attacker, deffender, ability);

		}else {
			_singleAttack(attacker, deffender, ability);
		}

		if(deffender.isDead()) {
			if(deffender.equals(enemy)) {
				System.out.println("�����Ă�" + deffender.getName() + "�͂����ꂽ");

				return false;
			}
			else if(deffender.equals(player)){
				System.out.println("���Ȃ���" + deffender.getName() + "�͂����ꂽ");

				return false;
			}
		}

		System.out.println("�̂���HP" + deffender.getHp());
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
			System.out.println("�}���ɓ��������B");
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
				System.out.println(i + "�񂠂�����");
				break;
			}

		}
		if(deffender.getHp() > 0) {
			System.out.println(count + "�񂠂�����");
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
						System.out.println("�߂̂܂����܂�����ɂȂ���");
						return 1;
					}	
				}
				else {
					enemyCount++;
					if(enemyCount >= 3) {
						System.out.println("���傤�Ԃɂ�����");
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
