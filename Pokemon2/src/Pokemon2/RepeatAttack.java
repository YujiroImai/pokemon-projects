package Pokemon2;

public class RepeatAttack extends Battle{

	TypeRelation relation = new TypeRelation(myAT, rivalPT1, rivalPT2);
	public RepeatAttack(Pokemons mypoke, Pokemons rivalpoke){
		super(mypoke, rivalpoke);
	}
	
	//�����̋Z��������U���������Ƃ�
	
	public double myCalc(int myA, int myAP, String myPT1, String myPT2, String myAT) {
	
		int dm =0;
		int rep = (int)(Math.random()*2)+3;
		for(int i = 1; i <= rep; i++) {
			
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
		
		System.out.println((int)damage + "�̃_���[�W");
		dm +=damage;
		}
		System.out.println(rep + "�񓖂�����!");
		System.out.print("���v��");
		return dm;
	}	
	
	
	//����̋Z��������U���������Ƃ�
	public double rivalCalc(int rivalA, int rivalAP, String rivalPT1, String rivalPT2, String rivalAT) {
		int dm = 0;
		int rep = (int)(Math.random()*2)+3;
		for(int i = 1; i <= rep; i++) {
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
			//�_���[�W�̗����v�Z
			damage *= (100 -(double)(Math.random() *16 ) )/100;
		}
		
		System.out.println((int)damage + "�̃_���[�W");
		dm += damage;
		}
		System.out.println(rep + "�񓖂�����!");
		System.out.print("���v��");
		return dm;
}
}
