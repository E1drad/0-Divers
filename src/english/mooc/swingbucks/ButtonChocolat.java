package english.mooc.swingbucks;

import java.awt.event.*;

public class ButtonChocolat implements ActionListener {
	private SwingBucks sb_;

	public ButtonChocolat(SwingBucks sb) {
		sb_ = sb;
	}


	public void actionPerformed( ActionEvent event ){
		if( sb_.asBoisson() ) {
			sb_.setBoisson( new whippedCream( sb_.getBoisson(), "Chocolate" ) );
			System.out.println( sb_.getBoisson().getDescription() );
		}else{
			System.out.println( "Error : select a beverage." );
		}
	}
}