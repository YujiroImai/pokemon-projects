package Pokemon;

import Ability.AbilityBase;
import Ability.AbilityTable;

public class Dratini extends PokemonBase{

	public Dratini() {
		super(150, 8, 10, 8, "ドラゴン", "ミニリュウ", new AbilityBase[] {new AbilityTable().getThunderbolt(), new AbilityTable().getIceBeam(), new AbilityTable().getWaterfall(), new AbilityTable().getDragonPulse()});
	}
	
	public void attack() {}
}
