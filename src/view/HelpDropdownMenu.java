package view;

import java.awt.event.ActionListener;

import javafx.scene.input.Mnemonic;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import controller.AboutActionListener;
import controller.UnderConstrustion;

/**
 * Klasa implementira sve elemente meia {@link EditDropdownMenu}. Ovdje se
 * podesava ime, {@link Mnemonic} i {@link ActionListener} za svaku opciju u
 * ovom meniu.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class HelpDropdownMenu extends JMenu
{
    private static final long serialVersionUID = 1L;

    public HelpDropdownMenu()
    {
	super("Help");
	setMnemonic('H');
	JMenuItem rError = new JMenuItem("Report error");
	JMenuItem feedback = new JMenuItem("Give a feedback");
	JMenuItem keyboardshortcut = new JMenuItem("Keyboard shortcuts");
	JMenuItem tutorial = new JMenuItem("Tutorial");
	JMenuItem about = new JMenuItem("About", 65);

	add(rError);
	add(feedback);
	addSeparator();
	add(keyboardshortcut);
	add(tutorial);
	addSeparator();
	add(about);

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	about.addActionListener(new AboutActionListener());
	rError.addActionListener(new UnderConstrustion());
	feedback.addActionListener(new UnderConstrustion());
	keyboardshortcut.addActionListener(new UnderConstrustion());
	tutorial.addActionListener(new UnderConstrustion());

    }
}
