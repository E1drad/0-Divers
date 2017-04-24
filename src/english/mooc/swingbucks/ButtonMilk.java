package english.mooc.swingbucks;

import java.awt.event.*;

public class ButtonMilk implements ActionListener {
	private SwingBucks sb_;

	public ButtonMilk(SwingBucks sb) {
		sb_ = sb;
	}


	public void actionPerformed( ActionEvent event ){
		if( sb_.asBoisson() ) {
			sb_.setBoisson( new whippedCream( sb_.getBoisson(), "Milk" ) );
			System.out.println( sb_.getBoisson().getDescription() );
		}else{
			System.out.println( "Error : select a beverage." );
		}
	}
}