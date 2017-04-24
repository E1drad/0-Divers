package english.mooc.swingbucks;

import java.awt.event.*;

class RAZ implements ActionListener
{
  private SwingBucks sb_;
  
  public RAZ( SwingBucks sb )
  {
    sb_ = sb;
  }

  public void actionPerformed( ActionEvent event )
  {
    sb_.setBoisson( null );
  }
}