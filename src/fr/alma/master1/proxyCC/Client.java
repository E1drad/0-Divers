package fr.alma.master1.proxyCC;

import java.lang.reflect.Proxy;


public class Client {
	
	private static Class<?>[] concat(Class<?>[] interfaces, Class<?> class1) {
		Class<?>[] res;
		res = new Class<?>[interfaces.length + 1];
		for(int i = 0; i < res.length; ++i){
			if(i < interfaces.length){
				res[i] = interfaces[i];
			}else{
				res[i] = class1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		IPersonne pers = (IPersonne) getProxyFor(new Personne());
		pers.setNom("Paf");
		IObserver observer = new IObserver(){
			public void notify(Object source){
				System.out.println(source + " is modified");
			}
		};
		
		((IObservable) pers).setObserver(observer);
		pers.setNom("Piou");
	}

	private static Object getProxyFor(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				concat(target.getClass().getInterfaces(), IObservable.class),
				new ProxyExamen(target));
	}


}
