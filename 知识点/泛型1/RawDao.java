package 泛型1;

import java.lang.reflect.ParameterizedType ;
import java.lang.reflect.Type;

public class RawDao<T> {
    Class<T> entityClass = null;
    public RawDao() {
    	
    	Class<?> clazz = this.getClass() ;
    	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	System.out.println(clazz);
    	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	System.out.println("+++++++++++++++++++++++++++");
    	System.out.println(clazz.getGenericInterfaces());
    	System.out.println("+++++++++++++++++++++++++++");
    	
    	System.out.println("---------------------");
    	System.out.println(clazz.getSuperclass());//class 泛型1.RawDao
    	System.out.println("---------------------");
    	Type genericSuperclass = clazz.getGenericSuperclass();
    	System.out.println("**********************");
    	System.out.println(genericSuperclass);//泛型1.RawDao<泛型1.Test>
    	System.out.println("**********************");
    	ParameterizedType pt = (ParameterizedType)genericSuperclass ;
    	Type[] actualTypeArguments = pt.getActualTypeArguments();
    	entityClass = (Class<T>) actualTypeArguments[0] ;
    }
  
    public Class<T> getEntityClass() {
        return entityClass;
    }
  
}



