package Pokemon2;

import java.util.*;
import java.io.*;

public class Select {
	Scanner scan = new Scanner(System.in);
	private String name= "";
	int poke;
	private Pokemons mypoke;
	public  Select(int i) {	

		if(i == 1) {
			while(true) {
				System.out.println("以下からポケモンを選んで番号を入力してください");
				System.out.print("1: ポッチャマ　2:　ヒコザル　3:　ナエトル 4: ムックル-->>");
				try {
					poke = scan.nextInt();
				}
				catch(InputMismatchException e){
					 ;
				}
				System.out.println(poke);
				if (poke >= 1 && poke <= 4) {
					break;
				}
				else {
					System.out.println("正しいポケモンの番号を入力してください");
				}
			}
		}
		else {
			poke = (int)(Math.random()*4)+1;
		}
		if (poke == 3) {
			name = "ナエトル";
		}
		else if(poke == 2) {
			name = "ヒコザル";
		}
		else if(poke == 1){
			name = "ポッチャマ";
		}	
		else if (poke == 4) {
			name ="ムックル";
		}

	}
	//Pokemons mypoke = new Pokemons();

	public String getResult() {
		return name;
	}

	public int getPoke() {
		return poke;
	}

	//覚えさせる技の選択
	//public void selectAbility(){
	//
	//}
	//

	int waza = 0;
	public int selectAbility(Pokemons mypoke) {
		this.mypoke = mypoke;

		while(true) {
			System.out.println("技を選んで番号を入力してください");
			System.out.println("1: " + mypoke.getAbilityName(0) + " 2: "+ mypoke.getAbilityName(1) );		
			System.out.print("3: " + mypoke.getAbilityName(2) + " 4: "+ mypoke.getAbilityName(3) + " -->>");
			try {

				waza = scan.nextInt();
			}
			catch(InputMismatchException e){
				scan.next();
			}
			if (waza >= 1 && waza <= 4) {
				break;
			}
			else {
				System.out.println("正しい技の番号を入力してください");
			}
		}
		return waza;
	}
}
