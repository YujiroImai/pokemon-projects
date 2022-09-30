package Pokemon2;

public class RepeatAttack extends Battle{

	TypeRelation relation = new TypeRelation(myAT, rivalPT1, rivalPT2);
	public RepeatAttack(Pokemons mypoke, Pokemons rivalpoke){
		super(mypoke, rivalpoke);
	}
	
	//自分の技が複数回攻撃だったとき
	
	public double myCalc(int myA, int myAP, String myPT1, String myPT2, String myAT) {
	
		int dm =0;
		int rep = (int)(Math.random()*2)+3;
		for(int i = 1; i <= rep; i++) {
			
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
		
		System.out.println((int)damage + "のダメージ");
		dm +=damage;
		}
		System.out.println(rep + "回当たった!");
		System.out.print("合計で");
		return dm;
	}	
	
	
	//相手の技が複数回攻撃だったとき
	public double rivalCalc(int rivalA, int rivalAP, String rivalPT1, String rivalPT2, String rivalAT) {
		int dm = 0;
		int rep = (int)(Math.random()*2)+3;
		for(int i = 1; i <= rep; i++) {
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
			//ダメージの乱数計算
			damage *= (100 -(double)(Math.random() *16 ) )/100;
		}
		
		System.out.println((int)damage + "のダメージ");
		dm += damage;
		}
		System.out.println(rep + "回当たった!");
		System.out.print("合計で");
		return dm;
}
}
