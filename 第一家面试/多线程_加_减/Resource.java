package ���߳�_��_��;

public class Resource {
	
	
	// ���� Runnable �ӿڷ�ʽ�����Ķ����߳̿��Թ���ʵ������   
	  
    private int i ;   
  
    // ͬ�����ӷ���   
  
    public synchronized void inc(){   
       i ++;   
       System. out .println(Thread.currentThread().getName()+ "--inc--" + i );  
  
    }   
  
    // ͬ�����㷽��   
  
    public synchronized void dec(){   
       i --;   
       System. out .println(Thread.currentThread().getName()+ "--dec--" + i );  
  
    }   
  

}
