package english.mooc.swingbucks;

import java.awt.event.*;

class Colombia extends Beverage implements ActionListener
{
  private SwingBucks sb;

  public Colombia( SwingBucks sb, String description )
  {
    super( 1.2 );
    this.sb = sb;
    this.description = description;
  }

  public void actionPerformed( ActionEvent event )
  {
    sb.setBoisson( this );
    System.out.println( description );
  }
}