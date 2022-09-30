package Pokemon2;

import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ポケモンの選択
		//int poke = 0;
		
		Select selectMyPoke = new Select(1);
		//poke = selectMyPoke.getPoke();
		Pokemons mypoke = new Pokemons(selectMyPoke.getResult());
		String myPokeName = mypoke.getPokeName();
		System.out.println("---" + selectMyPoke.getResult() + "を選びました。");
		System.out.println("せいかく : " + mypoke.getCharactor());
		System.out.println("ステータス　　HP: " + mypoke.getH() + " こうげき: " + mypoke.getA());
		System.out.println("　　　   ぼうぎょ: " + mypoke.getB() + " すばやさ: " + mypoke.getS());
		
		//selectMyPoke.selectAbility();
		//相手のポケモン選択
		 
		Select selectRivalPoke = new Select(0);
		Pokemons rivalpoke = new Pokemons(selectRivalPoke.getResult());
		String rivalPokeName = rivalpoke.getPokeName();
		System.out.println("---" + "相手は" + selectRivalPoke.getResult() + "を選びました。");
		System.out.println("せいかく : " + rivalpoke.getCharactor());
		System.out.println("ステータスは　HP: " + rivalpoke.getH() + " こうげき: " + rivalpoke.getA());
		System.out.println("　　　   ぼうぎょ: " + rivalpoke.getB() + " すばやさ: " + rivalpoke.getS());
		
		////繰り返し
		//Battle battle = new Battle(mypoke, rivalpoke);//Battleクラスの呼び出し
		int myHP = mypoke.getH(); 
		int rivalHP = rivalpoke.getH();
		while(true) {
			
			//int waza = 0;
		//技の選択
			//waza = selectMyPoke.selectAbility(mypoke);
			//battle.select(waza, myPokeName, 0);//引数として技選択したときの番号とポケモンの名前をとる
			
		//相手の技選択
			//battle.select(waza, rivalPokeName, 1);//引数として技選択したときの番号とポケモンの名前をとる
			
			
		//ダメージ計算と結果の表示
			BattleStream stream = new BattleStream(mypoke, rivalpoke, selectMyPoke);
			int[] HPList = stream.getResult(mypoke, rivalpoke);
			myHP = HPList[0];
			rivalHP = HPList[1];
			
			if(myHP <=0 || rivalHP <= 0) {
				break;
			}
		//System.out.println(fight.getResult());
		}
		////
		
		//対戦結果の表示
		
		 if(myHP <= 0) {
		 System.out.println("あなたの" +mypoke.getPokeName() + "は倒れた");
		 System.out.println("勝負に敗れて目の前が真っ暗になった!!");
	    }
	    else {
	    System.out.println("相手の" + rivalpoke.getPokeName() + "は倒れた");
		System.out.println("相手との勝負に勝利した!!");
	    }
		//Result result = new Result();
		
		//System.out.println(result.getResult());
	}

}
