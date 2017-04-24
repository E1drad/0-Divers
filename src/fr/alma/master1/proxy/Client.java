package fr.alma.master1.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static Object proxyMain(Object obj, ComportementHandler cptmtHdl){
		if(cptmtHdl != null){
			return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
					concat(obj.getClass().getInterfaces(), MrPeluche.class.getInterfaces()),
					new LazyHandlerComportement(obj, cptmtHdl));
		}else{
			return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
					concat(obj.getClass().getInterfaces(), MrPeluche.class.getInterfaces()),
					new LazyHandlerComportement(obj));
		}
	}
	
	private static Class<?>[] concat(Class<?>[] interfaces, Class<?>[] class1) {
		Class<?>[] res;
		res = new Class<?>[interfaces.length + class1.length];
		for(int i = 0; i < res.length; ++i){
			if(i < interfaces.length){
				res[i] = interfaces[i];
			}else{
				res[i] = class1[i-interfaces.length];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		InterfacePersonne instance = (InterfacePersonne) Proxy.newProxyInstance(
				InterfacePersonne.class.getClassLoader(),
				new Class[] {InterfacePersonne.class},
				new LazyHandler(new Personne("Paf le chien", new Integer(40))));
		System.out.println(instance.getAge());
		System.out.println(instance.getNom());
		
		InterfacePersonne instanceComportement = (InterfacePersonne) Proxy.newProxyInstance(
				InterfacePersonne.class.getClassLoader(),
				new Class[] {InterfacePersonne.class},
				new LazyHandlerComportement
					(new Personne("martin le putois", new Integer(27)), new MrPeluche()));
		System.out.println(instanceComportement.getAge());
		System.out.println(instanceComportement.getNom());
	
		InterfacePersonne instanceComportementGenerique = new Personne("papillon moche", new Integer(38));
		instanceComportementGenerique = (InterfacePersonne) proxyMain(instanceComportementGenerique, new MrPeluche());

		for(int i = 0; i < instanceComportementGenerique.getClass().getInterfaces().length; ++i){
			System.out.println(instanceComportementGenerique.getClass().getInterfaces()[i].getName());
		}
		
		System.out.println(((InterfacePersonne) instanceComportementGenerique).getAge());
		System.out.println(((InterfacePersonne) instanceComportementGenerique).getNom());
	}
}
