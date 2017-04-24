package english.mooc.swingbucks;

abstract class Decorator extends Beverage{
	protected Beverage boisson;


	protected Decorator( double prix ){
		super( prix );
	}

	@Override
	public abstract double cost();

	@Override
	public abstract String getDescription();
}