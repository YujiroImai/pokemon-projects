package Pokemon2;



public class Battle {

	private int myAbility = 0;
	private int rivalAbility = 0;
	private int num = 0;

	//自分と相手のポケモンと技のステータスを変数としておく
	//自分のポケモン
	public String myPN = "";
	public String myPT1 = "";
	public String myPT2 = "";
	public int myH = 0;
	public int myA = 1;
	public int myB = 0;
	public int myS = 0;
	public String myAN = "";
	public String myAT = "";
	public int myAP =  0;
	public boolean myAR;
	public int myAHR;
	

	//相手のポケモン
	public String rivalPN = "";
	public String rivalPT1 = "";
	public String rivalPT2 = "";
	public int rivalH = 0;
	public int rivalA = 0;
	public int rivalB = 0;
	public int rivalS = 0;
	public String rivalAN = "";
	public String rivalAT = "";
	public int rivalAP = 0;
	public boolean rivalAR ;
	public int rivalAHR;
	public Pokemons myPoke, rivalPoke;
	
	
	public Battle(Pokemons mypoke, Pokemons rivalpoke) {
		this.myPoke = mypoke;
		this.rivalPoke = rivalpoke;
	}
	public void select(int waza, String poke, int r) {//引数として技選択したときの番号とポケモンの名前をとる
		
		if (r == 1) {
			waza = (int)(Math.random()*4)+1;//相手のポケモンだったときはランダムで技番号の書き換
		}
		if(waza ==1) {
			num = 0;
		}
		else if(waza == 2) {
			num = 1;
		}
		else if(waza == 3) {
			num = 2;
		}
		else {
			num = 3;
		}
		if (r==1) {
			rivalAbility = num;
			//相手のポケモン
			rivalPN = rivalPoke.getPokeName();
			rivalPT1 = rivalPoke.getType1();
			rivalPT2 = rivalPoke.getType2();
			rivalH = rivalPoke.getH();
			rivalA = rivalPoke.getA();
			rivalB = rivalPoke.getB();
			rivalS = rivalPoke.getS();
			rivalAN = rivalPoke.getAbilityName(rivalAbility);
			rivalAT = rivalPoke.getAbilityType(rivalAbility);
			rivalAP = rivalPoke.getAbilityPower(rivalAbility);
			rivalAR = rivalPoke.getAttackRepeat(rivalAbility);
			rivalAHR = rivalPoke.getAbilityHitRate(rivalAbility);
			//System.out.println(rivalPoke.getCharactor());
			
		}
		else if (r == 0) {
			myAbility = num;
			System.out.println(myPoke.getAbilityName(myAbility) + "を選びました");
			System.out.println("--------------------");
			//自分のポケモン
			myPN = myPoke.getPokeName();
			myPT1 = myPoke.getType1();
			myPT2 = myPoke.getType2();
		 	myH = myPoke.getH();
			myA = myPoke.getA();
			myB = myPoke.getB();
			myS = myPoke.getS();
			myAN = myPoke.getAbilityName(myAbility);
			myAT = myPoke.getAbilityType(myAbility);
			myAP = myPoke.getAbilityPower(myAbility);
			myAR = myPoke.getAttackRepeat(myAbility);
			myAHR = myPoke.getAbilityHitRate(myAbility);
			//System.out.println(myPoke.getCharactor());
		}
		
	}
	
	double damage = 0;
	int hitRate = 0;
	//---------------------------------------------------------
	public int myAttack() {
		System.out.println(myPN + "の" + myAN + "!");
		
		//命中率の判定
		hitRate = (int)(Math.random()*100)+1;
		if(myAHR >= hitRate) {
			TypeRelation relation = new TypeRelation(myAT, rivalPT1, rivalPT2);
			//複数回攻撃かどうかの判定
			if (myAR == true) {//複数回攻撃の動作
				RepeatAttack repeat = new RepeatAttack(myPoke, rivalPoke);
				
				damage = repeat.myCalc(myA, myAP, myPT1, myPT2, myAT);
			}
			else {//通常攻撃の動作
				//基本のダメージ計算
				damage = (myA * myAP) - rivalB;
				
				//タイプ一致ならばダメージを増加
				if (myPT1 == myAT || myPT2 == myAT) {
					damage *= 1.5;
				}
				
				//タイプ相性の評価を掛ける
				damage *= relation.getResult() ; 
				
				//急所時のダメージ計算
				int critical = (int)(Math.random()*16);
				
				if(critical == 0) {
					damage *= 1.5;
					System.out.println("きゅうしょにあたった!");
				}
				
				//ダメージの乱数計算
				damage *= (100 -(double)(Math.random() *16 ) )/100;
			}
			
			//ダメージの表示
			System.out.println("相手の" + rivalPN + "に" + (int)damage+ "のダメージ");
			
			///
		}
		else {
			damage = 0;
			System.out.println(myPN + "の攻撃は外れた!!");
		}
		
		
		//HPからダメージを引く
		this.rivalH -= (int)damage;
		System.out.println("残りHP" + this.rivalH);
		
		rivalPoke.setH(rivalH);
		/*
		//HPが０になったら勝利の宣言
		 if(rivalH <= 0) {
			 System.out.println("相手の" + rivalPN + "は倒れた");
			 System.out.println("相手との勝負に勝利した!!");
			 int HP[] = {myHP, rivalHP};
				return HP;
		 }
		 */
		 System.out.println("----------");
		
		
		//攻撃が終わったらHPをリターン
		return this.rivalH;
	}
	
	public int rivalAttack() {
		System.out.println("相手の" + rivalPN + "の" + rivalAN + "!");
		//命中率の判定
		hitRate = (int)(Math.random()*100)+1;
		if(rivalAHR >= hitRate) {
			TypeRelation relation = new TypeRelation(rivalAT, myPT1, myPT2);
			//複数回攻撃かどうかの判定
			if (rivalAR == true) {//複数回攻撃の動作
				RepeatAttack repeat = new RepeatAttack(myPoke, rivalPoke);
				
				damage = repeat.rivalCalc(rivalA, rivalAP, rivalPT1, rivalPT2, rivalAT);
			}
			else {//通常攻撃の動作
			//基本のダメージ計算
			damage = (rivalA * rivalAP) - myB;
			
			//タイプ一致ならばダメージを増加
			if (rivalPT1 == rivalAT || rivalPT2 == rivalAT) {
				damage *= 1.5;
			}
			
			//タイプ相性の評価を掛ける
			damage *= relation.getResult() ; 
			
			//急所時のダメージ計算
			int critical = (int)(Math.random()*16);
			
			if(critical == 0) {
				damage *= 1.5;
				System.out.println("きゅうしょにあたった!");
			}
			
			//ダメージの乱数計算
			damage *= (100 -(double)(Math.random() *16 ) )/100;
			}
			System.out.println("あなたの" + myPN + "に" + (int)damage + "のダメージ");
			
		}
		else {
			damage = 0;
			System.out.println("相手の" + rivalPN + "の攻撃は外れた!!" );
		}
		
		//HPからダメージを引く
		this.myH -= (int)damage;
		
		System.out.println("残りHP" + this.myH);
		myPoke.setH(myH);
		/*
		if(myH <= 0) {
			 System.out.println("あなたの" + myPN + "は倒れた");
			 System.out.println("勝負に敗れて目の前が真っ暗になった!!");

			 int HP[] = {myHP, rivalHP};
				return HP;
		 }
		*/
		//攻撃が終わったらHPをリターン
		return this.myH;
	}

	
	
}