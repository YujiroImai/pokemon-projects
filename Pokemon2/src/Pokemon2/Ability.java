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
			jname = "たいあたり";
			ename = "tackle";
			power = 5;
			type = "ノーマル";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 2) {
			jname = "おうふくビンタ";
			ename = "doubleSlap";
			power = 2;
			type = "ノーマル";
			attackRepeat = true;
			hitRate = 90;
		}
		else if(id == 3) {
			jname = "あわ";
			ename = "bubble";
			power = 5;
			type = "みず";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 4) {
			jname = "みずでっぽう";
			ename = "waterGun";
			id = 4;
			power = 7;
			type = "みず";
			attackRepeat = false;
			hitRate = 90;
		}
		else if(id == 5) {
			jname = "ひのこ";
			ename = "ember";
			power = 5;
			type = "ほのお";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 6) {
			jname = "かえんぐるま";
			ename = "flameWheel";
			power = 7;
			type = "ほのお";
			attackRepeat = false;
			hitRate = 90;
		}
		else if(id == 7) {
			jname = "このは";
			ename = "leafage";
			power = 5;
			type = "くさ";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 8) {
			jname = "はっぱカッター";
			ename = "RazorLeaf";
			power = 7;
			type = "くさ";
			attackRepeat = false;
			hitRate = 90;
		}
		else if(id == 9) {
			jname = "かぜおこし";
			ename = "gust";
			power = 5;
			type = "ひこう";
			attackRepeat = false;
			hitRate = 100;
		}
		else if(id == 10) {
			jname = "つばめがえし";
			ename = "aerialAce";
			power = 8;
			type = "ひこう";
			attackRepeat = false;
			hitRate = 80;
		}
		else if(id == 11) {
			jname = "はがねのつばさ";
			ename = "steelWing";
			power = 7;
			type = "はがね";
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
