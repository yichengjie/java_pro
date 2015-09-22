package ·ºÐÍ1;

import java.lang.reflect.Type;

class Test {
	
}
  
public class RawDao1 extends RawDao<Test> {
    public RawDao1() {
  
    }
    
    public void hello (){
    	Type genericSuperclass = this.getClass().getGenericSuperclass();
    	System.out.println("||||||||||||||||||||||");
    	System.out.println(genericSuperclass);
    	System.out.println("||||||||||||||||||||||");
    	
    }
    
  
    public static void main(String[] args) {
    	RawDao1 rd = new RawDao1() ;
    	Class<Test> entityClass2 = rd.getEntityClass();
        System.out.println(entityClass2);
        rd.hello(); 
        
    }
}