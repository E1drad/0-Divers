package english.mooc.swingbucks;

import java.awt.event.*;

class Deca extends Beverage implements ActionListener
{
  private SwingBucks sb;

  public Deca( SwingBucks sb, String description )
  {
    super( 0.85 );
    this.sb = sb;
    this.description = description;
  }

  public void actionPerformed( ActionEvent event )
  {
    sb.setBoisson( this );
    System.out.println( description );
  }
}
