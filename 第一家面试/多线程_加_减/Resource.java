package 多线程_加_减;

public class Resource {
	
	
	// 采用 Runnable 接口方式创建的多条线程可以共享实例属性   
	  
    private int i ;   
  
    // 同步增加方法   
  
    public synchronized void inc(){   
       i ++;   
       System. out .println(Thread.currentThread().getName()+ "--inc--" + i );  
  
    }   
  
    // 同步减算方法   
  
    public synchronized void dec(){   
       i --;   
       System. out .println(Thread.currentThread().getName()+ "--dec--" + i );  
  
    }   
  

}
