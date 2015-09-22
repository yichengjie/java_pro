package 多线程_加_减;

public class IncTask implements Runnable {
	
	private Resource res ;
	
	public IncTask(Resource res){
		this.res = res ;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res.inc();
	}

}
