package ���߳�_��_��;

public class DecTask implements Runnable{
	private Resource res ;
	
	public DecTask(Resource res){
		this.res = res ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res.dec();
	}

}
