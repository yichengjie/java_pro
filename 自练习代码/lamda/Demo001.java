package lamda;

import java.util.ArrayList;
import java.util.List;

public class Demo001 {
	
	public static void main(String[] args) {
		int num = 10 ;
		//��ȡ����
		List <String> list = getListData(num) ;
		//��ӡ����
		pirintListData(list);
	}
	
	//��ӡlist����
	public static void  pirintListData(List<String> list){
		if(list!=null){
			list.forEach(a->{System.out.println(a);});
		}
	}
	
	//��ȡlist����
	public static List<String> getListData(int num){
		List <String> list = new ArrayList<String>() ;
		if(num <=0){
			num = 5 ;
		}
		for (int i = 0; i < num; i++) {
			list.add("info ["+i+"] ") ;
		}
		return list ;
	}

}
