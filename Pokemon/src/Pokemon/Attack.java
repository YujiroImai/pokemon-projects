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
		
		//������U���̎��̌v�Z
		if (repeat.equals("true")) {
			int r = (int)(Math.random()*4)+2;
			//int dm = 0;
			for(int i = 1;  i <= r; i++) {
				
				this.dm = (power * might) - deffence;
				
				 //�^�C�v��v
				if (atType == abType) {
					this.dm *= 1.5;
				}
				
				//��������
				if(abType == defType) {
					this.dm *= 0.5;
					System.out.println("�������͂��܂ЂƂ̂悤��");
				}
				else if(abType.equals("����") && defType.equals("�ق̂�")) {
					this.dm *= 0.5;
					System.out.println("�������͂��܂ЂƂ̂悤��");
				}
				else if(abType.equals("�ق̂�") && defType.equals("�݂�")) {
					this.dm *= 0.5;
					System.out.println("�������͂��܂ЂƂ̂悤��");
				}
				else if(abType.equals("�݂�") && defType.equals("����")) {
					this.dm *= 0.5;
					System.out.println("�������͂��܂ЂƂ̂悤��");
				}
				
				//�������͂΂���
				if(abType.equals("����") && defType.equals("�݂�")) {
					this.dm *= 2	;
					System.out.println("�������͂΂���!!!");
				}
				else if(abType.equals("�ق̂�") && defType.equals("����")) {
					this.dm *= 2;
					System.out.println("�������͂΂���!!!");
				}
				else if(abType.equals("�݂�") && defType.equals("�ق̂�")) {
					this.dm *= 2;
					System.out.println("�������͂΂���!!!");
				}
				
				//�}�����̃_���[�W�v�Z
				int critical = (int)(Math.random()*16);
				
				if(critical == 0) {
					this.dm *= 2;
					System.out.println("���イ����ɂ�������!");
				}
				
				//�_���[�W�̗����v�Z
				//System.out.println((100 -(double)(Math.random() *16 ))/100);
				this.dm *= (100 -(double)(Math.random() *16 ) )/100;
				System.out.println(this.dm + " �̃_���[�W");
				this.damage += this.dm;
				
			}
			System.out.print(r + "�񂠂�����!!" + "���v��");
		}
		else {
			this.damage = (power * might) - deffence;
			 //�^�C�v��v
			if (atType == abType) {
				this.damage *= 1.5;
			}
			
			//��������
			if(abType == defType) {
				this.damage *= 0.5;
				System.out.println("�������͂��܂ЂƂ̂悤��");
			}
			else if(abType.equals("����") && defType.equals("�ق̂�")) {
				this.damage *= 0.5;
				System.out.println("�������͂��܂ЂƂ̂悤��");
			}
			else if(abType.equals("�ق̂�") && defType.equals("�݂�")) {
				this.damage *= 0.5;
				System.out.println("�������͂��܂ЂƂ̂悤��");
			}
			else if(abType.equals("�݂�") && defType.equals("����")) {
				this.damage *= 0.5;
				System.out.println("�������͂��܂ЂƂ̂悤��");
			}
			
			//�������͂΂���
			if(abType.equals("����") && defType.equals("�݂�")) {
				this.damage *= 2	;
				System.out.println("�������͂΂���!!!");
			}
			else if(abType.equals("�ق̂�") && defType.equals("����")) {
				this.damage *= 2;
				System.out.println("�������͂΂���!!!");
			}
			else if(abType.equals("�݂�") && defType.equals("�ق̂�")) {
				this.damage *= 2;
				System.out.println("�������͂΂���!!!");
			}
			
			//�}�����̃_���[�W�v�Z
			int critical = (int)(Math.random()*16);
			
			if(critical == 0) {
				this.damage *= 2;
				System.out.println("���イ����ɂ�������!");
			}
			
			//�_���[�W�̗����v�Z
			//System.out.println((100 -(double)(Math.random() *16 ))/100);
			this.damage *= (100 -(double)(Math.random() *16 ) )/100;
		}
		
		 
		
		return this.damage;
		
		
	}
}
