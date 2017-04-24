package fr.alma.master1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LazyHandlerComportement implements InvocationHandler {
	private Object target;
	private ComportementHandler comportement; 
	private boolean active;
	
	public LazyHandlerComportement(Object target) {
		super();
		this.target = target;
		this.active = true;
	}
	
	public LazyHandlerComportement(Object target, ComportementHandler comportement) {
		super();
		this.target = target;
		this.comportement = comportement;
		this.active = true;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnValue;
		returnValue = method.invoke(this.target, args);
		if(this.comportement != null && this.active){
			if(returnValue instanceof Integer){
				returnValue = this.comportement.returnTypeIsInteger((Integer) returnValue);
			}else if(returnValue instanceof String){
				returnValue = this.comportement.returnTypeIsString((String) returnValue);
			}
		}else{
			if(returnValue instanceof Integer){
				returnValue = ((Integer) returnValue).intValue() + 10;
				System.out.println("Changement");
			}
		}
		System.out.print("Il dit : ");
		return returnValue;
	}
}
