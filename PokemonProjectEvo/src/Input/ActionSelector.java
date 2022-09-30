package Input;



import Ability.AbilityBase;

import java.util.*;

public class  ActionSelector extends InputAbs{

	public int selectAbility(AbilityBase[] abilities, boolean isPlayer) {
		if (isPlayer) {
			
			while(true) {
				System.out.println("技を選択してください。");	
				System.out.println("1:" + abilities[0].getName() + "2:" + abilities[1].getName());
				System.out.println("3:" + abilities[2].getName() + "4:" + abilities[3].getName());
				System.out.println("5: ポケモンの交換" );
				try {
					num = scan.nextInt();
				
				}
				catch(InputMismatchException e){
					System.out.println("整数を入力してください。");
						
				}
				if(num <= 5 && num >= 1) {
					break;
				}
				else {
					System.out.println("正しい番号を入力してください。");
				}
				
			}
			
			
		}
		
		else {
			num = (int)(Math.random()*5)+1;
		}
		
		
		return num;
		
	}
}