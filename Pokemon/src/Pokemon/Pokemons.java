package Pokemon;

import java.util.*;
public  class Pokemons {

private String pokeName = "";
	
	private String type = "";
	
	private int H = 0;
	private int A = 0;
	private int B = 0;
	private int S = 0;
	
	private ArrayList<String> ability1 = new ArrayList<String>();
	private ArrayList<String> ability2 = new ArrayList<String>();
	private ArrayList<String> ability3 = new ArrayList<String>();
	private ArrayList<String> ability4 = new ArrayList<String>();
	
	Ability ab = new Ability();
	
	public Pokemons(String poke){
		if (poke.equals("ポッチャマ")) {
			this.pokeName = "ポッチャマ";
			this.type = "みず";//水タイプの代替値は「3」
			
			this.H = 200 * (int)(120 - (Math.random()*41))/100;
			this.A = 10 * (int)(120 - (Math.random()*41))/100;
			this.B = 10 * (int)(120 - (Math.random()*41))/100;
			this.S = 10 * (int)(120 - (Math.random()*41))/100;
			
			this.ability1 = new ArrayList<String>(Arrays.asList(ab.getTackle()));
			this.ability2 = new ArrayList<String>(Arrays.asList(ab.getDoubleSlap()));
			this.ability3 = new ArrayList<String>(Arrays.asList(ab.getBubble()));
			this.ability4 = new ArrayList<String>(Arrays.asList(ab.getWaterGun()));
			
		}
		else if(poke.equals("ヒコザル")) {
			this.pokeName = "ヒコザル";
			this.type = "ほのお"; //ほのおたいぷの大体値は「2」
			
			this.H = 170 * (int)(120 - (Math.random()*41))/100;
			this.A = 12 * (int)(120 - (Math.random()*41))/100;
			this.B = 5 * (int)(120 - (Math.random()*41))/100;
			this.S = 15 * (int)(120 - (Math.random()*41))/100;
			
			this.ability1 = new ArrayList<String>(Arrays.asList(ab.getTackle()));
			this.ability2 = new ArrayList<String>(Arrays.asList(ab.getDoubleSlap()));
			this.ability3 = new ArrayList<String>(Arrays.asList(ab.getEmber()));
			this.ability4 = new ArrayList<String>(Arrays.asList(ab.getFlameWheel()));
			
		}
		else if(poke.equals("ナエトル")) {
			this.pokeName = "ナエトル";
			this.type = "くさ"; //くさタイプの代替値は「1」
			
			this.H = 230 * (int)(120 - (Math.random()*41))/100;
			this.A = 8 * (int)(120 - (Math.random()*41))/100;
			this.B = 15 * (int)(120 - (Math.random()*41))/100;
			this.S = 5 * (int)(120 - (Math.random()*41))/100;
			
			this.ability1 = new ArrayList<String>(Arrays.asList(ab.getTackle()));
			this.ability2 = new ArrayList<String>(Arrays.asList(ab.getDoubleSlap()));
			this.ability3 = new ArrayList<String>(Arrays.asList(ab.getLeafage()));
			this.ability4 = new ArrayList<String>(Arrays.asList(ab.getRazorLeaf()));
			
		}
		
	       
	}
	
	
	public String getPokeName() {
		return pokeName;
	}
	
	public String getType() {
		return type;
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
	
	public ArrayList<String> getAbility1() {
		return ability1;
	}
	
	public ArrayList<String> getAbility2() {
		return ability2;
	}
	
	public ArrayList<String> getAbility3() {
		return ability3;
	}
	
	public ArrayList<String> getAbility4() {
		return ability4;
	}
	
	 
	
	public String getAbility1(int i) {
		return ability1.get(i);
	}
	
	public String getAbility2(int i) {
		return ability2.get(i);
	}
	
	public String getAbility3(int i) {
		return ability3.get(i);
	}
	
	public String getAbility4(int i) {
		return ability4.get(i);
	}
	
	 
	
}
