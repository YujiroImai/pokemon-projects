package Pokemon;

import Ability.AbilityBase;
import Ability.AbilityTable;

public class Eevee extends PokemonBase{

	public Eevee() {
		super(190, 9, 9, 12, "ノーマル", "イーブイ", new AbilityBase[] {new AbilityTable().getTackle(), new AbilityTable().getDoubleKick(), new AbilityTable().getMudSlap(), new AbilityTable().getHyperVoice()});
	}
	
	public void attack() {}
}
