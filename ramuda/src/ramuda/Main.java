package ramuda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> list = new ArrayList<String>() ;

		list.add("orange");
		list.add("banana");
		list.add("apple");

		list.forEach(str -> System.out.println(str));
		//		list.forEach(new Consumer<String>(){
		//			
		//			public void accept(String str) {
		//				System.out.println(str);
		//			}	
		//		});

		long num = list.stream().filter(str -> str.length() > 5).count();

		//		long num = list.stream().filter(new Predicate<String>() {
		//			public boolean test(String str) {
		//			return str.length() > 5;
		//			}
		//		}).count();

		System.out.println(num);

		list.stream().map(str -> str.length()).forEach(System.out::println);
		
//		list.stream().map(new Function<String>() {
//			public Integer apply(String str) {
//				return str.length();
//			}
//		}).forEach(System.out::println);
		
		list.stream().sorted((str1, str2) -> str2.compareTo(str1) ).forEach(System.out::println);
		
		list.stream().reduce((str1, str2) -> str1 + str2).get();
		
		//System.out.println(a);
	}




}


