package Pokemon;

import java.io.*;
import java.util.*;

public class mainPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ポケモンを選択
		int poke = 0;
		String str = "" ;
		while(true) {
			System.out.println("以下からポケモンを選んで番号を入力してください");
			System.out.print("1: ポッチャマ　2:　ヒコザル　3:　ナエトル -->>");
			Scanner scan = new Scanner(System.in);
			poke = scan.nextInt();
			
			if (poke >= 1 && poke <= 3) {
				 
				if (poke == 3) {
					str = "ナエトル";
				}
				else if(poke == 2) {
					str = "ヒコザル";
				}
				else {
					str = "ポッチャマ";
				}
				
				break;
			}else {
				System.out.println("正しいポケモンの名前を入力してください");
			}
		}
		Pokemons mypoke = new Pokemons(str);
		
		System.out.println("あなたのポケモンは" + mypoke.getPokeName()+"です");
		System.out.println("---------");
		//相手CPUもポケモンをランダムで選択
		int ran = (int)(Math.random()*3)+1;
		String epoke = "" ; 
		if (ran == 1) {
			epoke = "ナエトル";
		}
		else if(ran == 2) {
			epoke = "ヒコザル";
		}
		else {
			epoke = "ポッチャマ";
		}
		
		Pokemons enemypoke = new Pokemons(epoke);
		System.out.println("相手のポケモンは" + epoke + "です。");
		System.out.println("--------------------");
		
		Attack ac = new Attack();
		int myHP = mypoke.getH();
		int eHP = enemypoke.getH();
		
		//技の選択と攻撃のループの開始
		while(true) {
		//技を選択
		int waza;
		while(true) {
			System.out.println("技を選んで番号を入力してください");
			System.out.println("1: " + mypoke.getAbility1(0) + " 2: "+ mypoke.getAbility2(0) );
			System.out.print("3: " + mypoke.getAbility3(0) + " 4: "+ mypoke.getAbility4(0) + " -->>");
			Scanner sc = new Scanner(System.in);
			waza = sc.nextInt();

			if (waza >= 1 && waza <= 4) {
				break;
			}else {
				System.out.println("正しい技の番号を入力してください");
			}
		}
		
		 ArrayList<String> selectAbility = new ArrayList<String>();
		 
		if(waza ==1) {
			selectAbility = new ArrayList<String>(mypoke.getAbility1());
		}
		else if(waza == 2) {
			selectAbility = new ArrayList<String>(mypoke.getAbility2());
		}
		else if(waza == 3) {
			selectAbility = new ArrayList<String>(mypoke.getAbility3());
		}
		else {
			selectAbility = new ArrayList<String>(mypoke.getAbility4());
		}
		System.out.println(selectAbility.get(0) + "を選びました");
		System.out.println("--------------------");
		
		//相手が技をランダムで選択
		
		int eWaza = (int)(Math.random() * 3) + 1 ;
		ArrayList<String> enemyAbility = new ArrayList<String>();
		 
		if(eWaza == 1) {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility1());
		}
		else if(eWaza == 2) {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility2());
		}
		else if(eWaza == 3) {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility3());
		}
		else {
			enemyAbility = new ArrayList<String>(enemypoke.getAbility4());
		}
		
		//両者のすばやさを比較して早いほうが先に攻撃 Actionクラスとの連携
		int damage = 0;
		if(mypoke.getS() >= enemypoke.getS()) {
			System.out.println(mypoke.getPokeName() + "の" + selectAbility.get(0) + "!");
			damage =  ac.action(mypoke.getA(), mypoke.getType(), Integer.parseInt(selectAbility.get(1)), selectAbility.get(2), enemypoke.getType(), enemypoke.getB(), selectAbility.get(4));
			System.out.println("相手の" + enemypoke.getPokeName() + "に" + damage + "のダメージ!");
			eHP -= damage;
			enemypoke.setH(eHP) ;
			if(eHP <= 0) {
				System.out.println("相手の" + enemypoke.getPokeName() + "は倒れた");
				System.out.println("勝負に勝った!!");
				break;
			}
			System.out.println("----------");
			System.out.println("相手の" + enemypoke.getPokeName() + "の" + enemyAbility.get(0) + "!");
			damage =ac.action(enemypoke.getA(), enemypoke.getType(),Integer.parseInt(enemyAbility.get(1)), enemyAbility.get(2), mypoke.getType(), mypoke.getB(), enemyAbility.get(4));
			System.out.println( mypoke.getPokeName() + "に" + damage + "のダメージ!");
			myHP -= damage;
			 mypoke.setH(myHP);
			 System.out.println("--------------------");
			 if(myHP <= 0) {
				 System.out.println("あなたの" + mypoke.getPokeName() + "は倒れた");
				 System.out.println("勝負に負けて目の前が真っ暗になった!!");
				 break;
			 }
				
 		}
		else if(mypoke.getS() < enemypoke.getS()) {
			 System.out.println("相手の" +enemypoke.getPokeName() + "の" + enemyAbility.get(0) + "!");
			 damage =ac.action(enemypoke.getA(), enemypoke.getType(),Integer.parseInt(enemyAbility.get(1)), enemyAbility.get(2), mypoke.getType(), mypoke.getB(), enemyAbility.get(4));
			 System.out.println(mypoke.getPokeName() + "に" + damage + "のダメージ!");
			 myHP -= damage;
			 mypoke.setH(myHP);
			 if(myHP <= 0) {
				 System.out.println("あなたの" + mypoke.getPokeName() + "は倒れた");
				 System.out.println("勝負に負けて目の前が真っ暗になった!!");
				 break;
			 }
			 System.out.println("----------");
			 System.out.println(mypoke.getPokeName() + "の" + selectAbility.get(0) + "!");
			 damage =  ac.action(mypoke.getA(), mypoke.getType(), Integer.parseInt(selectAbility.get(1)), selectAbility.get(2), enemypoke.getType(), enemypoke.getB(), selectAbility.get(4));
			 System.out.println("相手の" + enemypoke.getPokeName() + "に" + damage + "のダメージ!");
			 eHP -= damage;
			 enemypoke.setH(eHP) ;
			 System.out.println("--------------------");
			 if(eHP <= 0) {
					System.out.println("相手の" + enemypoke.getPokeName() + "は倒れた");
					System.out.println("勝負に勝った!!");
					break;
				}
			 
		}
	}	
		
		
		//結果の表示
	}

}
