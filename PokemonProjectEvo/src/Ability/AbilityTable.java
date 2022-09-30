package Ability;

public class AbilityTable implements Ability{

	//ノーマル
	private  AbilityBase tackle = new AbilityBase("たいあたり",5,"ノーマル",false);
	private  AbilityBase doubleSlap = new AbilityBase("おうふくびんた",3,"ノーマル",true);
	private  AbilityBase hyperVoice = new AbilityBase("ハイパーボイス",8,"ノーマル",false);
	//みず
	private  AbilityBase bubble = new AbilityBase("あわ",5,"みず",false);
	private  AbilityBase waterGun = new AbilityBase("みずでっぽう",7,"みず",false);
	private  AbilityBase waterfall = new AbilityBase("たきのぼり",8,"みず",false);
			
	//ほのお
	private  AbilityBase ember = new AbilityBase("ひのこ",5,"ほのお",false);
	private  AbilityBase flameWheel = new AbilityBase("かえんぐるま",7,"ほのお",false);
	
	//くさ
	private  AbilityBase leafage = new AbilityBase("このは",5,"くさ",false);
	private  AbilityBase razorLeaf = new AbilityBase("はっぱカッター",7,"くさ",false);
	private  AbilityBase bulletSeed = new AbilityBase("タネマシンガン",3,"くさ",true);

	//でんき
	private  AbilityBase thunderShock = new AbilityBase("でんきショック",5,"でんき",false);
	private  AbilityBase thunderbolt = new AbilityBase("10まんボルト",8,"でんき",false);
	
	//こおり
	private  AbilityBase iceBeam = new AbilityBase("れいとうビーム",8,"こおり",false);
	
	//かくとう
	private  AbilityBase doubleKick = new AbilityBase("にどげり",3,"かくとう",true);
	//どく
	
	//じめん
	private  AbilityBase mudSlap = new AbilityBase("どろかけ",5,"じめん",false);
	//ひこう
	
	//エスパー
	
	//むし
	
	//いわ
	
	//ゴースト
	
	//ドラゴン
	private  AbilityBase dragonPulse = new AbilityBase("りゅうのはどう",9,"ドラゴン",false);
	//はがね

	//あく
	
	//フェアリー
	
	
	//Getters
	public  AbilityBase getTackle() {
		return tackle;
	}

	public  AbilityBase getDoubleSlap() {
		return doubleSlap;
	}

	public  AbilityBase getHyperVoice() {
		return hyperVoice;
	}

	public  AbilityBase getBubble() {
		return bubble;
	}

	public  AbilityBase getWaterGun() {
		return waterGun;
	}

	public  AbilityBase getWaterfall() {
		return waterfall;
	}

	public  AbilityBase getEmber() {
		return ember;
	}

	public  AbilityBase getFlameWheel() {
		return flameWheel;
	}

	public  AbilityBase getLeafage() {
		return leafage;
	}

	public  AbilityBase getRazorLeaf() {
		return razorLeaf;
	}

	public   AbilityBase getBulletSeed() {
		return bulletSeed;
	}

	public  AbilityBase getThunderShock() {
		return thunderShock;
	}

	public  AbilityBase getThunderbolt() {
		return thunderbolt;
	}

	public  AbilityBase getIceBeam() {
		return iceBeam;
	}

	public  AbilityBase getDoubleKick() {
		return doubleKick;
	}

	public  AbilityBase getMudSlap() {
		return mudSlap;
	}

	public  AbilityBase getDragonPulse() {
		return dragonPulse;
	}
	
}
