package lamda;

public interface Inc1 {
	
	public void say() ;
	default void say2(){
		System.out.println("say2() .........");
	}
	
}
