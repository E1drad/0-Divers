package english.mooc.swingbucks;

class whippedCream extends Decorator
{
  public whippedCream( Beverage boisson, String description )
  {
    super( 0.30 );
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