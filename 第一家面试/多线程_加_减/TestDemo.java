package ���߳�_��_��;

public class TestDemo {

	public static void main(String[] args) {
		Resource res = new Resource() ;
		for(int i = 0 ; i < 2 ; i ++){
			new Thread(new IncTask(res)).start(); 
			new Thread(new DecTask(res)).start(); ;
		}
	}

}
