package Pokemon2;

public class Ability {


	private String jname = "";
	private String ename = "";
	private String type;
	private int power;
	private int hitRate;
	private boolean attackRepeat;
	
	
	public Ability(int id) {
		
		if(id == 1) {
			jname = "����������";
			ename = "tackle";
			power = 5;
			type = "�m�[�}��";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 2) {
			jname = "�����ӂ��r���^";
			ename = "doubleSlap";
			power = 2;
			type = "�m�[�}��";
			attackRepeat = true;
			hitRate = 90;
		}
		else if(id == 3) {
			jname = "����";
			ename = "bubble";
			power = 5;
			type = "�݂�";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 4) {
			jname = "�݂��ł��ۂ�";
			ename = "waterGun";
			id = 4;
			power = 7;
			type = "�݂�";
			attackRepeat = false;
			hitRate = 90;
		}
		else if(id == 5) {
			jname = "�Ђ̂�";
			ename = "ember";
			power = 5;
			type = "�ق̂�";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 6) {
			jname = "�����񂮂��";
			ename = "flameWheel";
			power = 7;
			type = "�ق̂�";
			attackRepeat = false;
			hitRate = 90;
		}
		else if(id == 7) {
			jname = "���̂�";
			ename = "leafage";
			power = 5;
			type = "����";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 8) {
			jname = "�͂��σJ�b�^�[";
			ename = "RazorLeaf";
			power = 7;
			type = "����";
			attackRepeat = false;
			hitRate = 90;
		}
		else if(id == 9) {
			jname = "����������";
			ename = "gust";
			power = 5;
			type = "�Ђ���";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 10) {
			jname = "�΂߂�����";
			ename = "aerialAce";
			power = 8;
			type = "�Ђ���";
			attackRepeat = false;
			hitRate = 80;
		}
		else if(id == 11) {
			jname = "�͂��˂̂΂�";
			ename = "steelWing";
			power = 7;
			type = "�͂���";
			attackRepeat = false;
			hitRate = 90;
		}
}


	


	public String getJname() {
		return jname;
	}
	public String getEname() {
		return ename;
	}
	public int getPower() {
		return power;
	}
	
	public String getType() {
		return type;
	}
	public boolean getAttackRepeat() {
		return attackRepeat;
	}
	public int getHitRate() {
		return hitRate;
	}
	
}
