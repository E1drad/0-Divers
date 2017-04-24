package english.mooc.firstIdea;

public class Colombia extends Beverage {
	private final double PRIXBASE;
	static int a;
	
	public int gat(){
		a = a + 1;
		return a;
	}
	
	public Colombia(){
		PRIXBASE = 1.2;
		milk = false;
		caramel = false;
		chocolate = false;
		sugar = false;
		salt = false;
		darkChocolate = false;
	}

	@Override
	public double cost(){
		return PRIXBASE +
				(milk ? 0.55 : 0) +
				(caramel ? 0.40 : 0) +
				(chocolate ? 0.40 : 0) +
				(sugar ? 1 : 0) + 
				(salt ? 1.5 : 0) + 
				(darkChocolate ? 2 : 0);
	}

	@Override
	public double getPrixBase() {
		return PRIXBASE;
	} 

	public static void main(String [] args){
		Colombia colombia = new Colombia();
		colombia.setMilk( true );
		colombia.setCaramel( true );

		System.out.println( "Price = " + colombia.cost() );
	}
}