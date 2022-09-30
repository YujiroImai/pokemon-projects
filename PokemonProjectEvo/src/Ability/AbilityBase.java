package Ability;


public class AbilityBase implements Ability{

	private String name ="";
	private int power = 0;
	private String type = "";
	private boolean isMulti;
	
	public AbilityBase(String name, int power, String type, boolean isMulti) {
		super();
		this.name = name;
		this.power = power;
		this.type = type;
		this.isMulti = isMulti;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isMulti() {
		return isMulti;
	}

	public void setMulti(boolean isMulti) {
		this.isMulti = isMulti;
	}

}
