package english.mooc.firstIdea;

public abstract class Beverage{
	protected boolean milk;
	protected boolean caramel;
	protected boolean chocolate;
	protected boolean sugar;
	protected boolean salt;
	protected boolean darkChocolate;

	public boolean isDarkChocolate() {
		return darkChocolate;
	}
	public void setDarkChocolate(boolean darkChocolate) {
		this.darkChocolate = darkChocolate;
	}
	public boolean isSalt() {
		return salt;
	}
	public void setSalt(boolean salt) {
		this.salt = salt;
	}
	public boolean isSugar() {
		return sugar;
	}
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	abstract public double cost();
	abstract public double getPrixBase();

	public boolean hasMilk() {
		return milk;
	}
	public void setMilk( boolean milk ) {
		this.milk = milk;
	}

	public boolean hasCaramel() {
		return caramel;
	}
	public void setCaramel( boolean caramel ) {
		this.caramel = caramel;
	}

	public boolean hasChocolate() {
		return chocolate;
	}
	public void setChocolate( boolean chocolate ) {
		this.chocolate = chocolate;
	}

}