package ¼Ì³Ð¼°¾²Ì¬¿é;

public class A {
	
	public A(){
		
		System.out.println("init A ()");
	}
	
	{
		System.out.println(" A {} ");
	}
	
	static {
		
		System.out.println("A  static ");
	}
	
	
	public static void main(String[] args) {
		new A() ;
	}
	

}
