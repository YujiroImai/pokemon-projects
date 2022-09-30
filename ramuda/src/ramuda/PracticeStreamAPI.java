package ramuda;

import java.util.*;
public class PracticeStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			numbers.add((int)(Math.random()*100)+1);
		}
		
		numbers.stream().filter(i -> i >= 50).forEach(i ->System.out.print(i + ", "));
		
		
		int num =  numbers.stream().filter(i -> i >= 50).reduce((i1, i2) -> i1 + i2).get();
		
		
		System.out.println();
		System.out.println(num);
		
		System.out.println(numbers.stream().reduce(0,(i1, i2) -> i2 >= 50 ?  i1 += i2:  i1 ));
		
	
		
		System.out.println(numbers.stream().filter(i -> i >= 50).reduce((i1, i2) -> i1 + i2).get());
	}

}
