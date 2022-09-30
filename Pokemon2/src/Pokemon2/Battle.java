package Pokemon2;



public class Battle {

	private int myAbility = 0;
	private int rivalAbility = 0;
	private int num = 0;

	//�����Ƒ���̃|�P�����ƋZ�̃X�e�[�^�X��ϐ��Ƃ��Ă���
	//�����̃|�P����
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
	

	//����̃|�P����
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
	public void select(int waza, String poke, int r) {//�����Ƃ��ċZ�I�������Ƃ��̔ԍ��ƃ|�P�����̖��O���Ƃ�
		
		if (r == 1) {
			waza = (int)(Math.random()*4)+1;//����̃|�P�����������Ƃ��̓����_���ŋZ�ԍ��̏�����
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
			//����̃|�P����
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
			System.out.println(myPoke.getAbilityName(myAbility) + "��I�т܂���");
			System.out.println("--------------------");
			//�����̃|�P����
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
		System.out.println(myPN + "��" + myAN + "!");
		
		//�������̔���
		hitRate = (int)(Math.random()*100)+1;
		if(myAHR >= hitRate) {
			TypeRelation relation = new TypeRelation(myAT, rivalPT1, rivalPT2);
			//������U�����ǂ����̔���
			if (myAR == true) {//������U���̓���
				RepeatAttack repeat = new RepeatAttack(myPoke, rivalPoke);
				
				damage = repeat.myCalc(myA, myAP, myPT1, myPT2, myAT);
			}
			else {//�ʏ�U���̓���
				//��{�̃_���[�W�v�Z
				damage = (myA * myAP) - rivalB;
				
				//�^�C�v��v�Ȃ�΃_���[�W�𑝉�
				if (myPT1 == myAT || myPT2 == myAT) {
					damage *= 1.5;
				}
				
				//�^�C�v�����̕]�����|����
				damage *= relation.getResult() ; 
				
				//�}�����̃_���[�W�v�Z
				int critical = (int)(Math.random()*16);
				
				if(critical == 0) {
					damage *= 1.5;
					System.out.println("���イ����ɂ�������!");
				}
				
				//�_���[�W�̗����v�Z
				damage *= (100 -(double)(Math.random() *16 ) )/100;
			}
			
			//�_���[�W�̕\��
			System.out.println("�����" + rivalPN + "��" + (int)damage+ "�̃_���[�W");
			
			///
		}
		else {
			damage = 0;
			System.out.println(myPN + "�̍U���͊O�ꂽ!!");
		}
		
		
		//HP����_���[�W������
		this.rivalH -= (int)damage;
		System.out.println("�c��HP" + this.rivalH);
		
		rivalPoke.setH(rivalH);
		/*
		//HP���O�ɂȂ����珟���̐錾
		 if(rivalH <= 0) {
			 System.out.println("�����" + rivalPN + "�͓|�ꂽ");
			 System.out.println("����Ƃ̏����ɏ�������!!");
			 int HP[] = {myHP, rivalHP};
				return HP;
		 }
		 */
		 System.out.println("----------");
		
		
		//�U�����I�������HP�����^�[��
		return this.rivalH;
	}
	
	public int rivalAttack() {
		System.out.println("�����" + rivalPN + "��" + rivalAN + "!");
		//�������̔���
		hitRate = (int)(Math.random()*100)+1;
		if(rivalAHR >= hitRate) {
			TypeRelation relation = new TypeRelation(rivalAT, myPT1, myPT2);
			//������U�����ǂ����̔���
			if (rivalAR == true) {//������U���̓���
				RepeatAttack repeat = new RepeatAttack(myPoke, rivalPoke);
				
				damage = repeat.rivalCalc(rivalA, rivalAP, rivalPT1, rivalPT2, rivalAT);
			}
			else {//�ʏ�U���̓���
			//��{�̃_���[�W�v�Z
			damage = (rivalA * rivalAP) - myB;
			
			//�^�C�v��v�Ȃ�΃_���[�W�𑝉�
			if (rivalPT1 == rivalAT || rivalPT2 == rivalAT) {
				damage *= 1.5;
			}
			
			//�^�C�v�����̕]�����|����
			damage *= relation.getResult() ; 
			
			//�}�����̃_���[�W�v�Z
			int critical = (int)(Math.random()*16);
			
			if(critical == 0) {
				damage *= 1.5;
				System.out.println("���イ����ɂ�������!");
			}
			
			//�_���[�W�̗����v�Z
			damage *= (100 -(double)(Math.random() *16 ) )/100;
			}
			System.out.println("���Ȃ���" + myPN + "��" + (int)damage + "�̃_���[�W");
			
		}
		else {
			damage = 0;
			System.out.println("�����" + rivalPN + "�̍U���͊O�ꂽ!!" );
		}
		
		//HP����_���[�W������
		this.myH -= (int)damage;
		
		System.out.println("�c��HP" + this.myH);
		myPoke.setH(myH);
		/*
		if(myH <= 0) {
			 System.out.println("���Ȃ���" + myPN + "�͓|�ꂽ");
			 System.out.println("�����ɔs��Ėڂ̑O���^���ÂɂȂ���!!");

			 int HP[] = {myHP, rivalHP};
				return HP;
		 }
		*/
		//�U�����I�������HP�����^�[��
		return this.myH;
	}

	
	
}