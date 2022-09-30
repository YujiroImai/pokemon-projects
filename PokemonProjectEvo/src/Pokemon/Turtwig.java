package Pokemon;

import Ability.AbilityBase;
import Ability.AbilityTable;

public class Turtwig extends PokemonBase{

	public Turtwig() {
		super(230, 8, 15, 8, "くさ", "ナエトル", new AbilityBase[] {new AbilityTable().getTackle(), new AbilityTable().getLeafage(), new AbilityTable().getRazorLeaf(), new AbilityTable().getBulletSeed()});
	}
	
	public void attack() {}
}
