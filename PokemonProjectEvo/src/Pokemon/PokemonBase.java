package Pokemon;

import Ability.AbilityBase;

public abstract class PokemonBase implements Pokemon {


	private int hp = 0;
	private int atk = 0;
	private int def = 0;
	private int speed = 0;
	private String type = "";
	private String name = "";
	private AbilityBase[] abilities ;
	
	public PokemonBase(int hp, int atk, int def, int speed, String type, String name, AbilityBase[] abilities) {
		super();
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.type = type;
		this.name = name;
		this.abilities = abilities;
	}
	
	public boolean isDead() {
		return hp <= 0;
	
	}
	public void takeDamage(int damage) {
		hp = hp -(damage-def);
		System.out.println(damage-def + "のダメージ");
	}
	
	public void attack() {}
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
	//セッターゲッター
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AbilityBase[] getAbilities() {
		return abilities;
	}
	public AbilityBase getAbility(int i) {
		return abilities[i - 1];
	}
	public void setAbilities(AbilityBase[] abilities) {
		this.abilities = abilities;
	}
	
	
}