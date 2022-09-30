package Pokemon;

import Ability.AbilityBase;
import Ability.AbilityTable;

public class Chimchar extends PokemonBase{

	
	
	public Chimchar() {
		super(170, 12, 5, 15, "‚Ù‚Ì‚¨", "ƒqƒRƒUƒ‹", new AbilityBase[] {new AbilityTable().getTackle(), new AbilityTable().getDoubleSlap(), new AbilityTable().getEmber(), new AbilityTable().getFlameWheel()});
	}
	
	public void attack() {}
}
