package Pokemon2;

public class Charactor {

	private String charactor ="";
	private int id = 0;
	private int A = 0;
	private int B = 0;
	private int S = 0;
	
	//id 1 �܂���
		//id 2 ����΂��
		//id 3 ���݂�����@A+2, B-2
		//id 4 �䂤���� A+2, S-2
		//id 5 ���ԂƂ� B+2, A-2
		//id 6 �̂�  B+2, S-2
		//id 7 �����т傤 S+2, A-2
		//id 8�������� S+2, B-2
	
	public Charactor(int originalA, int originalB, int originalS) {
		id = (int)(Math.random()*8)+1;
		//�܂���
		if (id == 1) {
			charactor = "�܂���";
			A = originalA;
			B = originalB;
			S = originalS;
		}
		//����΂��
		else if (id == 2) {
			charactor = "����΂��";
			A = originalA;
			B = originalB;
			S = originalS;
		}
		//���݂�����
		else if (id == 3) {
			charactor = "���݂�����";
			A = originalA + 2;
			B = originalB - 2;
			S = originalS;
		}
		//�䂤����
		else if (id == 4) {
			charactor = "�䂤����";
			A = originalA + 2;
			B = originalB;
			S = originalS - 2;
		}
		//�䂤����
		else if (id == 5) {
			charactor = "���ԂƂ�";
			A = originalA - 2;
			B = originalB + 2;
			S = originalS;
		}
		//�̂�
		else if (id == 6) {
			charactor = "�̂�";
			A = originalA;
			B = originalB + 2;
			S = originalS - 2;
		}
		//�����т傤
		else if (id == 7) {
			charactor = "�����т傤";
			A = originalA - 2;
			B = originalB;
			S = originalS + 2;
		}
		//��������
		else if (id == 8) {
			charactor = "��������";
			A = originalA;
			B = originalB - 2;
			S = originalS + 2;
		}
	
	}
	
	//���ꂼ���A�@�Ɓ@B�@�Ɓ@S�@��������
	
	public int getA() {
		return A;
	}
	
	public int getB() {
		return B;
	}
	
	public int getS() {
		return S;
	}
	
	public String getCharactor() {
		return charactor;
	}
	
}
