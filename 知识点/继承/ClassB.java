package ผฬณะ;

public class ClassB extends SuperClassA {
	private String name ;
	public ClassB (String name){
		this.name = name ;
	}
	
	public ClassB(){
		
	}
	
	
	public static void main(String[] args) {
		String name = "yicj" ;
		ClassB b = new ClassB(name) ;
		
		
		
		
	}
	public void sayHello(){
		System.out.println("class b say world");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

}
