package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo004 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		//return ����ʡ�ԣ���ʱ��{}��Ҳ��ʡ��
		//Collections.sort(names,(String a,String b)->{return b.compareTo(a) ;});
		Collections.sort(names,(String a,String b)->b.compareTo(a));
		System.out.println(names);
	}

}
