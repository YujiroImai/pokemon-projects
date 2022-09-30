package Pokemon;

public class Ability {

	/*
	    String ability;
		int power;
		private String abilityType;
		private boolean atackRepeat;
		
	
		public String getAbility() {
			return this.ability;
		}
		
		public int getPower() {
			return this.power;
		}
		public String getAbilityType() {
			return this.abilityType;
		}
		public boolean getAtackRepeat() {
			return this.atackRepeat;
		}
		*/
	//{技の名前, 威力, 技のタイプ, 複数回攻撃かどうか}
	/*
	 技のタイプ: 代替値
	 ノーマルタイプ:0
	 くさ:1
	 ほのお:2
	 みず:3
	 */
	/*
	 複数回攻撃かどうか:代替値
	 一回攻撃:false
	 複数回攻撃:true
	 */
	
	
	
	//ノーマル
	//private int[] tackle = {1, 5, 0, 0};
	private String tackle[] = {"たいあたり", "5", "ノーマル", "0", "false"};
	//private int[] doubleSlap = {2, 3, 0, 1};
	private String doubleSlap[] = {"おうふくビンタ", "3", "ノーマル", "0", "true"};
	//みず
	//private int[] bubble = {3, 5, 3, 0};
	private String bubble[] = {"あわ", "5", "みず", "3","false"};
	//private int[] waterGun = {4, 7, 3, 0};
	private String waterGun[] = {"みずでっぽう", "7", "みず", "3","false"};
	//ほのお
	//private int[] ember = {5, 5, 2, 0};
	private String ember[] = {"ひのこ", "5", "ほのお", "2","false"};
	//private int[] flameWheel = {6, 7, 2, 0};
	private String flameWheel[] = {"かえんぐるま", "7", "ほのお", "2","false"};
	//くさ
	//private int[] leafage = {7, 5, 1, 0};
	private String leafage[] = {"このは", "5", "くさ", "1","false"};
	//private int[] razorLeaf = {8, 7, 1, 0};
	private String razorLeaf[] = {"はっぱカッター", "7", "くさ", "1","false"};
	
	
	public String[] getTackle() {
		return tackle;
	}
	
	public String[] getDoubleSlap() {
		return doubleSlap;
	}
	public String[] getBubble() {
		return bubble;
	}
	public String[] getWaterGun() {
		return waterGun;
	}
	public String[] getEmber() {
		return ember;
	}
	public String[] getFlameWheel() {
		return flameWheel;
	}
	
	public String[] getLeafage() {
		return leafage;
	}
	public String[] getRazorLeaf() {
		return razorLeaf;
	}
}
