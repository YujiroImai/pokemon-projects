package Ability;

public class AbilityTable implements Ability{

	//�m�[�}��
	private  AbilityBase tackle = new AbilityBase("����������",5,"�m�[�}��",false);
	private  AbilityBase doubleSlap = new AbilityBase("�����ӂ��т�",3,"�m�[�}��",true);
	private  AbilityBase hyperVoice = new AbilityBase("�n�C�p�[�{�C�X",8,"�m�[�}��",false);
	//�݂�
	private  AbilityBase bubble = new AbilityBase("����",5,"�݂�",false);
	private  AbilityBase waterGun = new AbilityBase("�݂��ł��ۂ�",7,"�݂�",false);
	private  AbilityBase waterfall = new AbilityBase("�����̂ڂ�",8,"�݂�",false);
			
	//�ق̂�
	private  AbilityBase ember = new AbilityBase("�Ђ̂�",5,"�ق̂�",false);
	private  AbilityBase flameWheel = new AbilityBase("�����񂮂��",7,"�ق̂�",false);
	
	//����
	private  AbilityBase leafage = new AbilityBase("���̂�",5,"����",false);
	private  AbilityBase razorLeaf = new AbilityBase("�͂��σJ�b�^�[",7,"����",false);
	private  AbilityBase bulletSeed = new AbilityBase("�^�l�}�V���K��",3,"����",true);

	//�ł�
	private  AbilityBase thunderShock = new AbilityBase("�ł񂫃V���b�N",5,"�ł�",false);
	private  AbilityBase thunderbolt = new AbilityBase("10�܂�{���g",8,"�ł�",false);
	
	//������
	private  AbilityBase iceBeam = new AbilityBase("�ꂢ�Ƃ��r�[��",8,"������",false);
	
	//�����Ƃ�
	private  AbilityBase doubleKick = new AbilityBase("�ɂǂ���",3,"�����Ƃ�",true);
	//�ǂ�
	
	//���߂�
	private  AbilityBase mudSlap = new AbilityBase("�ǂ납��",5,"���߂�",false);
	//�Ђ���
	
	//�G�X�p�[
	
	//�ނ�
	
	//����
	
	//�S�[�X�g
	
	//�h���S��
	private  AbilityBase dragonPulse = new AbilityBase("��イ�̂͂ǂ�",9,"�h���S��",false);
	//�͂���

	//����
	
	//�t�F�A���[
	
	
	//Getters
	public  AbilityBase getTackle() {
		return tackle;
	}

	public  AbilityBase getDoubleSlap() {
		return doubleSlap;
	}

	public  AbilityBase getHyperVoice() {
		return hyperVoice;
	}

	public  AbilityBase getBubble() {
		return bubble;
	}

	public  AbilityBase getWaterGun() {
		return waterGun;
	}

	public  AbilityBase getWaterfall() {
		return waterfall;
	}

	public  AbilityBase getEmber() {
		return ember;
	}

	public  AbilityBase getFlameWheel() {
		return flameWheel;
	}

	public  AbilityBase getLeafage() {
		return leafage;
	}

	public  AbilityBase getRazorLeaf() {
		return razorLeaf;
	}

	public   AbilityBase getBulletSeed() {
		return bulletSeed;
	}

	public  AbilityBase getThunderShock() {
		return thunderShock;
	}

	public  AbilityBase getThunderbolt() {
		return thunderbolt;
	}

	public  AbilityBase getIceBeam() {
		return iceBeam;
	}

	public  AbilityBase getDoubleKick() {
		return doubleKick;
	}

	public  AbilityBase getMudSlap() {
		return mudSlap;
	}

	public  AbilityBase getDragonPulse() {
		return dragonPulse;
	}
	
}
