package Pokemon2;

import java.util.*;
import java.io.*;

public class Select {
	Scanner scan = new Scanner(System.in);
	private String name= "";
	int poke;
	private Pokemons mypoke;
	public  Select(int i) {	

		if(i == 1) {
			while(true) {
				System.out.println("�ȉ�����|�P������I��Ŕԍ�����͂��Ă�������");
				System.out.print("1: �|�b�`���}�@2:�@�q�R�U���@3:�@�i�G�g�� 4: ���b�N��-->>");
				try {
					poke = scan.nextInt();
				}
				catch(InputMismatchException e){
					 ;
				}
				System.out.println(poke);
				if (poke >= 1 && poke <= 4) {
					break;
				}
				else {
					System.out.println("�������|�P�����̔ԍ�����͂��Ă�������");
				}
			}
		}
		else {
			poke = (int)(Math.random()*4)+1;
		}
		if (poke == 3) {
			name = "�i�G�g��";
		}
		else if(poke == 2) {
			name = "�q�R�U��";
		}
		else if(poke == 1){
			name = "�|�b�`���}";
		}	
		else if (poke == 4) {
			name ="���b�N��";
		}

	}
	//Pokemons mypoke = new Pokemons();

	public String getResult() {
		return name;
	}

	public int getPoke() {
		return poke;
	}

	//�o��������Z�̑I��
	//public void selectAbility(){
	//
	//}
	//

	int waza = 0;
	public int selectAbility(Pokemons mypoke) {
		this.mypoke = mypoke;

		while(true) {
			System.out.println("�Z��I��Ŕԍ�����͂��Ă�������");
			System.out.println("1: " + mypoke.getAbilityName(0) + " 2: "+ mypoke.getAbilityName(1) );		
			System.out.print("3: " + mypoke.getAbilityName(2) + " 4: "+ mypoke.getAbilityName(3) + " -->>");
			try {

				waza = scan.nextInt();
			}
			catch(InputMismatchException e){
				scan.next();
			}
			if (waza >= 1 && waza <= 4) {
				break;
			}
			else {
				System.out.println("�������Z�̔ԍ�����͂��Ă�������");
			}
		}
		return waza;
	}
}
