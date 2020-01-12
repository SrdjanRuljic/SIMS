package main;

import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Osnovna klasa koja sadrzi main metodu. Poziva se {@link MainFrame} i pdešava
 * se naslov, velicina i postupak pri zatvaranju glavnog prozora aplikacije.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class MainClass
{

    public static void main(String[] args) throws InstantiationException,
	    IllegalAccessException, ClassNotFoundException,
	    UnsupportedLookAndFeelException
    {
	MainFrame mainFrame = new MainFrame();
	mainFrame.setVisible(true);
	mainFrame.setTitle("Editor");
	mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
