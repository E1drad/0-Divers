package english.mooc.swingbucks;

import java.awt.event.*;

class Espresso extends Beverage implements ActionListener
{
  private SwingBucks sb;

  public Espresso( SwingBucks sb, String description )
  {
    super( 1.0 );
    this.sb = sb;
    this.description = description;
  }

  public void actionPerformed( ActionEvent event )
  {
    sb.setBoisson( this );
    System.out.println( description );
  }
}