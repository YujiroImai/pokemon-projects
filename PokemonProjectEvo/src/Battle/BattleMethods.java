package Battle;

import Ability.AbilityBase;
import Pokemon.Pokemon;
import Pokemon.PokemonBase;
import TypeRelation.TypeCalculator;

public class BattleMethods{

	
	private boolean _attack(Pokemon attacker, Pokemon deffender, AbilityBase ability) {

		if (attacker.equals(player)) {
			System.out.println("Ç†Ç»ÇΩÇÃ" + attacker.getName() + "ÇÃ" + ability.getName());
		}
		else if(attacker.equals(enemy)){
			System.out.println("Ç†Ç¢ÇƒÇÃ" + attacker.getName() + "ÇÃ" + ability.getName());
		}

		//Ç®Ç§Ç”Ç≠Ç—ÇÒÇΩèàóù
		if(ability.isMulti()) {

			_multiAttack(attacker, deffender, ability);

		}else {
			_singleAttack(attacker, deffender, ability);
		}

		if(deffender.isDead()) {
			if(deffender.equals(enemy)) {
				System.out.println("Ç†Ç¢ÇƒÇÃ" + deffender.getName() + "ÇÕÇΩÇ®ÇÍÇΩ");

				return false;
			}
			else if(deffender.equals(player)){
				System.out.println("Ç†Ç»ÇΩÇÃ" + deffender.getName() + "ÇÕÇΩÇ®ÇÍÇΩ");

				return false;
			}
		}

		System.out.println("ÇÃÇ±ÇËHP" + deffender.getHp());
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
			System.out.println("ã}èäÇ…ìñÇΩÇ¡ÇΩÅB");
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
				System.out.println(i + "âÒÇ†ÇΩÇ¡ÇΩ");
				break;
			}

		}
		if(deffender.getHp() > 0) {
			System.out.println(count + "âÒÇ†ÇΩÇ¡ÇΩ");
		}

		return deffender.getHp();
	}
}
