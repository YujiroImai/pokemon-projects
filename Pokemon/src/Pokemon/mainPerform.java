package Pokemon;

import java.io.*;
import java.util.*;

public class mainPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�|�P������I��
		int poke = 0;
		String str = "" ;
		while(true) {
			System.out.println("�ȉ�����|�P������I��Ŕԍ�����͂��Ă�������");
			System.out.print("1: �|�b�`���}�@2:�@�q�R�U���@3:�@�i�G�g�� -->>");
			Scanner scan = new Scanner(System.in);
			poke = scan.nextInt();
			
			if (poke >= 1 && poke <= 3) {
				 
				if (poke == 3) {
					str = "�i�G�g��";
				}
				else if(poke == 2) {
					str = "�q�R�U��";
				}
				else {
					str = "�|�b�`���}";
				}
				
				break;
			}else {
				System.out.println("�������|�P�����̖��O����͂��Ă�������");
			}
		}
		Pokemons mypoke = new Pokemons(str);
		
		System.out.println("���Ȃ��̃|�P������" + mypoke.getPokeName()+"�ł�");
		System.out.println("---------");
		//����CPU���|�P�����������_���őI��
		int ran = (int)(Math.random()*3)+1;
		String epoke = "" ; 
		if (ran == 1) {
			epoke = "�i�G�g��";
		}
		else if(ran == 2) {
			epoke = "�q�R�U��";
		}
		else {
			epoke = "�|�b�`���}";
		}
		
		Pokemons enemypoke = new Pokemons(epoke);
		System.out.println("����̃|�P������" + epoke + "�ł��B");
		System.out.println("--------------------");
		
		Attack ac = new Attack();
		int myHP = mypoke.getH();
		int eHP = enemypoke.getH();
		
		//�Z�̑I���ƍU���̃��[�v�̊J�n
		while(true) {
		//�Z��I��
		int waza;
		while(true) {
			System.out.println("�Z��I��Ŕԍ�����͂��Ă�������");
			System.out.println("1: " + mypoke.getAbility1(0) + " 2: "+ mypoke.getAbility2(0) );
			System.out.print("3: " + mypoke.getAbility3(0) + " 4: "+ mypoke.getAbility4(0) + " -->>");
			Scanner sc = new Scanner(System.in);
			waza = sc.nextInt();

			if (waza >= 1 && waza <= 4) {
				break;
			}else {
				System.out.println("�������Z�̔ԍ�����͂��Ă�������");
			}
		}
		
		 ArrayList<String> selectAbility = new ArrayList<String>();
		 
		if(waza ==1) {
			selectAbility = new ArrayList<String>(mypoke.getAbility1());
		}
		else if(waza == 2) {
			selectAbility = new ArrayList<String>(mypoke.getAbility2());
		}
		else if(waza == 3) {
			selectAbility = new ArrayList<String>(mypoke.getAbility3());
		}
		else {
			selectAbility = new ArrayList<String>(mypoke.getAbility4());
		}
		System.out.println(selectAbility.get(0) + "��I�т܂���");
		System.out.println("--------------------");
		
		//���肪�Z�������_���őI��
		
		int eWaza = (int)(Math.random() * 3) + 1 ;
		ArrayList<String> enemyAbility = new ArrayList<String>();
		 
		if(eWaza == 1) {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility1());
		}
		else if(eWaza == 2) {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility2());
		}
		else if(eWaza == 3) {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility3());
		}
		else {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility4());
		}
		
		//���҂̂��΂₳���r���đ����ق�����ɍU�� Action�N���X�Ƃ̘A�g
		int damage = 0;
		if(mypoke.getS() >= enemypoke.getS()) {
			System.out.println(mypoke.getPokeName() + "��" + selectAbility.get(0) + "!");
			damage =  ac.action(mypoke.getA(), mypoke.getType(), Integer.parseInt(selectAbility.get(1)), selectAbility.get(2), enemypoke.getType(), enemypoke.getB(), selectAbility.get(4));
			System.out.println("�����" + enemypoke.getPokeName() + "��" + damage + "�̃_���[�W!");
			eHP -= damage;
			enemypoke.setH(eHP) ;
			if(eHP <= 0) {
				System.out.println("�����" + enemypoke.getPokeName() + "�͓|�ꂽ");
				System.out.println("�����ɏ�����!!");
				break;
			}
			System.out.println("----------");
			System.out.println("�����" + enemypoke.getPokeName() + "��" + enemyAbility.get(0) + "!");
			damage =ac.action(enemypoke.getA(), enemypoke.getType(),Integer.parseInt(enemyAbility.get(1)), enemyAbility.get(2), mypoke.getType(), mypoke.getB(), enemyAbility.get(4));
			System.out.println( mypoke.getPokeName() + "��" + damage + "�̃_���[�W!");
			myHP -= damage;
			 mypoke.setH(myHP);
			 System.out.println("--------------------");
			 if(myHP <= 0) {
				 System.out.println("���Ȃ���" + mypoke.getPokeName() + "�͓|�ꂽ");
				 System.out.println("�����ɕ����Ėڂ̑O���^���ÂɂȂ���!!");
				 break;
			 }
				
 		}
		else if(mypoke.getS() < enemypoke.getS()) {
			 System.out.println("�����" +enemypoke.getPokeName() + "��" + enemyAbility.get(0) + "!");
			 damage =ac.action(enemypoke.getA(), enemypoke.getType(),Integer.parseInt(enemyAbility.get(1)), enemyAbility.get(2), mypoke.getType(), mypoke.getB(), enemyAbility.get(4));
			 System.out.println(mypoke.getPokeName() + "��" + damage + "�̃_���[�W!");
			 myHP -= damage;
			 mypoke.setH(myHP);
			 if(myHP <= 0) {
				 System.out.println("���Ȃ���" + mypoke.getPokeName() + "�͓|�ꂽ");
				 System.out.println("�����ɕ����Ėڂ̑O���^���ÂɂȂ���!!");
				 break;
			 }
			 System.out.println("----------");
			 System.out.println(mypoke.getPokeName() + "��" + selectAbility.get(0) + "!");
			 damage =  ac.action(mypoke.getA(), mypoke.getType(), Integer.parseInt(selectAbility.get(1)), selectAbility.get(2), enemypoke.getType(), enemypoke.getB(), selectAbility.get(4));
			 System.out.println("�����" + enemypoke.getPokeName() + "��" + damage + "�̃_���[�W!");
			 eHP -= damage;
			 enemypoke.setH(eHP) ;
			 System.out.println("--------------------");
			 if(eHP <= 0) {
					System.out.println("�����" + enemypoke.getPokeName() + "�͓|�ꂽ");
					System.out.println("�����ɏ�����!!");
					break;
				}
			 
		}
	}	
		
		
		//���ʂ̕\��
	}

}
