package spring֪ͨ˳��;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	//�����һ����ִ�У�����׳��쳣�ˣ���ο��ܾͲ���ִ����.....
	public void afterReturn(JoinPoint jp){
		System.out.println("log afterReturn()..... method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());  
	}
	
	//���һ���ᱻִ�еģ��൱��finally����Ĵ���
	public void doAfter(JoinPoint jp) {  
        System.out.println("log doAfter()..... method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());  
    }  
	
	//doAround startһ���ᱻ��ӡ����,����doAround end������������˾Ͳ��ᱻ��ӡ����
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
    	System.out.println("doAround   start .......");
        long time = System.currentTimeMillis();  
        //ִ����ǰ��ҵ�񷽷�
        Object retVal = pjp.proceed();  
        time = System.currentTimeMillis() - time;  
        System.out.println("process time: " + time + " ms");  
        System.out.println("doAround() end .......");
        return retVal;  
    }  
    
    //һ���ᱻִ�У�������һ�����ڵ�һ������ӡ��������
    public void doBefore(JoinPoint jp) {  
        System.out.println("log doBefore()......... method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());  
    }  
    
    //ֻ�е��׳��쳣ʱ�Żᱻִ��
    public void doThrowing(JoinPoint jp, Throwable ex) {  
        System.out.println("method " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName() + " throw exception");  
        System.out.println(ex.getMessage());  
    }  
}
