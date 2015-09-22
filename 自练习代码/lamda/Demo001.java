package lamda;

import java.util.ArrayList;
import java.util.List;

public class Demo001 {
	
	public static void main(String[] args) {
		int num = 10 ;
		//获取数据
		List <String> list = getListData(num) ;
		//打印数据
		pirintListData(list);
	}
	
	//打印list数据
	public static void  pirintListData(List<String> list){
		if(list!=null){
			list.forEach(a->{System.out.println(a);});
		}
	}
	
	//获取list数据
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
