package fr.alma.master1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LazyHandler implements InvocationHandler {
	private Object target;
	
	public LazyHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object res;
		res = method.invoke(this.target, args);
		if(res instanceof Integer){
			res = ((Integer) res).intValue() + 10;
			System.out.println("Changement");
		}
		System.out.print("Il dit : ");
		
		return res;
	}

}
