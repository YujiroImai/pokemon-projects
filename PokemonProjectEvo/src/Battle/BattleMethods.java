package Battle;

import Ability.AbilityBase;
import Pokemon.Pokemon;
import Pokemon.PokemonBase;
import TypeRelation.TypeCalculator;

public class BattleMethods{

	
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

	private void _singleAttack(PokemonBase attacker,PokemonBase deffender, AbilityBase ability) {

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

	private int _multiAttack(PokemonBase attacker,PokemonBase deffender, AbilityBase ability) {
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
}
