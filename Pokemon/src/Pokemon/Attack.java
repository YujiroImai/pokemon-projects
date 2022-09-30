package Pokemon;

public class Attack {

	private int HP = 0;
	/*
	private int power =0;
	private int deffence = 0;
	private int might = 0;
	*/
	private int damage = 0;
	private int dm = 0;
	public Attack(){
		
	}
	//mainPerform damage = new mainPerform();
	
	
	public  int action(int power, String atType, int might, String abType, String defType, int deffence, String repeat){
		/*
		this.power = power;
		this.might = might;
		this.deffence = deffence;
		*/
		
		//複数回攻撃の時の計算
		if (repeat.equals("true")) {
			int r = (int)(Math.random()*4)+2;
			//int dm = 0;
			for(int i = 1;  i <= r; i++) {
				
				this.dm = (power * might) - deffence;
				
				 //タイプ一致
				if (atType == abType) {
					this.dm *= 1.5;
				}
				
				//半減条件
				if(abType == defType) {
					this.dm *= 0.5;
					System.out.println("こうかはいまひとつのようだ");
				}
				else if(abType.equals("くさ") && defType.equals("ほのお")) {
					this.dm *= 0.5;
					System.out.println("こうかはいまひとつのようだ");
				}
				else if(abType.equals("ほのお") && defType.equals("みず")) {
					this.dm *= 0.5;
					System.out.println("こうかはいまひとつのようだ");
				}
				else if(abType.equals("みず") && defType.equals("くさ")) {
					this.dm *= 0.5;
					System.out.println("こうかはいまひとつのようだ");
				}
				
				//こうかはばつぐん
				if(abType.equals("くさ") && defType.equals("みず")) {
					this.dm *= 2	;
					System.out.println("こうかはばつぐんだ!!!");
				}
				else if(abType.equals("ほのお") && defType.equals("くさ")) {
					this.dm *= 2;
					System.out.println("こうかはばつぐんだ!!!");
				}
				else if(abType.equals("みず") && defType.equals("ほのお")) {
					this.dm *= 2;
					System.out.println("こうかはばつぐんだ!!!");
				}
				
				//急所時のダメージ計算
				int critical = (int)(Math.random()*16);
				
				if(critical == 0) {
					this.dm *= 2;
					System.out.println("きゅうしょにあたった!");
				}
				
				//ダメージの乱数計算
				//System.out.println((100 -(double)(Math.random() *16 ))/100);
				this.dm *= (100 -(double)(Math.random() *16 ) )/100;
				System.out.println(this.dm + " のダメージ");
				this.damage += this.dm;
				
			}
			System.out.print(r + "回あたった!!" + "合計で");
		}
		else {
			this.damage = (power * might) - deffence;
			 //タイプ一致
			if (atType == abType) {
				this.damage *= 1.5;
			}
			
			//半減条件
			if(abType == defType) {
				this.damage *= 0.5;
				System.out.println("こうかはいまひとつのようだ");
			}
			else if(abType.equals("くさ") && defType.equals("ほのお")) {
				this.damage *= 0.5;
				System.out.println("こうかはいまひとつのようだ");
			}
			else if(abType.equals("ほのお") && defType.equals("みず")) {
				this.damage *= 0.5;
				System.out.println("こうかはいまひとつのようだ");
			}
			else if(abType.equals("みず") && defType.equals("くさ")) {
				this.damage *= 0.5;
				System.out.println("こうかはいまひとつのようだ");
			}
			
			//こうかはばつぐん
			if(abType.equals("くさ") && defType.equals("みず")) {
				this.damage *= 2	;
				System.out.println("こうかはばつぐんだ!!!");
			}
			else if(abType.equals("ほのお") && defType.equals("くさ")) {
				this.damage *= 2;
				System.out.println("こうかはばつぐんだ!!!");
			}
			else if(abType.equals("みず") && defType.equals("ほのお")) {
				this.damage *= 2;
				System.out.println("こうかはばつぐんだ!!!");
			}
			
			//急所時のダメージ計算
			int critical = (int)(Math.random()*16);
			
			if(critical == 0) {
				this.damage *= 2;
				System.out.println("きゅうしょにあたった!");
			}
			
			//ダメージの乱数計算
			//System.out.println((100 -(double)(Math.random() *16 ))/100);
			this.damage *= (100 -(double)(Math.random() *16 ) )/100;
		}
		
		 
		
		return this.damage;
		
		
	}
}
