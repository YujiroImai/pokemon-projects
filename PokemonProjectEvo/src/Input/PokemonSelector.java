package Input;


import java.util.*;
import Ability.AbilityBase;
import Ability.AbilityTable;
import Pokemon.*;


public class PokemonSelector extends InputAbs{
	
	Pokemon pokemon ;
	ArrayList<Integer> count = new ArrayList<>();
	Pokemon[] poke = new Pokemon[3];
	AbilityTable at = new AbilityTable();
	public Pokemon[] selectPokemon(boolean isPlayer) {
		
//		Arrays.stream(poke).forEach( i ->{
		for(int i = 0; i < poke.length; i++) {

			if(isPlayer) {
				while(true) {
					System.out.println("ポケモンをあと" + (3 - i) + "体選んでください");
					System.out.println("1:ポッチャマ　2:ナエトル　3:ヒコザル");
					System.out.println("4: イーブイ 5 ピカチュウ  6:ミニリュウ -> " );
					
					try {
						num = scan.nextInt();
					}
					catch(InputMismatchException e){
						System.out.println("整数を入力してください");
						continue;
					}
					
					if(num <= 6 && num >= 1) {
							if(!count.contains(num)) {
								count.add(num);
								break;
						}					
					}
					System.out.println("正しい番号を入力してください。");
				}
			}
			else {
					while(true) {
						num = (int)(Math.random()*6)+1;
						if(!count.contains(num)) {
							count.add(num);
							break;					
						}	
					}	
			}

//			AbilityBase[] ability1 = {
//					at.getTackle(),
//					at.getDoubleSlap(),
//					at.getBubble(),
//					at.getWaterGun()
//			};
//			AbilityBase[] ability2 = {
//					at.getTackle(),
//					at.getBulletSeed(),
//					at.getLeafage(),
//					at.getRazorLeaf()
//				};
//			AbilityBase[] ability3 = {
//					at.getTackle(),
//					at.getDoubleSlap(),
//					at.getEmber(),
//					at.getFlameWheel()
//				};
//			AbilityBase[] ability4 = {
//					at.getTackle(),
//					at.getDoubleKick(),
//					at.getMudSlap(),
//					at.getHyperVoice()
//				};
//			AbilityBase[] ability5 = {
//					at.getTackle(),
//					at.getDoubleSlap(),
//					at.getThunderShock(),
//					at.getThunderbolt()
//				};
//			AbilityBase[] ability6 = {
//					at.getThunderbolt(),
//					at.getIceBeam(),
//					at.getWaterfall(),
//					at.getDragonPulse()
//				};
			
			if (num == 1) {
				 pokemon = new Piplup();
			}
			else if (num == 2) {
				pokemon = new Turtwig();
			}
			else if(num == 3){
				pokemon = new Chimchar();
			}else if(num == 4) {
				pokemon = new Eevee();
			}
			else if (num == 5) {
				pokemon = new Pikachu();
			}
			else if (num == 6) {
				pokemon = new Dratini();
			}
			poke[i] = pokemon;
		}
			return poke;
	}
	
}