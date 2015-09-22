package spring通知顺序;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	//这个不一定会执行，如果抛出异常了，这段可能就不会执行了.....
	public void afterReturn(JoinPoint jp){
		System.out.println("log afterReturn()..... method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());  
	}
	
	//这段一定会被执行的，相当于finally里面的代码
	public void doAfter(JoinPoint jp) {  
        System.out.println("log doAfter()..... method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());  
    }  
	
	//doAround start一定会被打印出来,但是doAround end如果方法报错了就不会被打印出来
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
    	System.out.println("doAround   start .......");
        long time = System.currentTimeMillis();  
        //执行以前的业务方法
        Object retVal = pjp.proceed();  
        time = System.currentTimeMillis() - time;  
        System.out.println("process time: " + time + " ms");  
        System.out.println("doAround() end .......");
        return retVal;  
    }  
    
    //一定会被执行，而且是一定会在第一个被打印出来出的
    public void doBefore(JoinPoint jp) {  
        System.out.println("log doBefore()......... method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());  
    }  
    
    //只有当抛出异常时才会被执行
    public void doThrowing(JoinPoint jp, Throwable ex) {  
        System.out.println("method " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName() + " throw exception");  
        System.out.println(ex.getMessage());  
    }  
}
