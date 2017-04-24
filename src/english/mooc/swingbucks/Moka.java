package english.mooc.swingbucks;

import java.awt.event.*;

class Moka extends Beverage implements ActionListener
{
  private SwingBucks sb;

  public Moka( SwingBucks sb, String description )
  {
    super( 1.4 );
    this.sb = sb;
    this.description = description;
  }

  public void actionPerformed( ActionEvent event )
  {
    sb.setBoisson( this );
    System.out.println( description );
  }
}