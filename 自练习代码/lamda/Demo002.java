package lamda;
import java.util.ArrayList;
import java.util.List;

public class Demo002 {
	public static void main(String[] args) {
		int split = 5 ;
		List<Integer> list = initData() ;
		List<Integer> list2 = findLarger(list, split) ;
		list2.forEach(a->{System.out.println(a);});
		
	}
	
	
	public static List<Integer> initData(){
		List<Integer> list = new ArrayList<Integer>() ;
		for (int i = 0; i < 10; i++) {
			list.add(i) ;
		}
		return list ;
	}
	
	public static List<Integer> findLarger(List<Integer> list ,Integer split){
		List<Integer> tmp = new ArrayList<Integer>() ;
		list.stream().filter(a->{return a > split;}).forEach(a->{tmp.add(a);}); 
		//移除部分数据
		tmp.removeIf(a-> a - split>2) ;
		return tmp ;
	}

}
