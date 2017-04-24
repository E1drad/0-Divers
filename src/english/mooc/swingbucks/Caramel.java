package english.mooc.swingbucks;

class Caramel extends Decorator
{
  public Caramel( Beverage boisson, String description )
  {
    super( 0.4 );
    this.boisson = boisson;
    this.description = description;
  }

  @Override
  public double cost()
  {
    return boisson.cost() + PRICE;
  }

  @Override
  public String getDescription()
  {
    return boisson.getDescription() + " " + description;
  }
}