package Pokemon2;

import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�|�P�����̑I��
		//int poke = 0;
		
		Select selectMyPoke = new Select(1);
		//poke = selectMyPoke.getPoke();
		Pokemons mypoke = new Pokemons(selectMyPoke.getResult());
		String myPokeName = mypoke.getPokeName();
		System.out.println("---" + selectMyPoke.getResult() + "��I�т܂����B");
		System.out.println("�������� : " + mypoke.getCharactor());
		System.out.println("�X�e�[�^�X�@�@HP: " + mypoke.getH() + " ��������: " + mypoke.getA());
		System.out.println("�@�@�@   �ڂ�����: " + mypoke.getB() + " ���΂₳: " + mypoke.getS());
		
		//selectMyPoke.selectAbility();
		//����̃|�P�����I��
		 
		Select selectRivalPoke = new Select(0);
		Pokemons rivalpoke = new Pokemons(selectRivalPoke.getResult());
		String rivalPokeName = rivalpoke.getPokeName();
		System.out.println("---" + "�����" + selectRivalPoke.getResult() + "��I�т܂����B");
		System.out.println("�������� : " + rivalpoke.getCharactor());
		System.out.println("�X�e�[�^�X�́@HP: " + rivalpoke.getH() + " ��������: " + rivalpoke.getA());
		System.out.println("�@�@�@   �ڂ�����: " + rivalpoke.getB() + " ���΂₳: " + rivalpoke.getS());
		
		////�J��Ԃ�
		//Battle battle = new Battle(mypoke, rivalpoke);//Battle�N���X�̌Ăяo��
		int myHP = mypoke.getH(); 
		int rivalHP = rivalpoke.getH();
		while(true) {
			
			//int waza = 0;
		//�Z�̑I��
			//waza = selectMyPoke.selectAbility(mypoke);
			//battle.select(waza, myPokeName, 0);//�����Ƃ��ċZ�I�������Ƃ��̔ԍ��ƃ|�P�����̖��O���Ƃ�
			
		//����̋Z�I��
			//battle.select(waza, rivalPokeName, 1);//�����Ƃ��ċZ�I�������Ƃ��̔ԍ��ƃ|�P�����̖��O���Ƃ�
			
			
		//�_���[�W�v�Z�ƌ��ʂ̕\��
			BattleStream stream = new BattleStream(mypoke, rivalpoke, selectMyPoke);
			int[] HPList = stream.getResult(mypoke, rivalpoke);
			myHP = HPList[0];
			rivalHP = HPList[1];
			
			if(myHP <=0 || rivalHP <= 0) {
				break;
			}
		//System.out.println(fight.getResult());
		}
		////
		
		//�ΐ팋�ʂ̕\��
		
		 if(myHP <= 0) {
		 System.out.println("���Ȃ���" +mypoke.getPokeName() + "�͓|�ꂽ");
		 System.out.println("�����ɔs��Ėڂ̑O���^���ÂɂȂ���!!");
	    }
	    else {
	    System.out.println("�����" + rivalpoke.getPokeName() + "�͓|�ꂽ");
		System.out.println("����Ƃ̏����ɏ�������!!");
	    }
		//Result result = new Result();
		
		//System.out.println(result.getResult());
	}

}
