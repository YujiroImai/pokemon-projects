package Input;


import java.util.InputMismatchException;

import Pokemon.Pokemon;
import Pokemon.PokemonBase;

public class InputChangePokemon extends InputAbs{

	private Pokemon[] pokemons;

	public  InputChangePokemon(Pokemon[] poke) {
		this.pokemons = poke;
	}

	public Pokemon changePokemon(Pokemon using, boolean isPlayer) {
		int num = 0;
		if(isPlayer) {
			while(true) {
				System.out.println("1:" + pokemons[0].getName() + "2:" + pokemons[1].getName() + "3:" + pokemons[2].getName());
				try{
					num = scan.nextInt();
					num -= 1;
				}
				catch(InputMismatchException e){
					System.out.println("整数を入力してください");
					continue;
				}
				if(num <= 2 && num >= 0) {
					
					if(pokemons[num].isDead()) {
						System.out.println("そのポケモンは戦闘不能です");
						continue;
					}
					
					else if((pokemons[num] == using)) {
						System.out.println("そのポケモンは現在使用しています");
						continue;
					}
					else {			
						return pokemons[num];
					}

				}
				System.out.println("正しい番号を入力してください。");
			}
		}
		else {
			while(true) {
				num = (int)(Math.random()*3);

				if(pokemons[num].isDead()) {
					continue;
				}
				else if((pokemons[num] == using)) {
					continue;
				}
				else {
					return pokemons[num];
				}
			}
		}
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public Pokemon getPokemon(int i) {
		return pokemons[i - 1];
	}



}