package fr.alma.master1.proxy;

public class MrPeluche implements ComportementHandler {

	@Override
	public String returnTypeIsString(String thong) {
		String[] slip = thong.split("");
		String culotte = "";
		for(String s : slip){
			if(s.equals("m")){
				s = " meow ";
			}else if(s.equals("p")){
				s = " pur ";
			}else if(s.equals("n")){
				s = " nyan ";
			}
			culotte = culotte + s;
		}
		return culotte;
	}

	@Override
	public Integer returnTypeIsInteger(Integer i) {
		return i.intValue()*5;
	}

}
