package Pokemon2;

import java.util.ArrayList;
import java.util.Arrays;

public class Pokemons {

	private String pokeName = "";
	private String type1 = "";
	private String type2 = "";
	
	private int H = 0;
	private int A = 0;
	private int B = 0;
	private int S = 0;
	
	private String charactor = "";
	
	
	
	//private String skill1[], skill2[], skill3[],skill4[];
	
    //private Ability ability1, ability2, ability3, ability4;
	private Ability[] abilities = new Ability[4];//���ꂼ���ability������z����쐬
	
	public Pokemons(String poke){
		if (poke.equals("�|�b�`���}")) {
			this.pokeName = "�|�b�`���}";
			this.type1 = "�݂�";//���^�C�v�̑�֒l�́u3�v
			this.type2 = "";
			
			this.H = 250 + (10 *(int)(Math.random()*7)-3);
			this.A = 13 + (1 *(int)(Math.random()*7)-3);
			this.B = 15 + (1 *(int)(Math.random()*7)-3);
			this.S = 13 + (1 *(int)(Math.random()*7)-3);
		
			Charactor chara = new Charactor(A, B, S);//Character�N���X�̌Ăяo��
			this.A = chara.getA();
			this.B = chara.getB();
			this.S = chara.getS();
			
			this.charactor = chara.getCharactor();
			//naetoru1[0] = new String[]{"����������", "5", "�m�[�}��", "true"};
			
			abilities[0] = new Ability(1);
			abilities[1] = new Ability(2);
			abilities[2] = new Ability(3);
			abilities[3] = new Ability(4);

		}
		else if(poke.equals("�q�R�U��")) {
			this.pokeName = "�q�R�U��";
			this.type1 = "�ق̂�"; //�ق̂��^�C�v��id�́u2�v
			this.type2 = "";
			
			this.H = 200 + (10 *(int)(Math.random()*7)-3);
			this.A = 16 + (1 *(int)(Math.random()*7)-3);
			this.B = 10 + (1 *(int)(Math.random()*7)-3);
			this.S = 18 + (1 *(int)(Math.random()*7)-3);
			
			Charactor chara = new Charactor(A, B, S);//Character�N���X�̌Ăяo��
			this.A = chara.getA();
			this.B = chara.getB();
			this.S = chara.getS();
			
			this.charactor = chara.getCharactor();
			
			abilities[0] = new Ability(1);
			abilities[1] = new Ability(2);
			abilities[2] = new Ability(5);
			abilities[3] = new Ability(6);
			
		}
		else if(poke.equals("�i�G�g��")) {
			this.pokeName = "�i�G�g��";
			this.type1 = "����"; //�����^�C�v�̑�֒l�́u1�v
			this.type2 = "";
			
			this.H = 280 + (10 *(int)(Math.random()*7)-3);
			this.A = 10 + (1 *(int)(Math.random()*7)-3);
			this.B = 20 + (1 *(int)(Math.random()*7)-3);
			this.S = 11 + (1 *(int)(Math.random()*7)-3);
			
			Charactor chara = new Charactor(A, B, S);//Character�N���X�̌Ăяo��
			this.A = chara.getA();
			this.B = chara.getB();
			this.S = chara.getS();
			
			this.charactor = chara.getCharactor();
			
			abilities[0] = new Ability(1);
			abilities[1] = new Ability(2);
			abilities[2] = new Ability(7);
			abilities[3] = new Ability(8);
		}
		else if (poke.equals("���b�N��")){
			this.pokeName = "���b�N��";
			this.type1 = "�m�[�}��"; 
			this.type2 = "�Ђ���";
			
			this.H = 190 + (10 *(int)(Math.random()*7)-3);
			this.A = 15 + (1 *(int)(Math.random()*7)-3);
			this.B = 15 + (1 *(int)(Math.random()*7)-3);
			this.S = 16 + (1 *(int)(Math.random()*7)-3);
			
			Charactor chara = new Charactor(A, B, S);//Character�N���X�̌Ăяo��
			this.A = chara.getA();
			this.B = chara.getB();
			this.S = chara.getS();
			
			this.charactor = chara.getCharactor();
			
			abilities[0] = new Ability(1);
			abilities[1] = new Ability(9);
			abilities[2] = new Ability(10);
			abilities[3] = new Ability(11);
		}
		
	}
	
	public String getPokeName() {
		return pokeName;
	}
	
	public String getType1() {
		return type1;
	}
	
	public String getType2() {
		return type2;
	}
	
	public void setH(int HP) {
		this.H = HP;
	}
	
	public int getH() {
		return H;
	}
	
	public int getA() {
		return A;
	}
	
	public int getB() {
		return B;
	}
	public int getS() {
		return S;
	}
	
	public String getCharactor() {
		return charactor;
	}
	public int getAbilityPower(int i) {
		return abilities[i].getPower();
	}
	
	public int getAbilityHitRate(int i) {
		return abilities[i].getHitRate();
	}
	public String getAbilityName(int i) {
		return abilities[i].getJname();
	}
	
	public String getAbilityType(int i) {
		return abilities[i].getType();
	}
	public boolean getAttackRepeat(int i) {
		return abilities[i].getAttackRepeat();
	}
}
