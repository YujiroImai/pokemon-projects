package ramuda;

public class Pokemoon {

	private String name = "";
	private int hp = 0;
	
	public Pokemoon(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public boolean equals(Pokemoon poke) {
		 return this.name.equals(poke.name) && this.hp == poke.hp;
	}
	
}
