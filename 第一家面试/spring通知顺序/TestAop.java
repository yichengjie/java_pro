package spring֪ͨ˳��;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	static ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring֪ͨ˳��/ApplicationContext.xml") ;
	static AService as = (AService)context.getBean("aService") ;
	static BServiceImpl bs = (BServiceImpl)context.getBean("bService") ;
	
	
	public static void main(String[] args) {
		//����1() ;
		//����2() ;
		//����3() ;
		����4() ;
	}
	
	//������--�쳣����
	public static void ����4(){
		String _msg = "yicj" ;
		int _type = 1 ;
		try {
			
			bs.barB(_msg, _type);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//������
	public static void ����3(){
		bs.fooB(); 
	}
	
	///���Զ�
	public static void ����2(){
		
		as.barA();
	}
	///����һ
	public static void ����1(){
		String _msg = "yicj" ;
		as.fooA(_msg);
	}
	
	
	
	
	
}
