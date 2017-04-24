package english.mooc.swingbucks;

class Chocolat extends Decorator
{
  public Chocolat( Beverage boisson, String description )
  {
    super( 0.45 );
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