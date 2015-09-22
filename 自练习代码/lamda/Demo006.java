package lamda;

import java.util.ArrayList;
import java.util.List;

public class Demo006 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>() ;
		for (int i = 0; i < 10; i++) {
			list.add(" i ["+i+"] ")	;
		}
		list.forEach(System.out::println);
	    //.stream()
	    //.filter((s) -> s.startsWith("a"))
	   //.forEach(System.out::println);
		
	}

}
