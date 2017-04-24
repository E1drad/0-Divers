package english.mooc.swingbucks;

import java.awt.event.*;

public class ButtonCaramel implements ActionListener{
	private SwingBucks sb_;

	public ButtonCaramel(SwingBucks sb){
		sb_ = sb;
	}

	public void actionPerformed( ActionEvent event ){
		if( sb_.asBoisson() ){
			sb_.setBoisson( new Caramel( sb_.getBoisson(), "Caramel" ) );
			System.out.println( sb_.getBoisson().getDescription() );
		}else{
			System.out.println( "Error : select a beverage." );
		}
	}
}