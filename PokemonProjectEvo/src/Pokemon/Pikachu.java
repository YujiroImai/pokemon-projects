package Pokemon;

import Ability.AbilityBase;
import Ability.AbilityTable;

public class Pikachu extends PokemonBase{

	public Pikachu() {
		super(170, 11, 7, 17, "�ł�", "�s�J�`���E", new AbilityBase[] {new AbilityTable().getTackle(), new AbilityTable().getDoubleSlap(), new AbilityTable().getThunderShock(), new AbilityTable().getThunderbolt()});
	}
	
	public void attack() {}
}
