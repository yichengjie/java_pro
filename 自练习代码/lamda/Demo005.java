package lamda;

import java.util.function.Function;

public class Demo005 {
	
	public static void main(String[] args) {
		
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);
		Integer ccc = toInteger.apply("123") ;
		String str = backToString.apply("123");     // "123"
		System.out.println(ccc + " " + str );
		
	}

}
