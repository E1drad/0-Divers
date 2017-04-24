package english.mooc.swingbucks;

import javax.swing.*;
import java.awt.*;

class SwingBucks
{
  private Beverage boisson;

  public void setBoisson( Beverage boisson )
  {
    this.boisson = boisson;
  }

  public Beverage getBoisson()
  {
    return boisson;
  }

  public boolean asBoisson()
  {
    return boisson != null;
  }

  public void prepareFrame()
  {
    JFrame	frame		= new JFrame	("SwingBucks");

    JButton	espresso	= new JButton	( "Espresso" );
    JButton	colombia	= new JButton	( "Colombia" );
    JButton	moka		= new JButton	( "Moka" );
    JButton	deca		= new JButton	( "Deca" );

    JButton	lait		= new JButton	( "Milk" );
    JButton	caramel		= new JButton	( "Caramel" );
    JButton	chocolat	= new JButton	( "Chocolate" );
    JButton	chantilly	= new JButton	( "Whipped cream" );

    JButton	total		= new JButton	( "Total" );
    JButton	raz		= new JButton	( "RAZ" );

    JPanel	mainPanel	= new JPanel	( new GridLayout( 0, 4, 10, 10 ));

    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    espresso.addActionListener( new Espresso( this, "Espresso" ) );
    colombia.addActionListener( new Colombia( this, "Colombia" ) );
    moka.addActionListener( new Moka( this, "Moka" ) );
    deca.addActionListener( new Deca( this, "Deca" ) );

    mainPanel.add( espresso );
    mainPanel.add( colombia );
    mainPanel.add( moka );
    mainPanel.add( deca );

    lait.addActionListener( new ButtonMilk( this ) );
    caramel.addActionListener( new ButtonCaramel( this ) );
    chocolat.addActionListener( new ButtonChocolat( this ) );
    chantilly.addActionListener( new ButtonWhippedCream( this ) );

    mainPanel.add( lait );
    mainPanel.add( caramel );
    mainPanel.add( chocolat );
    mainPanel.add( chantilly );

    total.addActionListener( new Total( this ) );
    raz.addActionListener( new RAZ( this ) );

    mainPanel.add( total );
    mainPanel.add( raz );

    frame.setContentPane( mainPanel );
    frame.setMinimumSize(new Dimension(620,150));
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String [] args)
  {
    SwingBucks action = new SwingBucks();
    action.prepareFrame();
  }
}
