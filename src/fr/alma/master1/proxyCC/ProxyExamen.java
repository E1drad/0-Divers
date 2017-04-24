package fr.alma.master1.proxyCC;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyExamen implements InvocationHandler {

	private Object target;
	private IObserver observer;

	public ProxyExamen(Object target) {
		this.target = target;
		this.observer = null;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret;
		if(method.getName().equals("setObserver")){
			//Ne fonctionne pas : java.lang.IllegalArgumentException: object is not an instance of declaring class
			//Parce que Personne et IPersonne n'ont pas de setObserver 
			//ret = method.invoke(this.target, args);
			
			//Fonctionne correctement
			ret = Void.TYPE;
			this.observer = (IObserver) args[0];
		}else if(method.getName().contains("set") && this.observer != null){
			ret = method.invoke(this.target, args);
			//this.observer.notify(this.target);
			System.out.println(target.getClass().getName() + " ["+ method.getName().substring(3) + "=" + args[0] + "] is modified");
		}else{
			ret = method.invoke(this.target, args);
		}
		return ret;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
}
