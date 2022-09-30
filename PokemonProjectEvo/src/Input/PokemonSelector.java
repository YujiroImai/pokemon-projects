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
					System.out.println("�|�P����������" + (3 - i) + "�̑I��ł�������");
					System.out.println("1:�|�b�`���}�@2:�i�G�g���@3:�q�R�U��");
					System.out.println("4: �C�[�u�C 5 �s�J�`���E  6:�~�j�����E -> " );
					
					try {
						num = scan.nextInt();
					}
					catch(InputMismatchException e){
						System.out.println("��������͂��Ă�������");
						continue;
					}
					
					if(num <= 6 && num >= 1) {
							if(!count.contains(num)) {
								count.add(num);
								break;
						}					
					}
					System.out.println("�������ԍ�����͂��Ă��������B");
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