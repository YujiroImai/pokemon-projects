package Input;



import Ability.AbilityBase;

import java.util.*;

public class  ActionSelector extends InputAbs{

	public int selectAbility(AbilityBase[] abilities, boolean isPlayer) {
		if (isPlayer) {
			
			while(true) {
				System.out.println("�Z��I�����Ă��������B");	
				System.out.println("1:" + abilities[0].getName() + "2:" + abilities[1].getName());
				System.out.println("3:" + abilities[2].getName() + "4:" + abilities[3].getName());
				System.out.println("5: �|�P�����̌���" );
				try {
					num = scan.nextInt();
				
				}
				catch(InputMismatchException e){
					System.out.println("��������͂��Ă��������B");
						
				}
				if(num <= 5 && num >= 1) {
					break;
				}
				else {
					System.out.println("�������ԍ�����͂��Ă��������B");
				}
				
			}
			
			
		}
		
		else {
			num = (int)(Math.random()*5)+1;
		}
		
		
		return num;
		
	}
}