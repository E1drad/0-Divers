package english.mooc.swingbucks;

class Milk extends Decorator{
	public Milk( Beverage boisson, String description ){
		super( 0.25 );
		this.boisson = boisson;
		this.description = description;
	}

	@Override
	public double cost(){
		return boisson.cost() + PRICE;
	}

	@Override
	public String getDescription(){
		return boisson.getDescription() + " " + description;
	}
}