package english.mooc.swingbucks;

import java.awt.event.*;

public class Total implements ActionListener{
	private SwingBucks sb_;

	public Total( SwingBucks sb ){
		sb_ = sb;
	}

	public void actionPerformed( ActionEvent event ){
		if( sb_.asBoisson() ){
			System.out.println( sb_.getBoisson().cost() );
		}else{
			System.out.println( "Error : select a beverage." );
		}
	}
}