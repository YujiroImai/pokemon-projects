package Pokemon2;

public class Charactor {

	private String charactor ="";
	private int id = 0;
	private int A = 0;
	private int B = 0;
	private int S = 0;
	
	//id 1 まじめ
		//id 2 がんばりや
		//id 3 さみしがり　A+2, B-2
		//id 4 ゆうかん A+2, S-2
		//id 5 ずぶとい B+2, A-2
		//id 6 のんき  B+2, S-2
		//id 7 おくびょう S+2, A-2
		//id 8せっかち S+2, B-2
	
	public Charactor(int originalA, int originalB, int originalS) {
		id = (int)(Math.random()*8)+1;
		//まじめ
		if (id == 1) {
			charactor = "まじめ";
			A = originalA;
			B = originalB;
			S = originalS;
		}
		//がんばりや
		else if (id == 2) {
			charactor = "がんばりや";
			A = originalA;
			B = originalB;
			S = originalS;
		}
		//さみしがり
		else if (id == 3) {
			charactor = "さみしがり";
			A = originalA + 2;
			B = originalB - 2;
			S = originalS;
		}
		//ゆうかん
		else if (id == 4) {
			charactor = "ゆうかん";
			A = originalA + 2;
			B = originalB;
			S = originalS - 2;
		}
		//ゆうかん
		else if (id == 5) {
			charactor = "ずぶとい";
			A = originalA - 2;
			B = originalB + 2;
			S = originalS;
		}
		//のんき
		else if (id == 6) {
			charactor = "のんき";
			A = originalA;
			B = originalB + 2;
			S = originalS - 2;
		}
		//おくびょう
		else if (id == 7) {
			charactor = "おくびょう";
			A = originalA - 2;
			B = originalB;
			S = originalS + 2;
		}
		//せっかち
		else if (id == 8) {
			charactor = "せっかち";
			A = originalA;
			B = originalB - 2;
			S = originalS + 2;
		}
	
	}
	
	//それぞれのA　と　B　と　S　をかえす
	
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
