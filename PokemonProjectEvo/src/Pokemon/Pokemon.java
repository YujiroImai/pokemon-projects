package Pokemon;

import Ability.AbilityBase;

public interface Pokemon {

	public boolean isDead();
	public void takeDamage(int damage) ;
	public void attack();
	public int getHp() ;
	public void setHp(int hp);
	public int getAtk() ;
	public void setAtk(int atk);
	
	
	//セッターゲッター
	public int getDef() ;
	public void setDef(int def) ;
	public int getSpeed() ;
	public void setSpeed(int speed) ;
	public String getType();
	public void setType(String type) ;
	public String getName();
	public void setName(String name) ;
	public AbilityBase[] getAbilities() ;
	public AbilityBase getAbility(int i) ;
	public void setAbilities(AbilityBase[] abilities) ;
}
