package Pokemon;

public class Ability {

	/*
	    String ability;
		int power;
		private String abilityType;
		private boolean atackRepeat;
		
	
		public String getAbility() {
			return this.ability;
		}
		
		public int getPower() {
			return this.power;
		}
		public String getAbilityType() {
			return this.abilityType;
		}
		public boolean getAtackRepeat() {
			return this.atackRepeat;
		}
		*/
	//{�Z�̖��O, �З�, �Z�̃^�C�v, ������U�����ǂ���}
	/*
	 �Z�̃^�C�v: ��֒l
	 �m�[�}���^�C�v:0
	 ����:1
	 �ق̂�:2
	 �݂�:3
	 */
	/*
	 ������U�����ǂ���:��֒l
	 ���U��:false
	 ������U��:true
	 */
	
	
	
	//�m�[�}��
	//private int[] tackle = {1, 5, 0, 0};
	private String tackle[] = {"����������", "5", "�m�[�}��", "0", "false"};
	//private int[] doubleSlap = {2, 3, 0, 1};
	private String doubleSlap[] = {"�����ӂ��r���^", "3", "�m�[�}��", "0", "true"};
	//�݂�
	//private int[] bubble = {3, 5, 3, 0};
	private String bubble[] = {"����", "5", "�݂�", "3","false"};
	//private int[] waterGun = {4, 7, 3, 0};
	private String waterGun[] = {"�݂��ł��ۂ�", "7", "�݂�", "3","false"};
	//�ق̂�
	//private int[] ember = {5, 5, 2, 0};
	private String ember[] = {"�Ђ̂�", "5", "�ق̂�", "2","false"};
	//private int[] flameWheel = {6, 7, 2, 0};
	private String flameWheel[] = {"�����񂮂��", "7", "�ق̂�", "2","false"};
	//����
	//private int[] leafage = {7, 5, 1, 0};
	private String leafage[] = {"���̂�", "5", "����", "1","false"};
	//private int[] razorLeaf = {8, 7, 1, 0};
	private String razorLeaf[] = {"�͂��σJ�b�^�[", "7", "����", "1","false"};
	
	
	public String[] getTackle() {
		return tackle;
	}
	
	public String[] getDoubleSlap() {
		return doubleSlap;
	}
	public String[] getBubble() {
		return bubble;
	}
	public String[] getWaterGun() {
		return waterGun;
	}
	public String[] getEmber() {
		return ember;
	}
	public String[] getFlameWheel() {
		return flameWheel;
	}
	
	public String[] getLeafage() {
		return leafage;
	}
	public String[] getRazorLeaf() {
		return razorLeaf;
	}
}
