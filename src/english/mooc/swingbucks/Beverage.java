package english.mooc.swingbucks;

public abstract class Beverage{
	protected String description;
	protected final double PRICE;


	protected Beverage( double prix ){
		PRICE = prix;
	}

	public double cost(){
		return PRICE;
	}

	public String getDescription(){
		return description;
	}
}
