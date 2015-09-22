package ผฬณะ;

public class SuperClassA {
	
	public SuperClassA(){
		System.out.println(this.getClass());
		this.sayHello();
	}

	public void sayHello(){
		System.out.println("super hello world");
	}
}
