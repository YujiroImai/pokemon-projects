package Pokemon2;

public class BattleStream {

	private int myS =0;
	private int myHP = 0;
	
	private int rivalS =0;
	private int rivalHP = 0;
	private Pokemons mypoke, rivalpoke;
	private Battle battle;
	private int waza = 0;
	
	public BattleStream(Pokemons mypoke, Pokemons rivalpoke, Select selectMyPoke) {
		this.mypoke = mypoke;
		this.rivalpoke = rivalpoke;
		this.myHP = mypoke.getH();
		this.myS = mypoke.getS();
		this.rivalHP = rivalpoke.getH();
		this.rivalS = rivalpoke.getS();
		this.battle = new Battle(mypoke, rivalpoke);
		
		this.waza = selectMyPoke.selectAbility(mypoke);
		battle.select(waza, mypoke.getPokeName(), 0);
		battle.select(waza, rivalpoke.getPokeName(), 1);
	}
	public int[] getResult(Pokemons mypoke, Pokemons rivalpoke) {
		//Battle stream = new Battle(mypoke, rivalpoke);
		
		if (myS == rivalS) {
			int random = (int)(Math.random()*2);
			if(random == 0) {
				myS += 1;
			}
			else {
				rivalS += 1;
			}
		}
		
		if (myS > rivalS) {
			//自分の攻撃
			rivalHP = battle.myAttack();
			if(rivalHP <= 0) {
				 int HP[] = {myHP, rivalHP};
					return HP;
			 }
			//敵の攻撃
			myHP = battle.rivalAttack();
			if(myHP <= 0) {
				 int HP[] = {myHP, rivalHP};
					return HP;
			 }
			
			///
			if (myS > mypoke.getS()) {
				myS --; //すばやさが同じだった場合の戻す処理
			}
		}
		else {
			//敵の攻撃
			myHP = battle.rivalAttack();
			if(myHP <= 0) {
				 int HP[] = {myHP, rivalHP};
					return HP;
			 }
			//自分の攻撃
			rivalHP = battle.myAttack();
			if(rivalHP <= 0) {
				 int HP[] = {myHP, rivalHP};
					return HP;
			 }
			
			if (rivalS > rivalpoke.getS()) {
				rivalS --; //すばやさが同じだった場合の戻す処理
			}
		}
		int[] HP = {myHP, rivalHP};
		return HP;
	}
		
	}
	
	
