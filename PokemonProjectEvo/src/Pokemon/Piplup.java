package Pokemon;

import Ability.AbilityBase;
import Ability.AbilityTable;

public class Piplup extends PokemonBase{

	public Piplup() {
		super(200, 11, 11, 10, "みず", "ポッチャマ", new AbilityBase[] {new AbilityTable().getTackle(), new AbilityTable().getDoubleSlap(), new AbilityTable().getBubble(), new AbilityTable().getWaterGun()});
	}
	
	public void attack() {}
}
